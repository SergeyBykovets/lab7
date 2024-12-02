package work7;
/**
 * The class that implements the {@link Command} interface receives information about the request to be added and the recipient,
 * the executor of the add request
 * and contains the {@code execute} function
 *
 * @author Bykovets Sergey
 */
public class AddRequestCommand implements Command {
    /**
     * Recipient, executor of deletion request
     */
    private Receiver receiver;
    /**
     * Information about the request
     */
    private String inf;
    /**
     * Constructs a new command with recipient, executor and request information
     *
     * @param receiver recipient, creator of creation request
     * @param inf query information to be created
     */
    public AddRequestCommand(Receiver receiver, String inf) {
        this.receiver = receiver;
        this.inf = inf;
    }
    /**
     * Function {@code execute} which adds a new query to the queue
     */
    @Override
    public void execute() {
        receiver.addRequest(inf);
    }
}
