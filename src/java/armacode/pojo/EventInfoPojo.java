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
public class EventInfoPojo {
    
    private String eventId;
    private String eventname;
    private String eventDate;
    private String eventLocation;
    private String eventDesc;
    private String hostId;
    private String eventType;
    private String eventVerification;
    private String eventCategory;

    public EventInfoPojo() {
    }

    
    public EventInfoPojo(String eventId, String eventname, String eventDate, String eventLocation, String eventDesc, String hostId, String eventType, String eventVerification, String eventCategory) {
        this.eventId = eventId;
        this.eventname = eventname;
        this.eventDate = eventDate;
        this.eventLocation = eventLocation;
        this.eventDesc = eventDesc;
        this.hostId = hostId;
        this.eventType = eventType;
        this.eventVerification = eventVerification;
        this.eventCategory= eventCategory;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getEventDesc() {
        return eventDesc;
    }

    public void setEvent_desc(String eventDesc) {
        this.eventDesc = eventDesc;
    }

    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventVerification() {
        return eventVerification;
    }

    public void setEventVerification(String eventVerification) {
        this.eventVerification = eventVerification;
    }

    public String getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(String eventCategory) {
        this.eventCategory = eventCategory;
    }

    @Override
    public String toString() {
        return "EventInfoPojo{" + "eventId=" + eventId + ", eventname=" + eventname + ", eventDate=" + eventDate + ", eventLocation=" + eventLocation + ", eventDesc=" + eventDesc + ", hostId=" + hostId + ", eventType=" + eventType + ", eventVerification=" + eventVerification + '}';
    }
    
    
}
