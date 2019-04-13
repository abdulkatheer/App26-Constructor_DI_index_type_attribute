package org.katheer.bean;

public class Course {
    private String cname;
    private String cid;
    private int ccost;

    public Course(String cname, String cid) {
        this.cid = cid;
        this.cname = cname;
    }

    public Course(String cname, String cid, int ccost) {
        this.cid = cid;
        this.cname = cname;
        this.ccost = ccost;
    }

    public void getCourseDetails() {
        System.out.println("Course Details:");
        System.out.println("---------------");
        System.out.println("Course Name : " + this.cname);
        System.out.println("course ID   : " + this.cid);
        System.out.println("Course Cost : " + this.ccost);
        System.out.println();
    }
}
