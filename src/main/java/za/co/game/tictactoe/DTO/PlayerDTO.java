package za.co.game.tictactoe.DTO;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;



@Getter
@Setter
public class PlayerDTO {

    @NotNull
    private String userName;
    @NotNull
    private String password;
    @NotNull
    private String email;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
