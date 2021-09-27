package com.company;

public class Auth {
    public EventManager events;

    public Auth() {
        this.events = new EventManager();
    }

    public void logIn(String username) {
        this.events.notifySubscribers(EventType.LoggedIn, username);
    }

    public void logOut(String username) {
        this.events.notifySubscribers(EventType.LoggedOut, username);
    }
}
