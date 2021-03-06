package IETILab1.IETILab1.service.Impl;

import IETILab1.IETILab1.data.User;
import IETILab1.IETILab1.service.UserService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceHashMap implements UserService
{
    private HashMap<String, User> users;

    public UserServiceHashMap()
    {
        users = new HashMap();
    }

    @Override
    public User create(User user)
    {
        return users.put(user.getId(), user);
    }

    @Override
    public User findById(String id)
    {
        return users.get(id);
    }

    @Override
    public List<User> all()
    {
        return new ArrayList<User>(users.values());
    }

    @Override
    public void deleteById(String id)
    {
        users.remove(id);
    }

    @Override
    public User update(User user, String userId) {
        users.put(userId, user);
        return users.get(userId);
    }
}
