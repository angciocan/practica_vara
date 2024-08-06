import {Component, OnInit} from '@angular/core';
import {User} from "../../interfaces/user";
import {Student} from "../../interfaces/student";
import {Teacher} from "../../interfaces/teacher";
import {Admin} from "../../interfaces/admin";
import {StudentService} from "../../services/student.service";
import {SelectedUserService} from "../../services/selected-user.service";
import {CommonModule} from "@angular/common";
import {TeacherService} from "../../services/teacher.service";
import {AdministratorService} from "../../services/administrator.service";
import {Course} from "../../interfaces/course";

@Component({
  selector: 'app-user',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './user.component.html',
  styleUrl: './user.component.scss'
})
export class UserComponent implements OnInit{
  students: Student[] = [];
  teachers: Teacher[] = [];
  admins: Admin[] = [];
  courses: Course[] = [];
  user: User | null = null;

  constructor(
    private studentService: StudentService,
    private teacherService: TeacherService,
    private administratorService: AdministratorService,
    private selectedUserService: SelectedUserService
  ) {}

  ngOnInit(): void {
    this.loadUsers();
    this.user = this.selectedUserService.getSelectedUser()
    if (this.user) {
      this.loadUserCourses(this.user);
      console.log(this.user)
    }
  }

  loadUsers(): void {
    this.studentService.getAllStudents().subscribe(data => this.students = data);
    this.teacherService.getAllTeachers().subscribe(data => this.teachers = data);
    this.administratorService.getAllAdministrators().subscribe(data => this.admins = data);
  }

  selectUser(user: User): void {
    this.selectedUserService.setSelectedUser(user);
    this.loadUserCourses(user);
  }

  clearSelectedUser(): void {
    this.selectedUserService.clearSelectedUser();
    this.courses = [];
  }

  getSelectedUser(): User | null {
    return this.selectedUserService.getSelectedUser();
  }

  private loadUserCourses(user: User): void {
    if (user.role === 'student') {
      this.loadCoursesForStudent(user.id);
      console.log(this.user)
    } else if (user.role === 'teacher') {
      this.courses = (user as Teacher).courses;
      console.log(this.courses)
    } else {
    }
  }

  private loadCoursesForStudent(studentId: number): void {
    this.studentService.getCoursesForStudent(studentId).subscribe(courses => {
      this.courses = courses;
      console.log(this.courses)
    });
  }

}
