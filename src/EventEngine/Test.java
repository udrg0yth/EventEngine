package EventEngine;

public class Test{

	public static void main(String[] args) {
		Application app = new Application();
		app.on("some_event", new EventHandler() {

			public void handle() {
				System.out.println("Handled:" + argm.get("var1") + " " + argm.get("var2"));
			}
			
		}.bind("var1", 0).bind("var2", 1));
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		app.emit("some_event");
	}

}
