package IETILab1.dto;

import java.util.HashMap;

public class UserDto
{
    private String name;
    private String lastName;
    private String email;
    private String createdAt;

    public UserDto(String name, String lastName, String email, String createdAt)
    {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String LastName) {
        this.lastName = LastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCreatedAt(String CreatedAt) {
        this.createdAt = CreatedAt;
    }
}
