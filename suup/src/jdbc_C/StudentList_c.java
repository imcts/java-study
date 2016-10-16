package jdbc_C;


import java.sql.*;
import java.util.ArrayList;



public class StudentList_c {
	public static void main(String [] args) throws Exception{
		
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String id="hr";
		String pw="hr";
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,id,pw);
		
		
		Statement stmt = con.createStatement();
		
		String sql="select * from student";
		
		ResultSet rs = stmt.executeQuery(sql);
		
		ArrayList<Stud> list = new ArrayList(); 
		
		while(rs.next()){
			
			list.add(new Stud(rs.getInt("id"), rs.getInt("kor"), rs.getInt("eng"), rs.getInt("mat"), rs.getString("name"), rs.getString("tel"), rs.getDate("birth")));
			
			
		}
	
		if(rs!=null)
		rs.close();
		if(stmt!=null)
		stmt.close();
		if(con!=null)
		con.close();
	
		
        
		for(Stud st : list){
			
			System.out.println(st);
		}
		
	
	
	}
}
