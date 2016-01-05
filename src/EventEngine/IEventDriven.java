package EventEngine;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public interface IEventDriven {
     void on(String eventLabel, EventHandler eventHandler);
     void emit(String eventLabel, Object...args);
     
     interface IEventLoop {
    	 static final Map<String, Event> events = new ConcurrentHashMap<>();
    	 public static void startLoop(){}
     }
}


