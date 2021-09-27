package com.company;

public class LogInListener implements EventListener{
    public void update(String data) {
        System.out.println("EVENT: " + data + " just logged in");
    }
}
