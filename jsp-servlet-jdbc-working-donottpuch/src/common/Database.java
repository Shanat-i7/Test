package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Database {
	/*
	 * private static final String DRIVER = "com.mysql.jdbc.Driver"; private static
	 * final String URL = "jdbc:mysql://localhost:3306/test"; private static final
	 * String USERNAME = "root"; private static final String PASSWORD = "root";
	 */

	private static final String DRIVER = "org.postgresql.Driver";
	private static final String URL = "jdbc:postgresql://localhost:5432/postgres";// ?password=root";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "root";

	private static Connection connection = null;

	public static Connection getConnection() {
		if (connection == null) {
			try {
				// Loading The Driver Class
				Class.forName(DRIVER);

				// Getting the connection Object
				connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
		return connection;
	}

	public Connection tiktok() {
		if (connection == null) {
			try {
				// Loading The Driver Class
				Class.forName("org.postgresql.Driver");

				// Getting the connection Object
				connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
		return connection;
	}

	public static void main(String[] args) {
		String query = "create table myjdbctest(age  int)";
		Database hjfh = new Database();
		Connection tiktok7887 = hjfh.tiktok();
		try {
			PreparedStatement prepareStatement = tiktok7887.prepareStatement(query);
			prepareStatement.execute();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(tiktok7887);
		Connection tiktokjtyjty = hjfh.tiktok();
		try {
			System.out.println(tiktokjtyjty.getCatalog());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void saveData(int age67, int mob, int player, int bat) {
		Database database99 = new Database();
		Connection conn = database99.tiktok();
		String query = "INSERT INTO myjdbctest(age,mobile,player,bat) VALUES(?,?,?,?)";
		// pstmt.(1, age67);
		try {
			PreparedStatement ps768768tmt = conn.prepareStatement(query);
			ps768768tmt.setInt(1, age67);
			ps768768tmt.setInt(2, mob);
			ps768768tmt.setInt(3, player);
			ps768768tmt.setInt(4, bat);
			ps768768tmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	List<Integer> getData() {
		List<Integer> jsy = new ArrayList<Integer>();
		Database set = new Database();
		Connection tikjghtok = set.tiktok();
		String find = "select * from myjdbctest";
		try {
			PreparedStatement prepareStatement = tikjghtok.prepareStatement(find);
			ResultSet executeQuery = prepareStatement.executeQuery();
			while (executeQuery.next()) {
				jsy.add(executeQuery.getInt(1));
				jsy.add(executeQuery.getInt(2));
				jsy.add(executeQuery.getInt(3));
				jsy.add(executeQuery.getInt(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return jsy;
	}

	List<Employee> getDataCust() {
		List<Employee> empList = new ArrayList<Employee>();
		Database set = new Database();
		Connection tikjghtok = set.tiktok();
		String find = "select * from myjdbctest";
		try {
			PreparedStatement prepareStatement = tikjghtok.prepareStatement(find);
			ResultSet resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				Employee employee = new Employee();
				employee.setAge(resultSet.getInt(1));
				employee.setMobile(resultSet.getInt(2));
				employee.setPlayer(resultSet.getInt(3));
				employee.setBat(resultSet.getInt(4));
				empList.add(employee);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empList;
	}

	List<Updater> getUpdaterCust1() {
		List<Updater> UpdaterList = new ArrayList<Updater>();
		Database set = new Database();
		Connection tikjghtok = set.tiktok();
		String find = "select * from myjdbctest";
		try {
			PreparedStatement prepareStatement = tikjghtok.prepareStatement(find);
			ResultSet resultSet = prepareStatement.executeQuery();
			while (resultSet.next()) {
				Updater Updaterr = new Updater();
				Updaterr.setAge(resultSet.getInt(1));
				Updaterr.setMobile(resultSet.getInt(2));
				Updaterr.setPlayer(resultSet.getInt(3));
				Updaterr.setBat(resultSet.getInt(4));
				UpdaterList.add(Updaterr);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return UpdaterList;

	}

	void UpdaterData(Employee emp) {
		String myquery = "update myjdbctest set age =?,player=?,bat=? where mobile=?";
		
		
		Database set = new Database();
		Connection tikjghtok = set.tiktok();
		try {
			PreparedStatement prepareStatement = tikjghtok.prepareStatement(myquery);
			prepareStatement.setInt(1, emp.getAge());
			prepareStatement.setInt(2, emp.getPlayer());
			prepareStatement.setInt(3, emp.getBat());
			prepareStatement.setInt(4, emp.getMobile());
			prepareStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void deleteCustData(int mobile) {
		String myquery = "delete from myjdbctest where mobile=?";
		Database set = new Database();
		Connection tikjghtok = set.tiktok();
		try {
			PreparedStatement prepareStatement = tikjghtok.prepareStatement(myquery);
			prepareStatement.setInt(1, mobile);
			prepareStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Updater> getUpdaterCust() {
		// TODO Auto-generated method stub
		return null;
	}
}

/*
 * CREATE TABLE customer_master( customer_id BIGINT UNIQUE NOT NULL
 * AUTO_INCREMENT, first_name VARCHAR(50), last_name VARCHAR(50), email
 * VARCHAR(50) UNIQUE NOT NULL, mobile VARCHAR(50), PRIMARY KEY(customer_id) );
 */
