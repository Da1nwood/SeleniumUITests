package app.pages;

import app.Field;
import app.FieldManager;
import app.ICsvPath;
import app.Page;

import java.io.IOException;
import java.util.UUID;

public class LoginPage extends Page{

    public Field signUp() {
        return field("signUp");
    }
    public Field username(){
        return field("username");
    }
    public Field password(){
        return field("password");
    }
    public Field email(){
        return field("email");
    }

    public Field acceptRegistrationButton(){
        return field("acceptRegistrationButton");
    }
}
