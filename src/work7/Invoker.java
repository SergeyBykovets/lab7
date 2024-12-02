package work7;

import java.util.List;
import java.util.ArrayList;
/**
 * Class responsible for creating command objects anв call their execution.
 * It can also manage a queue of commands using functions {@code addCommand}, {@code executeCommands}
 *
 * @author Bykovets Sergey
 */
 public class Invoker {
    /**
     * List of created commands
     */
    private List<Command> commands = new ArrayList<>();
    /**
     * Function {@code addCommand} which adds a command to the list
     *
     * @param command command to add
     */
    public void addCommand(Command command) {
        commands.add(command);
    }
    /**
     * Function {@code executeCommands} which executes all commands from the list and then cleans it
     */
    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
        commands.clear();
    }
}
