package org.geektimes.projects.user.service;

import org.geektimes.projects.user.domain.User;
import org.geektimes.projects.user.repository.DatabaseUserRepository;
import org.geektimes.projects.user.repository.UserRepository;

import java.sql.SQLException;

/**
 * @ClassName: UserServiceImpl
 * @Description:
 * @Author: Hades
 * @created: 2021/03/02 23:28
 * @Version:1.0
 */
public class UserServiceImpl implements UserService {

    private UserRepository userRepository = new DatabaseUserRepository();

    @Override
    public boolean register(User user) throws SQLException, ClassNotFoundException {
        return userRepository.save(user);
    }

    @Override
    public boolean deregister(User user) {
        return false;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public User queryUserById(Long id) {
        return null;
    }

    @Override
    public User queryUserByNameAndPassword(String name, String password) {
        return null;
    }
}
