package bg.softuni.homerestate.models.view;

import bg.softuni.homerestate.models.entities.UserRoleEntity;

import java.util.ArrayList;
import java.util.List;

public class UserViewModel {
    private String username;
    private String fullName;
    private String password;
    private String email;
    private List<UserRoleEntity> roles=new ArrayList<>();

    public UserViewModel() {
    }

    public String getUsername() {
        return username;
    }

    public UserViewModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public UserViewModel setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserViewModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserViewModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public List<UserRoleEntity> getRoles() {
        return roles;
    }

    public UserViewModel setRoles(List<UserRoleEntity> roles) {
        this.roles = roles;
        return this;
    }
}
