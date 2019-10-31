package com.basics.java;

import com.basics.echo.Meeting;

public class Organizer {
    boolean closeMeeting(Meetings meeting) {
        if (meeting.canClose) {
            return meeting.close();
        }
        return false;
    }

    public static void main(String[] args) {
        Organizer org = new Organizer();
        // it'll compile okay
        // obvious null pointer exception
        // it'll die at the point of calling closeMeeting
        org.closeMeeting(null);
    }
}

class Meetings {

    public boolean canClose;

    public boolean close() {
        return false;
    }





}
