package repository;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class DBConnector {
	private static Logger log = LoggerFactory.getLogger(DBConnector.class);
	
	public static Connection getConnection() {
		Connection cn = null;
		try {
			Context initContext = new InitialContext();
			Context envContent = (Context) initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource) envContent.lookup("jdbc/mysql");
			
			try {
				cn = ds.getConnection();
			} catch (SQLException e) {
				log.info(">>> DB 연결정보 오류");
				e.printStackTrace();
				return null;
			}
		} catch (NamingException e) {
			log.info(">>> DBCP 설정 오류");
			e.printStackTrace();
			return null;
		}
		return cn;
	}
}
