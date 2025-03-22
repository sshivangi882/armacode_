/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armacode.dao;

import armacode.listener.Listener1;
import armacode.pojo.Attendee;
import armacode.pojo.HostPojo;
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
public class RequestDao {
    
    public static boolean insertTempData(String otp, Attendee user){
        boolean ans=false;
        try{
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","event_handler","event");
            String qry="insert into request values(?,?,?,?,?)";
            PreparedStatement ps=conn.prepareStatement(qry);
            ps.setString(1, user.getAttEmail());
            ps.setString(2, user.getAttPassword());
            ps.setString(3, otp);
            ps.setString(4, user.getType());
            ps.setString(5, "unauthorized");
            ans= ps.executeUpdate()==1;
        }catch(SQLException ex){
            System.out.println(ex);
        }   
        return ans;
    }
    
    public static boolean insertTempData(String otp, HostPojo user){
        boolean ans=false;
        try{
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","event_handler","event");
            String qry="insert into request values(?,?,?,?,?)";
            PreparedStatement ps=conn.prepareStatement(qry);
            ps.setString(1, user.getHostEmail());
            ps.setString(2, user.getHostPassword());
            ps.setString(3, otp);
            ps.setString(4, user.getType());
            ps.setString(5, "unauthorized");
            ans = ps.executeUpdate()==1;
        }catch(SQLException ex){
            System.out.println(ex);
        }   
        return ans;
    }
    
    public static boolean insertTempData(String otp, SuperAdminPojo user){
        boolean ans=false;
        try{
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","event_handler","event");
            String qry="insert into request values(?,?,?,?,?)";
            PreparedStatement ps=conn.prepareStatement(qry);
            ps.setString(1, user.getSuperAdminEmail());
            ps.setString(2, user.getSuperAdminPassword());
            ps.setString(3, otp);
            ps.setString(4, user.getType());
            ps.setString(5, "unauthorized");
            ans=ps.executeUpdate()==1;
        }catch(SQLException ex){
            System.out.println(ex);
        }   
        return ans;
    }
    
    public static Attendee authenticateOtp(String otp, Attendee user) throws SQLException{
        
        Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","event_handler","event");
        String qry="select * from request where user_email=? and otp=? and process_status='unauthorized' and user_type='Attendee'";
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1, user.getAttEmail());
        ps.setString(2, otp);
        ResultSet rs=ps.executeQuery();
        Attendee att =null;
        if(rs.next()){
            att=new Attendee();
            att.setAttEmail(rs.getString(1));
            att.setAttPassword(rs.getString(2));
            att.setAttName(user.getAttName());
            att.setAttNumber(user.getAttNumber());
            att.setType(user.getType());
            att.setAttId(AttendeeDao.getAttendeeId());
        }
       return att;
        
    }
    
    public static HostPojo authenticateOtp(String otp, HostPojo user) throws SQLException{
        
        Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","event_handler","event");
        String qry="select * from request where user_email=? and otp=? and process_status='unauthorized' and user_type='Host'";
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1, user.getHostEmail());
        ps.setString(2, otp);
        ResultSet rs=ps.executeQuery();
        HostPojo host =null;
        if(rs.next()){
            host=new HostPojo();
            host.setHostEmail(rs.getString(1));
            host.setHostPassword(rs.getString(2));
            host.setHostName(user.getHostName());
            host.setHostNumber(user.getHostNumber());
            host.setType(user.getType());
            host.setHostId(HostDao.getHostId());
        }
       return host;
        
    }
    
    public static SuperAdminPojo authenticateOtp(String otp, SuperAdminPojo user)throws SQLException{
        
        Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","event_handler","event");
        String qry="select * from request where user_email=? and otp=? and process_status='unauthorized' and user_type='Admin'";
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1, user.getSuperAdminEmail());
        ps.setString(2, otp);
        ResultSet rs=ps.executeQuery();
        SuperAdminPojo Admin =null;
        if(rs.next()){
            Admin=new SuperAdminPojo();
            Admin.setSuperAdminEmail(rs.getString(1));
            Admin.setSuperAdminPassword(rs.getString(2));
            Admin.setSuperAdminName(user.getSuperAdminName());
            Admin.setSuperAdminNumber(user.getSuperAdminNumber());
            Admin.setType(user.getType());
            Admin.setSuperAdminId(SuperAdminDao.getSuperAdminId());
        }
       return Admin;
        
    }
    
}
