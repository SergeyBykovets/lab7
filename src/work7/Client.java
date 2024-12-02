package work7;
/**
 * Main class which creates commands, adds them to the list, and executes them
 * and contains the function {@code main}
 */
public class Client {
    /**
     * Function {@code main} which creates Receiver and Invoker, to process commands
     */
    public static void main(String[] args) {

        Receiver receiver = new Receiver();

        Command addRequest1 = new AddRequestCommand(receiver, "GET, http://1.com");
        Command addRequest2 = new AddRequestCommand(receiver, "DELETE, http://2.com");
        Command changePriority = new PriChCommand(receiver, "GET, http://1.com", 1);
        Command removeRequest = new DelRequestCommand(receiver, "DELETE, http://2.com");

        Invoker invoker = new Invoker();
        invoker.addCommand(addRequest1);
        invoker.addCommand(addRequest2);
        invoker.addCommand(changePriority);
        invoker.addCommand(removeRequest);

        invoker.executeCommands();
    }
}