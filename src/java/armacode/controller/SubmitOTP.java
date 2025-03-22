/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armacode.controller;

import armacode.dao.AttendeeDao;
import armacode.dao.HostDao;
import armacode.dao.RequestDao;
import armacode.dao.SuperAdminDao;
import armacode.pojo.Attendee;
import armacode.pojo.HostPojo;
import armacode.pojo.SuperAdminPojo;
import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Swadesh Sharma
 */
public class SubmitOTP extends HttpServlet {

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
        String otp=request.getParameter("otp");
        ServletContext sc=request.getServletContext();
        
        Attendee att = (Attendee)sc.getAttribute("attendee");
        HostPojo host=(HostPojo)sc.getAttribute("host");
        SuperAdminPojo admin =(SuperAdminPojo)sc.getAttribute("admin");
        
        if(att!=null){
            try{
                Attendee user=RequestDao.authenticateOtp(otp, att);
                System.out.println("Auth attendee "+user);
                AttendeeDao.insertUser(att);
            }catch(SQLException ex){
                System.out.println(ex);
            }
        }else if(host!=null){
            try{
                HostPojo user=RequestDao.authenticateOtp(otp, host);
                System.out.println("Auth host "+host);
                HostDao.insertUser(user);
            }catch(SQLException ex){
                System.out.println(ex);
            }
        }else if(admin!=null){
            try{
                SuperAdminPojo user=RequestDao.authenticateOtp(otp, admin);
                System.out.println("Auth admin "+user);
                SuperAdminDao.insertUser(admin);
            }catch(SQLException ex){
                System.out.println(ex);
            }
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
