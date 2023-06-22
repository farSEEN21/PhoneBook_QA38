package model;

public class User {
    String email;
    String psw;

//    public User(String email, String psw) {
//        this.email = email;
//        this.psw = psw;
//    }

    public String getEmail() {
        return email;
    }

    public String getPsw() {
        return psw;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setPsw(String psw) {
        this.psw = psw;



    }    public User withEmail(String email) {
        this.email = email;
        return this;
    }

    public User withPsw(String psw) {
        this.psw = psw;
        return this;
    }
}
