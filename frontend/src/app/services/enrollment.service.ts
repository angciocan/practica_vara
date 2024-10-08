import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {Student} from "../interfaces/student";
import {HttpClient} from "@angular/common/http";
import {Course} from "../interfaces/course";
import {Enrollment} from "../interfaces/enrollment";

@Injectable({
  providedIn: 'root'
})
export class EnrollmentService {
  private apiUrl = 'http://localhost:8080/enrollment'

  constructor(private http: HttpClient) { }

  getNrOfApplicationsForCourse(courseId: number): Observable<number> {
    return this.http.get<number>(`${this.apiUrl}/nr-of-current-applications/${courseId}`);
  }
  getStudentsEnrolledToCourse(courseId:number): Observable<Student[]>{
    return this.http.get<Student[]>(`${this.apiUrl}/students-enrolled-to-course/${courseId}`)
  }
  getStudentPendingEnrollmentToCourse(courseId:number): Observable<Student[]>{
    return this.http.get<Student[]>(`${this.apiUrl}/students-pending-enrollment-to-course/${courseId}`)
  }

  getEnrollment(studentId:number, courseId:number): Observable<Enrollment>{
    return this.http.get<Enrollment>(`${this.apiUrl}/get-enrollment/${studentId}/${courseId}`)
  }
  getPendingEnrollments(): Observable<Enrollment[]>{
    return this.http.get<Enrollment[]>(`${this.apiUrl}/pendingEnrollments`)
  }

  createEnrollment(studentId: number, courseId: number): Observable<void> {
    const body = { studentId, courseId };
    return this.http.post<void>(`${this.apiUrl}/create`, body);
  }

  getCoursesForStudent(studentId: number): Observable<Course[]> {
    return this.http.get<Course[]>(`${this.apiUrl}/courses-of-the-student/${studentId}`);
  }

  getCoursesForTeacher(teacherId: number): Observable<Course[]> {
    return this.http.get<Course[]>(`${this.apiUrl}/courses-of-the-student/${teacherId}`);
  }
}
