/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armacode.controller;

import armacode.dao.HostDao;
import armacode.dao.RequestDao;
import armacode.listener.Listener1;
import armacode.pojo.Attendee;
import armacode.pojo.HostPojo;
import armacode.pojo.SuperAdminPojo;
import armacode.util.MailerOtp;
import armacode.util.OTPGenerator;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.mail.MessagingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Swadesh Sharma
 */
public class UserSignup extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        try{
//            Connection conn=Listener1.getConnection();
//            String id=HostDao.getHostId(conn);
//        }catch(SQLException ex){
//            System.out.println(ex);
//        }
        String userName = request.getParameter("userName");
        String userEmail = request.getParameter("userEmail");
        String userNumber = request.getParameter("userNumber");
        String userPassword = request.getParameter("userPassword");
        String userType = request.getParameter("userType");
        
        if(userType.equalsIgnoreCase("Admin")){
            SuperAdminPojo user=new SuperAdminPojo();
            user.setSuperAdminEmail(userEmail);
            user.setSuperAdminName(userName);
            user.setSuperAdminNumber(userNumber);
            user.setSuperAdminPassword(userPassword);
            user.setType(userType);
            String otp = OTPGenerator.getOTP();
            boolean ans=RequestDao.insertTempData(otp, user);
            if(ans==true){
                System.out.println("Added user");}
            Map<String, String> emailCred = new HashMap<>();
            emailCred.put("emailId", "19shivangi.sharma80@gmail.com");
            emailCred.put("secKey","mrlb mtzi cuzr cfxm");
            emailCred.put("otp",otp);
            try{
                MailerOtp.sendMail(emailCred, user);
            }catch(MessagingException ex){
                System.out.println("Error in sending mail");
            }
            
            ServletContext sc=request.getServletContext();
            sc.setAttribute("admin", user);
            RequestDispatcher rd=request.getRequestDispatcher("OtpAuth.jsp");
            rd.forward(request, response);
            
        }else if(userType.equalsIgnoreCase("Host")){
            HostPojo user = new HostPojo();
            user.setHostEmail(userEmail);
            user.setHostName(userName);
            user.setHostPassword(userPassword);
            user.setType(userType);
            user.setHostNumber(userNumber);
            String otp = OTPGenerator.getOTP();
            boolean ans=RequestDao.insertTempData(otp, user);
            if(ans==true){
                System.out.println("Added user");}
            Map<String, String> emailCred = new HashMap<>();
            emailCred.put("emailId", "19shivangi.sharma80@gmail.com");
            emailCred.put("secKey","mrlb mtzi cuzr cfxm");
            emailCred.put("otp",otp);
            try{
                MailerOtp.sendMail(emailCred, user);
            }catch(MessagingException ex){
                System.out.println("Error in sending mail");
            }
            
            ServletContext sc=request.getServletContext();
            sc.setAttribute("host", user);
            RequestDispatcher rd=request.getRequestDispatcher("OtpAuth.jsp");
            rd.forward(request, response);
        
        }else if(userType.equalsIgnoreCase("attendee")){
            Attendee user= new Attendee();
            user.setAttEmail(userEmail);
            user.setAttName(userName);
            user.setAttNumber(userNumber);
            user.setAttPassword(userPassword);
            user.setType(userType);
            String otp = OTPGenerator.getOTP();
            boolean ans=RequestDao.insertTempData(otp, user);
            if(ans==true){
                System.out.println("Added user");}
            Map<String, String> emailCred = new HashMap<>();
            emailCred.put("emailId", "19shivangi.sharma80@gmail.com");
            emailCred.put("secKey","mrlb mtzi cuzr cfxm");
            emailCred.put("otp",otp);
            try{
                MailerOtp.sendMail(emailCred, user);
            }catch(MessagingException ex){
                System.out.println("Error in sending mail");
            }
            
            ServletContext sc=request.getServletContext();
            sc.setAttribute("attendee", user);
            RequestDispatcher rd=request.getRequestDispatcher("OtpAuth.jsp");
            rd.forward(request, response);
            
        }
        
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
