/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armacode.listener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Web application lifecycle listener.
 *
 * @author Swadesh Sharma
 */
//public class Listener1 implements ServletContextListener {
//    private static Connection conn=null;
//    @Override
//    public void contextInitialized(ServletContextEvent sce) {
//        ServletContext sc=sce.getServletContext();
//        String classpath=sc.getInitParameter("class");
//        String addr=sc.getInitParameter("path");
//        String username=sc.getInitParameter("username");
//        String pass=sc.getInitParameter("password");
//        try{
//            Class.forName(classpath);
//            conn=DriverManager.getConnection(addr,username,pass);
//            System.out.println("Generated");
//        }catch(SQLException | ClassNotFoundException ex){
//            ex.printStackTrace();
//        }finally{
//            sc.setAttribute("conn", conn);
//        }
//    }
//    
//    public static Connection getConnection(){
//        return conn;
//    }
//
//    @Override
//    public void contextDestroyed(ServletContextEvent sce) {
//        try{
//            if(conn!=null){
//                conn.close();
//            }
//        }catch(SQLException ex){
//            ex.printStackTrace();
//        }
//    }
//    
////    public static void main(String[] args) {
////        Connection conn=Listener1.getConnection();
////        System.out.println(conn);
////    }
//    
//}
public class Listener1 {
    private static Connection conn;
//    static{
//        try{
//            conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","event_handler","event");
//        }catch(SQLException ex){
////            JOptionPane.showMessageDialog(null,"Cannot open connection");
//            ex.printStackTrace();            
//        }
//    }
    public static Connection getConnection(){
        try{
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","event_handler","event");
            return conn;
        }catch(SQLException ex){
//            JOptionPane.showMessageDialog(null,"Cannot open connection");
            ex.printStackTrace();            
        }
        return null;
    }
    public static void closeConnection(){
        try{
            conn.close();
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
//        try{
//        }
//        }catch(SQLException ex){
//            System.out.println(ex);
//        }
        Connection conn = getConnection();
        if(conn!=null){
            System.out.println("Connected");
    }
}}