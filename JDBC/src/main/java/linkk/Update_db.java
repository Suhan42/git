package linkk;
import java.sql.*;

import encryption.DES;
public class Update_db{

	static String sql = null;
	static String sql2 = null;
	static mysql db = null;
	static mysql db2 = null;
	static ResultSet ret = null;
	
	public static void main(String[] args) throws Exception {
		
		//String ul_name;
		String ul_number;
		
	        sql = "select * from user";//SQL语句
	        sql2 = "update user set password = ? where account = ?";
	        
	        try {
	        	db = new mysql(sql);
	        	db2 = new mysql(sql2);
	            ret = db.pst.executeQuery();//执行语句，得到结果集
	            while (ret.next()) { 
	                ul_number = ret.getString("account");
	                //ul_name = ret.getString("name");
	                
	                System.out.println(ul_number);
	                
	                DES desUtil = new DES(ul_number);
	                String stringMi = desUtil.encrypt("111111", "CBC");
	                
	                db2.pst.setString(2, ul_number);
	                db2.pst.setString(1, stringMi);
	                db2.pst.executeUpdate();
	            }
	            System.out.print("OK");
	            ret.close();
	            db.close();//关闭连接
	            db2.close();
	        } catch (SQLException e) {  
	            e.printStackTrace();
	        }  
	    }

}
