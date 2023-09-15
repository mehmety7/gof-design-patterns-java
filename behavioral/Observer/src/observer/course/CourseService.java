package observer.course;

import observer.core.GenericDaoService;

public class CourseService implements GenericDaoService<String> {

    private final CourseTopic courseTopic;

    public CourseService(CourseTopic courseTopic) {
        this.courseTopic = courseTopic;
    }

    @Override
    public void doCreate(String course) {
        String message = "Added new course: " + course;
        System.out.println("[CourseService] " + message);
        courseTopic.postAnnouncement(message);
    }

}
