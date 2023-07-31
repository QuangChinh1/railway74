package backend.repository;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Utils.JDBCutils;
import entity.Employee;
import entity.Manager;
import entity.User;
import entity.User.Role;

public class UserRepository implements IUserRepository  {


	@Override
	public List<User> finallEmployee( int projectId) throws SQLException, IOException{
		JDBCutils JDBCutils = new JDBCutils();
		Connection connection = JDBCutils.getConnection();
		String sql = "select * from `user` where project_id = ?";
		PreparedStatement pStmt = connection.prepareStatement(sql);
		List<User> users = null;
		ResultSet rs = null;
		rs = pStmt.executeQuery();
		users = new ArrayList<User>();
		pStmt.setInt(1, projectId);
		while(rs.next()) {
			int id = rs.getInt("id");
			String fullName = rs.getString("full_name");
			String email = rs.getString("email");
			String password = rs.getString("`password`");
			User.Role role = User.Role.valueOf(rs.getString("`role`"));
			if(role==Role.EMPLOYEE) {
				String proSkill = rs.getString("pro_skill");
				User user = new Employee(id, fullName, email, password, role, projectId, proSkill);
				users.add(user);
			}
			
		}
		connection.close();
		rs.close();
		pStmt.close();
		return users;
	}
	
	@Override
	public List<User> Manager() throws SQLException, IOException{
		JDBCutils JDBCutils = new JDBCutils();
		Connection connection = JDBCutils.getConnection();
		String sql = "select * from `user`";
		PreparedStatement pStmt = connection.prepareStatement(sql);
		List<User> users = null;
		ResultSet rs = null;
		rs = pStmt.executeQuery();
		users = new ArrayList<User>();
		while(rs.next()) {
			int id = rs.getInt("id");
			String fullName = rs.getString("full_name");
			String email = rs.getString("email");
			String password = rs.getString("`password`");
			int projectId = rs.getInt("project_id");
			User.Role role = User.Role.valueOf(rs.getString("`role`"));
			if(role==Role.MANAGER) {
				int expInYear = rs.getInt("pro_skill");
				User user = new Manager(id, fullName, email, password, role, projectId, expInYear);
				users.add(user);
			}
			
		}
		connection.close();
		rs.close();
		pStmt.close();
		return users;
	}
	
	@Override
	public User login(String email, String password) throws SQLException, IOException {
		JDBCutils JDBCutils = new JDBCutils();
		Connection connection = JDBCutils.getConnection();
		String sql = "select * from `user` where email = ? and where `password` = ?";
		PreparedStatement pStmt = connection.prepareStatement(sql);
		ResultSet rs = null;
		rs = pStmt.executeQuery(sql);
		pStmt.setString(1, email);
		pStmt.setString(1, password);
		if(rs.next()) {
			int id = rs.getInt("id");
			String fullName = rs.getString("full_name");
			User.Role role = User.Role.valueOf(rs.getString("`role`"));
			int projectId = rs.getInt("project_id");
			if(role==Role.MANAGER) {
				int expInYear = rs.getInt("exp_in_year");
				return  new Manager(id, fullName, email, password, role, projectId, expInYear);
			}else {
				String proSkill = rs.getString("pro_skill");
				return  new Employee(id, fullName, email, password, role, projectId, proSkill);
			}
		}
		return null;
	}
}
