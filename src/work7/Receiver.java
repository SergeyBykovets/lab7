package work7;
/**
 * A class that is a request handler
 * and contains 3 functions to operate on request {@code addRequest}, {@code removeRequest}, {@code changeRequestPriority}
 *
 * @author Bykovets Sergey
 */
public class Receiver {
    /**
     * Function {@code addRequest} which creates the request and writes about it
     *
     * @param inf query information to be created
     */
    public void addRequest(String inf) {
        System.out.println("Створено запит: " + inf);
    }
    /**
     * Function {@code removeRequest} which deletes the request and writes about it
     *
     * @param inf query information to be removed
     */
    public void removeRequest(String inf) {
        System.out.println("Видалено запит: " + inf);
    }
    /**
     * Function {@code changeRequestPriority} which changes priority and writes about it
     *
     * @param inf information about the request for which you want to change the priority
     */
    public void changeRequestPriority(String inf, int priority) {
        System.out.println("Змінено пріоритет для запиту: " + inf + " на " + priority);
    }
}

