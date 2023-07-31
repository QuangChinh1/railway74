package backend.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import entity.User;

public interface IUserService {

	List<User> finallEmployee(int projectId) throws SQLException, IOException;

	List<User> Manager() throws SQLException, IOException;

	User login(String email, String password) throws SQLException, IOException;

}