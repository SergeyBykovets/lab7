package work7;
/**
 * The class that implements the {@link Command} interface receives information about the request for which it is necessary to change the priority,
 * the new priority and the recipient, the executor of the priority change operations
 * and contains the {@code execute} function
 *
 * @author Bykovets Sergey
 */
public class PriChCommand implements Command {
    /**
     * Recipient, executor of deletion request
     */
    private Receiver receiver;
    /**
     * Information about the request
     */
    private String inf;
    /**
     * New Priority
     */
    private int priority;
    /**
     * Constructs a new command with recipient, executor, request information and new priority
     *
     * @param receiver recipient, priority change request executor
     * @param inf information about the request to change priority
     * @param priority new priority
     */
    public PriChCommand(Receiver receiver, String inf, int priority) {
        this.receiver = receiver;
        this.inf = inf;
        this.priority = priority;
    }
    /**
     * Function {@code execute} which changes the request priority
     */
    @Override
    public void execute() {
        receiver.changeRequestPriority(inf, priority);
    }
}
