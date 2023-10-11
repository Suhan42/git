package linkk;

import java.sql.*;
public class mysql {
	
	
    static final String URL = "jdbc:mysql://localhost:3306/ssms";
    
 // 数据库的用户名与密码，需要根据自己的设置
    static final String USER = "root";
    static final String PASS = "1209257039";
    Connection con = null;
    PreparedStatement pst = null;
    
   
    public mysql(String sql) {
    	 try {  
             Class.forName("com.mysql.jdbc.Driver");//指定连接类型  
             con = DriverManager.getConnection(URL,USER,PASS);//获取连接  
             pst = con.prepareStatement(sql);//准备执行语句  
         } catch (Exception e) {  
             e.printStackTrace();
         }
    }
    public void close() {  
        try {  
            this.con.close();  
            this.pst.close();  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
    }
}