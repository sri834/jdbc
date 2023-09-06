import java.sql.*;
public class Move1 {
	public static void insertData1() throws Exception{
		String url="jdbc:mysql://127.0.0.1:3306/home";
		String username="root";
		String password="0834";
		String Query="insert into room values(?,?,?)";
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement str=con.prepareStatement(Query);
		str.setInt(1, 1);
		str.setString(2,"SRI");
		str.setString(3,"THENI");
		str.executeUpdate();
		con.close();

	}
	public static void main(String[]args)throws Exception {
		insertData1();
	}

}
