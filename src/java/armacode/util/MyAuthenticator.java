/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armacode.util;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
//import sun.rmi.transport.Transport;

/**
 *
 * @author Swadesh Sharma
 */
class MyAuthenticator extends Authenticator {

    private String username, password;

    public MyAuthenticator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        PasswordAuthentication pwdAuth;
        pwdAuth = new PasswordAuthentication(this.username, this.password);
        return pwdAuth;
    }

}



