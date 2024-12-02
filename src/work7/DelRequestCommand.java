package work7;
/**
 * The class that implements the {@link Command} interface, receives information about the request to be deleted
 * and the recipient who executed the delete request
 * and contains the {@code execute} function
 *
 * @author Bykovets Sergey
 */
public class DelRequestCommand implements Command {
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
     * @param receiver recipient, executor of deletion request
     * @param inf information about the request to delete
     */
    public DelRequestCommand(Receiver receiver, String inf) {
        this.receiver = receiver;
        this.inf = inf;
    }
    /**
     * Function {@code execute} which deletes the request
     */
    @Override
    public void execute() {
        receiver.removeRequest(inf);
    }
}
