package web.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.model.User;
import web.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getAllUser() {
        return userDAO.findAllUser();
    }

    @Override
    public User getUserById(long id) {
        return userDAO.findById(id);
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.createUser(user);
    }

    @Override
    @Transactional
    public void updateUser(User user, long id) {
        userDAO.updateUser(user, id);
    }

    @Override
    @Transactional
    public void deleteUserById(Long id) {
        userDAO.deleteUser(id);
    }
}
