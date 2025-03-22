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
public class SuperAdminPojo {
    
    private String superAdminId;
    private String superAdminName;
    private String superAdminEmail;
    private String superAdminPassword;
    private String superAdminNumber;
    private String type;
    
    public SuperAdminPojo(){}

    public SuperAdminPojo(String superAdminId, String superAdminName, String superAdminEmail, String superAdminPassword, String superAdminNumber, String type) {
        this.superAdminId = superAdminId;
        this.superAdminName = superAdminName;
        this.superAdminEmail = superAdminEmail;
        this.superAdminPassword = superAdminPassword;
        this.superAdminNumber = superAdminNumber;
        this.type=type;
    }
    
    
    public String getSuperAdminId() {
        return superAdminId;
    }

    public void setSuperAdminId(String superAdminId) {
        this.superAdminId = superAdminId;
    }

    public String getSuperAdminName() {
        return superAdminName;
    }

    public void setSuperAdminName(String superAdminName) {
        this.superAdminName = superAdminName;
    }

    public String getSuperAdminEmail() {
        return superAdminEmail;
    }

    public void setSuperAdminEmail(String superAdminEmail) {
        this.superAdminEmail = superAdminEmail;
    }

    public String getSuperAdminPassword() {
        return superAdminPassword;
    }

    public void setSuperAdminPassword(String superAdminPassword) {
        this.superAdminPassword = superAdminPassword;
    }

    public String getSuperAdminNumber() {
        return superAdminNumber;
    }

    public void setSuperAdminNumber(String superAdminNumber) {
        this.superAdminNumber = superAdminNumber;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "SuperAdminPojo{" + "superAdminId=" + superAdminId + ", superAdminName=" + superAdminName + ", superAdminEmail=" + superAdminEmail + ", superAdminPassword=" + superAdminPassword + ", superAdminNumber=" + superAdminNumber + '}';
    }
    
}
