/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armacode.dao;

import armacode.listener.Listener1;
import armacode.pojo.SuperAdminPojo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Swadesh Sharma
 */
public class SuperAdminDao {
    
    public static String getSuperAdminId() throws SQLException{
        Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","event_handler","event");
        Statement st=conn.createStatement();
        ResultSet rs=st.executeQuery("select max(super_admin_id) from super_admin");
        rs.next();
        String id=rs.getString(1);
        String hostId="";
        if(id!=null){
            id=id.substring(2);
            hostId="SA"+(Integer.parseInt(id)+1);
        }else{
            hostId="SA101";
        }
        return hostId;
    }
    
    public static boolean insertUser(SuperAdminPojo user){
        boolean ans=false;
        try{
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","event_handler","event");
            String qry="insert into attendee values(?,?,?,?,?)";
            PreparedStatement ps=conn.prepareStatement(qry);
            ps.setString(1, getSuperAdminId());
            ps.setString(2, user.getSuperAdminName());
            ps.setString(3, user.getSuperAdminEmail());
            ps.setString(4, user.getSuperAdminPassword());
            ps.setString(5, user.getSuperAdminNumber());
            ans=ps.executeUpdate()==1;
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return ans;
    }
    
}
