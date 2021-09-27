package com.company;

public class Main {

    public static void main(String[] args) {
	    Auth auth = new Auth();

	    LogInListener logInListener = new LogInListener();
	    auth.events.subscribe(logInListener, EventType.LoggedIn);
	    auth.logIn("zhans");

	    LogOutListener logOutListener = new LogOutListener();
	    auth.events.subscribe(logOutListener, EventType.LoggedOut);
	    auth.logOut("zhans");

	    auth.events.unsubscribe(logInListener);
		auth.logIn("zhans");
    }
}
