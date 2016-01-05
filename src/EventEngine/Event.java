package EventEngine;

public class Event {
    private String eventLabel = null;
    private EventHandler eventHandler = null;
    private EventStatus eventStatus = null;
    private Object[] args = null;

    public Event(String eventLabel, EventHandler eventHandler) {
    	this.eventLabel = eventLabel;
    	this.eventHandler = eventHandler;
    	this.eventStatus = EventStatus.DEAD;
    }
    
    public String getLabel() {
    	return eventLabel;
    }
    
    public Event setArgs(Object...args) {
    	this.args = args;
    	return this;
    }
    
    public EventStatus getStatus() {
    	return eventStatus;
    }
    
    public Event setStatus(EventStatus eventStatus) {
    	this.eventStatus = eventStatus;
    	return this;
    }
    
    public Event handleEvent() {
    	if(args != null)
    	   eventHandler.handle(args);
    	else
    	   eventHandler.handle();
    	return this;
    }
    
}
