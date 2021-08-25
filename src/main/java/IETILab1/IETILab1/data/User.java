package IETILab1.IETILab1.data;

import IETILab1.IETILab1.dto.UserDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import java.util.Date;
import java.util.UUID;

public class User
{
    private final String id;
    private String name;
    private String lastName;
    private String email;
    @JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd")
    private Date createdAt;

    public User(String id, String name, String lastName, String email, Date createdAt)
    {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public User(UserDto userDto) {
        this.id = UUID.randomUUID().toString();
        this.name = userDto.getName();
        this.email = userDto.getEmail();
        this.lastName = userDto.getLastName();
    }

    public User(UserDto userDto, String id) {
        this.id = id;
        this.name = userDto.getName();
        this.email = userDto.getEmail();
        this.lastName = userDto.getLastName();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String LastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
