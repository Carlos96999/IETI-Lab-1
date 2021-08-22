package IETILab1.IETILab1.service;


import IETILab1.IETILab1.data.User;
import java.util.List;

public interface UserService
{
    public User create(User user);

    public User findById(String id);

    public List<User> all();

    public void deleteById(String id);

    public User update(User user, String userId);
}
