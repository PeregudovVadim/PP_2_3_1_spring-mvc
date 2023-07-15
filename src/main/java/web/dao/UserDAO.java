package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> findAllUser();

    void createUser(User user);

    void updateUser(User user,long id);

    User findById(long id);

    User deleteUser(long id) throws NullPointerException;
}
