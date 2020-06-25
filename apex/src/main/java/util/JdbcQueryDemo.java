package util;

import java.sql.*;

/**
 * Package Name:  com.apexsoft.train
 * Created by on  2019/6/29 22:37
 * Author: yuwenxing
 * Version:
 * Des:
 */
public class JdbcQueryDemo {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        // 加载驱动
        Class.forName("com.mysql.jdbc.Driver").newInstance();

        Statement stmt = null;
        ResultSet rs = null;
        try {
            // 获取连接
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/train?serverTimezone=GMT","root","root");
            stmt = conn.createStatement();
            // 执行查询
            rs = stmt.executeQuery("select * from user");
            // 提取结果
            while(rs.next()) {
                int numColumns = rs.getMetaData().getColumnCount();
                for(int i=1 ; i <= numColumns ;  i++) {
                    System.out.println(String.format("COLUME%s=%s",i,rs.getObject(i)));
                }
            }
        }
        catch (SQLException ex){
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        finally {
            // 释放资源
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) { } // ignore
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) { } // ignore
            }
        }
    }
}
