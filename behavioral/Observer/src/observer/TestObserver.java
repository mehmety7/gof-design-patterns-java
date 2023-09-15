package observer;

import observer.course.CourseService;
import observer.course.CourseTopic;
import observer.course.Student;
import observer.course.Teacher;

public class TestObserver {

    public static void main(String[] args) {
        CourseTopic courseTopic = new CourseTopic();
        Student student1 = new Student();
        Student student2 = new Student();
        Teacher teacher = new Teacher();
        CourseService courseService = new CourseService(courseTopic);

        courseTopic.addObserver(teacher);
        courseTopic.addObserver(student1);
        courseTopic.addObserver(student2);

        courseTopic.postAnnouncement("Welcome all");
        courseTopic.removeObserver(student2);

        courseService.doCreate("Math");
    }

}
