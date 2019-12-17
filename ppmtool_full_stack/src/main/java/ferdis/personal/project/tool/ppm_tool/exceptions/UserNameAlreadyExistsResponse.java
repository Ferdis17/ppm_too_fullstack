package ferdis.personal.project.tool.ppm_tool.exceptions;

public class UserNameAlreadyExistsResponse {

    private String userName;

    public UserNameAlreadyExistsResponse(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
