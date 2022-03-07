package com.parkit.parkingsystem.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Class DataBaseConfig.
 */
public class DataBaseConfig {

	/** The Constant logger. */
	private static final Logger logger = LogManager.getLogger("DataBaseConfig");

	/**
	 * Gets the connection.
	 *
	 * @return the connection
	 * @throws ClassNotFoundException the class not found exception
	 * @throws SQLException           the SQL exception
	 * @throws IOException
	 */
	public Connection getConnection() throws ClassNotFoundException, SQLException, IOException {
		logger.info("Create DB connection");

		Properties props = new Properties();
		FileInputStream in = null;
		try {
			in = new FileInputStream("src/main/resources/connexion.properties");
			props.load(in);
		} catch (IOException e) {
			System.out.println("Error connexion");
		} finally {
			if (in != null) {
				in.close();
			}
		}

		String driver = props.getProperty("jdbc.driver");
		if (driver != null) {
			Class.forName(driver);
		}

		String url = props.getProperty("jdbc.url");
		String username = props.getProperty("jdbc.username");
		String password = props.getProperty("jdbc.password");

		return DriverManager.getConnection(url, username, password);
	}

	/**
	 * Close connection.
	 *
	 * @param con the con
	 */
	public void closeConnection(Connection con) {
		if (con != null) {
			try {
				con.close();
				logger.info("Closing DB connection");
			} catch (SQLException e) {
				logger.error("Error while closing connection", e);
			}
		}
	}

	/**
	 * Close prepared statement.
	 *
	 * @param ps the ps
	 */
	public void closePreparedStatement(PreparedStatement ps) {
		if (ps != null) {
			try {
				ps.close();
				logger.info("Closing Prepared Statement");
			} catch (SQLException e) {
				logger.error("Error while closing prepared statement", e);
			}
		}
	}

	/**
	 * Close result set.
	 *
	 * @param rs the rs
	 */
	public void closeResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
				logger.info("Closing Result Set");
			} catch (SQLException e) {
				logger.error("Error while closing result set", e);
			}
		}
	}
}
