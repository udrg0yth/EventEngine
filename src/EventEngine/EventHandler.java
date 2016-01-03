package EventEngine;
import java.util.HashMap;
import java.util.Map;

public abstract class EventHandler {
	 protected Map<String, Object> argm = new HashMap<>();
     public abstract void handle();
     public final EventHandler bind(String label, Object o) {
    	 argm.put(label, o);
    	 return this;
     }
}
