package work7;
/**
 * Interface for classes {@link DelRequestCommand}, {@link PriChCommand}, {@link AddRequestCommand} that represent commands to perform an operation on a request,
 * contains a function {@code execute} which performs some operation on the request
 *
 * @author Bykovets Sergey
 */
public interface Command {
    /**
     * Function {@code execute} which performs some operation on the request
     */
    void execute();
}
