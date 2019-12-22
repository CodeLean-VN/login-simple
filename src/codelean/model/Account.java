package codelean.model;

public class Account {
    private String email;
    private String fullname;
    private String password;

    public Account() {
    }

    public Account(String email, String fullname, String password) {
        this.email = email;
        this.fullname = fullname;
        this.password = password;
    }

    public Account(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}

