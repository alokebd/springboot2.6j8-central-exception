package com.vision.api.exception;

import com.vision.api.entity.User;

public class UserNotFoundException  extends Exception{
    private static final long serialVersionUID = 1L;

	private String username;

    public UserNotFoundException(String username) {
        super("The user with username" + username+ "was not found");

    }

    public String getUsername(){
        return username;
    }

    public String[] getAvailableNames(User[] members) {       
        String[] unames = new String[members.length];
        for (int i = 0; i < members.length; i++) {
            unames[i] = members[i].getName();
        }
        return unames;
    }

}
