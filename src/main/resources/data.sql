insert into enrollment_period(id, is_open) values (1, false);


insert into student(grade,study_year,faculty_section,name) values (10,4,'CTI','Robert');
insert into student(grade,study_year,faculty_section,name) values (7,3,'CTI','Angelo');
insert into student(grade,study_year,faculty_section,name) values (8,2,'IS','Mircea');
insert into student(grade,study_year,faculty_section,name) values (9,2,'CTI-EN','Marian');

insert into teacher(name) values ('Nicolina');

insert into administrator(name) values ('BOSS');

insert into course(day_of_week,max_students,study_year,time,teacher_id,category,course_name)
values (2,99,2,'15:00',1,'mandatory','fizica');

insert into course(day_of_week,max_students,study_year,time,teacher_id,category,course_name)
values (3,99,2,'15:00',1,'mandatory','electrotehnica');

insert into course(day_of_week,max_students,study_year,time,teacher_id,category,course_name)
values (5,50,2,'15:00',1,'mandatory','electronica');

insert into course(day_of_week,max_students,study_year,time,teacher_id,category,course_name)
values (4,23,2,'17:00',1,'mandatory','bazele programarii');

insert into course(day_of_week,max_students,study_year,time,teacher_id,category,course_name)
values (4,23,3,'17:00',1,'mandatory','programare web');

insert into course(day_of_week,max_students,study_year,time,teacher_id,category,course_name)
values (4,23,3,'17:00',1,'mandatory','sisteme de operare');

insert into course(day_of_week,max_students,study_year,time,teacher_id,category,course_name)
values (4,23,3,'17:00',1,'mandatory','retele de calculatoare');

insert into course(day_of_week, max_students, study_year, time, teacher_id, category, course_name)
values (2, 25, 4, '10:00', 1, 'mandatory', 'advanced programming');

insert into course(day_of_week, max_students, study_year, time, teacher_id, category, course_name)
values (3, 25, 4, '10:00', 1, 'mandatory', 'software engineering');

insert into course(day_of_week,max_students,study_year,time,teacher_id,category,course_name)
values (5,23,2,'17:00',1,'elective','microeconomie');

insert into course(day_of_week,max_students,study_year,time,teacher_id,category,course_name)
values (6,1,2,'17:00',1,'elective','management');

insert into course(day_of_week,max_students,study_year,time,teacher_id,category,course_name)
values (4,1,3,'17:00',1,'elective','baze de date');

insert into course(day_of_week,max_students,study_year,time,teacher_id,category,course_name)
values (2,23,3,'17:00',1,'elective','bazele programarii 2');

insert into course(day_of_week,max_students,study_year,time,teacher_id,category,course_name)
values (3,23,3,'17:00',1,'elective','programare web 2');

insert into course(day_of_week,max_students,study_year,time,teacher_id,category,course_name)
values (3,23,3,'17:00',1,'elective','programare web 3');

insert into enrollment_administration(nr_of_mandatory_courses,nr_of_elective_courses, study_year)
values (4,2, 2);

insert into enrollment_administration(nr_of_mandatory_courses,nr_of_elective_courses, study_year)
values (3,3, 3);

insert into enrollment_administration(nr_of_mandatory_courses,nr_of_elective_courses, study_year)
values (2,4, 4);


