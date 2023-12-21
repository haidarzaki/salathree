package salathree.belajar.spring.core.payloads.request;

import jakarta.annotation.Nullable;

public class UserRequest(){
    private String Username;
    private String email;
    private String password;
    @Nullable private int role;

    public UserRequest(){}

    public User(String IDUser, String username, String email, String password){
        this.IDUser = IDUser;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String Email){
        this.email = Email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String Password){
        this.password = Password;
    }
}