package models.pojo;


public class User {

    private int id;
    private int id_personal;
    private String login;
    private String password;
    private String role;
    private String email;

    public User(int id,  int id_personal, String login, String password, String role, String email) {
        this.id = id;
       this.id_personal = id_personal;
        this.login = login;
        this.password = password;
        this.role = role;
        this.email = email;
    }


    public User() {
    }

    public int getId_personal() {
        return id_personal;
    }

    public void setId_personal(int id_personal) {
        this.id_personal = id_personal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
