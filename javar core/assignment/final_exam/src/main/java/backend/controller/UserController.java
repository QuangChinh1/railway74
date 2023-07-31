package backend.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import backend.service.IUserService;
import backend.service.UserService;
import entity.User;

public class UserController implements IUserController{
	private IUserService service = new UserService();

	@Override
	public List<User> finallEmployee(int projectId) throws SQLException, IOException {

		return service.finallEmployee(projectId);
		
}
	

	@Override
	public List<User> Manager() throws SQLException, IOException{
		return service.Manager();
	}
	

	@Override
	public User login(String email, String password) throws SQLException, IOException {
		return service.login(email, password);
	}

}