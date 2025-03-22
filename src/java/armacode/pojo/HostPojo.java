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
public class HostPojo {
    
    private String hostId;
    private String hostName;
    private String hostEmail;
    private String hostPassword;
    private String hostNumber;
    private String type;

    public HostPojo() {
    }

    public HostPojo(String hostId, String hostName, String hostEmail, String hostPassword, String hostNumber, String type) {
        this.hostId = hostId;
        this.hostName = hostName;
        this.hostEmail = hostEmail;
        this.hostPassword = hostPassword;
        this.hostNumber = hostNumber;
        this.type=type;
    }

    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getHostEmail() {
        return hostEmail;
    }

    public void setHostEmail(String hostEmail) {
        this.hostEmail = hostEmail;
    }

    public String getHostPassword() {
        return hostPassword;
    }

    public void setHostPassword(String hostPassword) {
        this.hostPassword = hostPassword;
    }

    public String getHostNumber() {
        return hostNumber;
    }

    public void setHostNumber(String hostNumber) {
        this.hostNumber = hostNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
        return "HostPojo{" + "hostId=" + hostId + ", hostName=" + hostName + ", hostEmail=" + hostEmail + ", hostPassword=" + hostPassword + ", hostNumber=" + hostNumber + '}';
    }
    
    
}
