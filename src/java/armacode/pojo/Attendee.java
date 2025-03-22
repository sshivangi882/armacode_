/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armacode.pojo;

/**
 *
 * @author Swadesh Sharma
 */
public class Attendee {
    
    private String attId;
    private String attName;
    private String attEmail;
    private String attPassword;
    private String attNumber;
    private String type;

    public Attendee() {
    }

    public Attendee(String attId, String attName, String attEmail, String attPassword, String attNumber, String type) {
        this.attId = attId;
        this.attName = attName;
        this.attEmail = attEmail;
        this.attPassword = attPassword;
        this.attNumber = attNumber;
        this.type = type;
    }

    public String getAttId() {
        return attId;
    }

    public void setAttId(String attId) {
        this.attId = attId;
    }

    public String getAttName() {
        return attName;
    }

    public void setAttName(String attName) {
        this.attName = attName;
    }

    public String getAttEmail() {
        return attEmail;
    }

    public void setAttEmail(String attEmail) {
        this.attEmail = attEmail;
    }

    public String getAttPassword() {
        return attPassword;
    }

    public void setAttPassword(String attPassword) {
        this.attPassword = attPassword;
    }

    public String getAttNumber() {
        return attNumber;
    }

    public void setAttNumber(String attNumber) {
        this.attNumber = attNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    

    @Override
    public String toString() {
        return "Attendee{" + "attId=" + attId + ", attName=" + attName + ", attEmail=" + attEmail + ", attPassword=" + attPassword + ", attNumber=" + attNumber + '}';
    }
    
    
    
}
