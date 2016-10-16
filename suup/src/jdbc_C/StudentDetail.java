package jdbc_C;


import java.sql.*;
import java.util.ArrayList;



public class StudentDetail {
	public static void main(String [] args) throws Exception{
		
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String id="hr";
		String pw="hr";
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url,id,pw);
		
		Statement stmt = con.createStatement();
		
		String sql="select * from student where id=20";
		
		ResultSet rs = stmt.executeQuery(sql);
		
		Stud st = null;
		
		if(rs.next()){
			
			st = (new Stud(rs.getInt("id"), rs.getInt("kor"), rs.getInt("eng"), rs.getInt("mat"), rs.getString("name"), rs.getString("tel"), rs.getDate("birth")));
			
		}
		
		if(rs!=null)
		rs.close();
		if(stmt!=null)
		stmt.close();
		if(con!=null)
		con.close();
	
		
		System.out.println(st);
		
	
	
	}
}
