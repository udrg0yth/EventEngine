package EventEngine;

public class Test{

	public static void main(String[] args) {
		Application app = new Application();
		app.on("some_event", new EventHandler() {

			public void handle(Object...args) {
				System.out.println("Handled:" + args[0] + " " + args[1]);
			}
			
		});
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		app.emit("some_event", 0, 1);
	}

}
