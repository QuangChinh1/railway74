package backend.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import backend.repository.UserRepository;
import entity.User;

public class UserService implements IUserService   {
	private UserRepository repository = new UserRepository();

	@Override
	public List<User> finallEmployee(int projectId) throws SQLException, IOException {
		return repository.finallEmployee(projectId);
	}
	

	@Override
	public List<User> Manager() throws SQLException, IOException{
		return repository.Manager();
	}
	

	@Override
	public User login(String email, String password) throws SQLException, IOException {
		return repository.login(email, password);
	}
}
