package jdbc_C;


import java.sql.*;
import java.util.ArrayList;


public class StudInsert{
	public static void main(String [] args) throws Exception{
		
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String id="hr";
		String pw="hr";
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url,id,pw);
		
		Statement stmt = con.createStatement();
		
		String sql="insert into student (id,name, tel, birth, kor) values(20,'후지이','010-1234-4321','2002-06-02',88)";
		
		int res=0;
		
		
		res = stmt.executeUpdate(sql);
		
		
		
		
		
		


		
		
		
		
		
		
		
		/*if(rs!=null)
		rs.close();*/
		
		if(stmt!=null)
		stmt.close();
		if(con!=null)
		con.close();
	

		System.out.println("추가 데이터 수  :"+res);
		
	
	
	}
}
