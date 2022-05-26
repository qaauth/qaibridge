package database.connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class DatabaseConnection_01 {

	public void databaseConection(String ars) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		// Create Connection
		Connection con = DriverManager.getConnection("jdbc:mysql://35.154.153.79:3306/checkpoint_live_QA",
				"usr_bridge_app", "uSR_gtrtetr!1931[{]{1");

		// Create a Query/ Statement
		Statement stmt = con.createStatement();
		String select_case_ars_no = "select case_id from ec_case_master where case_ars_no='" + ars + "';";
		ResultSet rs = stmt.executeQuery(select_case_ars_no);
		rs.next();
		Integer case_id = rs.getInt(1);
		System.out.println(case_id);

		LocalDate date = LocalDate.now();
		String report_id = "update ec_case_reports set report_status=5 where case_id='" + case_id + "';";
		//String case_report_id = "update ec_case_reports set report_sent_on='2020-09-09 17:49:13' where case_id='" + case_id + "';";
		String case_report_id = "update ec_case_reports set report_sent_on='" + date + "' where case_id='"
				+ case_id + "';";
		String case_ars_no = "update ec_case_master set case_status=7 where case_ars_no='" + ars + "';";

		//String case_closure_date = "update ec_case_master set case_closure_date='2021-02-07 16:12:40'  where case_id='" + case_id + "';";
		String case_closure_date = "update ec_case_master set case_closure_date='" + date + "' where case_id='" + case_id + "';";

		// Execute Statement/Query
		stmt.executeUpdate(report_id);
		stmt.executeUpdate(case_report_id);
		stmt.executeUpdate(case_ars_no);
		stmt.executeUpdate(case_closure_date);
		System.out.println("Report Id Update Queries have been Executed Successfully!");

		// Close Connection
		con.close();
		System.out.println("Database Connection has been closed Successfully!");
	}

}
