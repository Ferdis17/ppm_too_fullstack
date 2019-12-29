package ferdis.personal.project.tool.ppm_tool.exceptions;

public class InvalidLoginResponse {

    private String userName;
    private String password;

    public InvalidLoginResponse(){

    }

    public InvalidLoginResponse(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}