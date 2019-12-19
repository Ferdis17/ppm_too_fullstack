package ferdis.personal.project.tool.ppm_tool.payLoad;

import javax.validation.constraints.NotBlank;

public class LoginRequest {

    @NotBlank(message = "Username cannot be blank")
    private String userName;
    @NotBlank(message = "Password cannot be blank")
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
