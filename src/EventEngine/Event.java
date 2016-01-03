package EventEngine;

public class Event {
    private String eventLabel = null;
    private EventHandler eventHandler = null;
    private EventStatus eventStatus = null;

    public Event(String eventLabel, EventHandler eventHandler) {
    	this.eventLabel = eventLabel;
    	this.eventHandler = eventHandler;
    	this.eventStatus = EventStatus.DEAD;
    }
    
    public String getLabel() {
    	return eventLabel;
    }
    
    public EventStatus getStatus() {
    	return eventStatus;
    }
    
    public Event setStatus(EventStatus eventStatus) {
    	this.eventStatus = eventStatus;
    	return this;
    }
    
    public Event handleEvent() {
    	eventHandler.handle();
    	return this;
    }
    
}
