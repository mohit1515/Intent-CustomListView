package com.example.mohit.studetails;

public class SingleRowCode2 {
    String name,course,mobile,emailid,bloodgroup;
    int image;

    public SingleRowCode2(String name, String course, String mobile, int image,String bloodgroup, String emailid) {
        this.name = name;
        this.course = course;
        this.mobile = mobile;
        this.bloodgroup = bloodgroup;
        this.emailid = emailid;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmailid() {
        return emailid;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public int getImage() {
        return image;
    }
}
