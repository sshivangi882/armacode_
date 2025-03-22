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
public class SubEventPojo {
    
    private String subEventId;
    private String mainEventId;
    private String subEventName;
    private String subEventTimeDate;
    private String subEventLocation;
    private String subEventDesc;

    public SubEventPojo() {
    }

    public SubEventPojo(String subEventId, String mainEventId, String subEventName, String subEventTimeDate, String subEventLocation, String subEventDesc) {
        this.subEventId = subEventId;
        this.mainEventId = mainEventId;
        this.subEventName = subEventName;
        this.subEventTimeDate = subEventTimeDate;
        this.subEventLocation = subEventLocation;
        this.subEventDesc = subEventDesc;
    }

    public String getSubEventId() {
        return subEventId;
    }

    public void setSubEventId(String subEventId) {
        this.subEventId = subEventId;
    }

    public String getMainEventId() {
        return mainEventId;
    }

    public void setMainEventId(String mainEventId) {
        this.mainEventId = mainEventId;
    }

    public String getSubEventName() {
        return subEventName;
    }

    public void setSubEventName(String subEventName) {
        this.subEventName = subEventName;
    }

    public String getSubEventTimeDate() {
        return subEventTimeDate;
    }

    public void setSubEventTimeDate(String subEventTimeDate) {
        this.subEventTimeDate = subEventTimeDate;
    }

    public String getSubEventLocation() {
        return subEventLocation;
    }

    public void setSubEventLocation(String subEventLocation) {
        this.subEventLocation = subEventLocation;
    }

    public String getSubEventDesc() {
        return subEventDesc;
    }

    public void setSubEventDesc(String subEventDesc) {
        this.subEventDesc = subEventDesc;
    }

    @Override
    public String toString() {
        return "SubEventPojo{" + "subEventId=" + subEventId + ", mainEventId=" + mainEventId + ", subEventName=" + subEventName + ", subEventTimeDate=" + subEventTimeDate + ", subEventLocation=" + subEventLocation + ", subEventDesc=" + subEventDesc + '}';
    }
    
    
    
}
