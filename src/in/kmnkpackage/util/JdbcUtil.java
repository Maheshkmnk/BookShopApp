package in.kmnkpackage.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtil {

	private static Connection connection = null;

	private JdbcUtil() {

	}

	static{
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException ce){
			ce.printStackTrace();
		}
	}

	public static Connection getJdbcConnection() {

		try {
			FileInputStream fis = new FileInputStream(
					"D:\\Ineuron Full Stack Java course\\Projects\\BookShopApp\\src\\in\\kmnkpackage\\properties\\Properties.properties");
			Properties properties = new Properties();
			properties.load(fis);
			connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"),
					properties.getProperty("password"));
			System.out.println("connected db successfully");
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
		
		return connection;
	}

}
