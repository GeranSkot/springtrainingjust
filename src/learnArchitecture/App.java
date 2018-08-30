package learnArchitecture;

public class App {
  public static void main(String[] args) {
    App app = new App();

    app.client = new Client("1", "Jon Smith");
    app.eventLogger = new ConsoleEventLogger();

    app.logEvent("Some event for user 1");
  }

  private void logEvent(String msg){
    String messege = msg.replaceAll(
        client.getId(), client.getFullName()
    );
    eventLogger.logEvent(messege);
  }
}
