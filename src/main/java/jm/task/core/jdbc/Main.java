package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl user = new UserServiceImpl();

        user.createUsersTable();

        user.saveUser("Hop", "Lusk", (byte) 32);
        user.saveUser("Pot", "Ployt", (byte) 14);
        user.saveUser("Huhl", "Aoutr", (byte) 33);
        user.saveUser("Lopt", "Gont", (byte) 35);

        List<User> users = user.getAllUsers();
        System.out.println(users);
//
        user.cleanUsersTable();

        user.dropUsersTable();
    }
}
