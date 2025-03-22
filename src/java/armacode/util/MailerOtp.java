/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armacode.util;

import armacode.pojo.Attendee;
import armacode.pojo.HostPojo;
import armacode.pojo.SuperAdminPojo;
import java.util.Map;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/**
 *
 * @author Swadesh Sharma
 */

//class MyAuthenticator extends Authenticator {
//
//    private String username, password;
//
//    public MyAuthenticator(String username, String password) {
//        this.username = username;
//        this.password = password;
//    }
//
//    @Override
//    protected PasswordAuthentication getPasswordAuthentication() {
//        PasswordAuthentication pwdAuth;
//        pwdAuth = new PasswordAuthentication(this.username, this.password);
//        return pwdAuth;
//    }
//    
//
//}

public class MailerOtp {
    private static Properties prop;

    static {
        prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
    }

    public static void sendMail(Map<String, String> emailCredentials, HostPojo user) throws MessagingException {
        final String username = emailCredentials.get("emailId");
        final String password = emailCredentials.get("secKey");
        final String otp = emailCredentials.get("otp");
        MyAuthenticator myAuth = new MyAuthenticator(username, password);
        Session session = Session.getInstance(prop, myAuth);
        Message message = new MimeMessage(session);
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(user.getHostEmail()));

        String emailSubject = "User Details";

        String emailBody = "Respected " + user.getHostName() + ",\n"
                + "\n"
                + "This is a system generated OTP, please use this for further processing your request.\n"
                + "\n"
                + "OTP: " + otp + "\n"
                + "\n"
                + "These details are crucial for internal record-keeping and ensuring efficient communication within the organization.\n"
                + "Best regards,\n";

        message.setSubject(emailSubject);
        message.setText(emailBody);
        Transport.send(message);

    }
    
    public static void sendMail(Map<String, String> emailCredentials, SuperAdminPojo user) throws MessagingException {
        final String username = emailCredentials.get("emailId");
        final String password = emailCredentials.get("secKey");
        final String otp = emailCredentials.get("otp");
        MyAuthenticator myAuth = new MyAuthenticator(username, password);
        Session session = Session.getInstance(prop, myAuth);
        Message message = new MimeMessage(session);
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(user.getSuperAdminEmail()));

        String emailSubject = "User Details";

        String emailBody = "Respected " + user.getSuperAdminName() + ",\n"
                + "\n"
                + "This is a system generated OTP, please use this for further processing your request.\n"
                + "\n"
                + "OTP: " + otp + "\n"
                + "\n"
                + "These details are crucial for internal record-keeping and ensuring efficient communication within the organization.\n"
                + "Best regards,\n";

        message.setSubject(emailSubject);
        message.setText(emailBody);
        Transport.send(message);

    }
    
    public static void sendMail(Map<String, String> emailCredentials, Attendee user) throws MessagingException {
        final String username = emailCredentials.get("emailId");
        final String password = emailCredentials.get("secKey");
        final String otp = emailCredentials.get("otp");
        MyAuthenticator myAuth = new MyAuthenticator(username, password);
        Session session = Session.getInstance(prop, myAuth);
        Message message = new MimeMessage(session);
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(user.getAttEmail()));

        String emailSubject = "User Details";

        String emailBody = "Respected " + user.getAttName() + ",\n"
                + "\n"
                + "This is a system generated OTP, please use this for further processing your request.\n"
                + "\n"
                + "OTP: " + otp + "\n"
                + "\n"
                + "These details are crucial for internal record-keeping and ensuring efficient communication within the organization.\n"
                + "Best regards,\n";

        message.setSubject(emailSubject);
        message.setText(emailBody);
        Transport.send(message);

    }
    
//    public static void main(String[] args) {
//        Attendee user= new Attendee();
//            user.setAttEmail("swadesh1408@gmail.com");
//            user.setAttName("abc");
//            user.setAttNumber("abc");
//            user.setAttPassword("abc");
//            Map<String, String> emailCred = new HashMap<>();
//            emailCred.put("emailId", "19shivangi.sharma80@gmail.com");
//            emailCred.put("secKey","mrlb mtzi cuzr cfxm");
//            try{
//                MailerOtp.sendMail(emailCred, user);
//            }catch(MessagingException ex){
//                System.out.println(ex);
//            }
//            
//    }
}

