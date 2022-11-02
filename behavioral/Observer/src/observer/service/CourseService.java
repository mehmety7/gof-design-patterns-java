package observer.service;

import observer.messaging.Subject;

public class CourseService {

    private final Subject courseSubject;

    public CourseService(Subject courseSubject) {
        this.courseSubject = courseSubject;
    }

    public void addCourse(String course) {
        String message = "Added new course: " + course;
        System.out.println("[CourseService] " + message);
        courseSubject.setUpdate(message);
    }

    public void deleteCourse(String course) {
        String message = "Deleted course: " + course;
        System.out.println("[CourseService] " + message);
        courseSubject.setUpdate(message);
    }
}
