package com.company;

public class LogOutListener implements EventListener{
    public void update(String data) {
        System.out.println("EVENT: " + data + " just logged out");
    }
}
