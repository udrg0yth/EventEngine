package EventEngine;

import java.util.Map;


public class Application implements IEventDriven{

	Application() {
		EventLoop.startLoop();
	}
	
	@Override
	public void on(String eventLabel, EventHandler eventHandler) {
		Event event = new Event(eventLabel, eventHandler);
		synchronized (EventLoop.events) {
  	       EventLoop.events.put(eventLabel, event);
		}
	}

	@Override
	public void emit(String eventLabel, Object...args) {
		if(EventLoop.events.get(eventLabel) == null) {
			throw new MissingHandlerException();
		}
		synchronized (EventLoop.events) {
		  EventLoop.events.get(eventLabel).setArgs(args).setStatus(EventStatus.ALIVE);
		}
	}
	
	private static class EventLoop implements IEventLoop {
		public static void startLoop() {
			new Thread(new Runnable() {

				@Override
				public  void run() {
				    	while(true) {
							for(Map.Entry<String, Event> entry: events.entrySet()) {
								if(entry.getValue().getStatus() == EventStatus.ALIVE) {
									entry.getValue().handleEvent().setStatus(EventStatus.DEAD);
								}
							}
						}
					
				}
			}).start();
		}
	}

}
