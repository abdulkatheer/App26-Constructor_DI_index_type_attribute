package org.katheer.test;

import org.katheer.bean.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("org/katheer/resource/applicationContext.xml");

        Course c1 = (Course) context.getBean("course1");
        c1.getCourseDetails();

        Course c2 = (Course) context.getBean("course2");
        c2.getCourseDetails();

        Course c3 = (Course) context.getBean("course3");
        c3.getCourseDetails();

        Course c4 = (Course) context.getBean("course4");
        c4.getCourseDetails();
    }
}
