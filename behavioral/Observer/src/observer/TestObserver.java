package observer;

import observer.component.Observer;
import observer.component.StudentObserver;
import observer.component.TeacherObserver;
import observer.messaging.CourseSubject;
import observer.messaging.Subject;
import observer.service.CourseService;

public class TestObserver {

    public static void main(String[] args) {

        Subject courseSubject = new CourseSubject();
        CourseService courseService = new CourseService(courseSubject);

        Observer student = new StudentObserver();
        Observer teacher = new TeacherObserver();

        courseSubject.register(student);
        courseSubject.register(teacher);

        courseService.addCourse("math");
        courseService.addCourse("literature");

        courseSubject.unregister(teacher);
        courseService.deleteCourse("literature");
    }

}
