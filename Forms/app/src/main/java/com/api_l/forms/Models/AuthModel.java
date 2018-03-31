package com.api_l.forms.Models;

/**
 * Created by ahmed on 2/20/18.
 */

public class AuthModel {
    private String UserAcadmicID;
    private  String UserPass;

    public AuthModel(String s, String s1) {
        this.setUserEmail(s);
        this.setUserPass(s1);
    }


    public String getUserEmail() {
        return UserAcadmicID;
    }

    public void setUserEmail(String userEmail) {
        UserAcadmicID = userEmail;
    }

    public String getUserPass() {
        return UserPass;
    }

    public void setUserPass(String userPass) {
        UserPass = userPass;
    }
}
