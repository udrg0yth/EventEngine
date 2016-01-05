package EventEngine;
import java.util.HashMap;
import java.util.Map;

public abstract class EventHandler {
	 protected Map<String, Object> argm = new HashMap<>();
     public abstract void handle(Object...args);
}
