package lombok.task_two.methods;

import lombok.task_two.exceptions.ZeroArgs;
import java.util.*;

public class CommandLineParser {
    private static final Set<Character> flags = new HashSet<>(
            Arrays.asList('a', 'd', 's', 'i')
    );

    private CommandLineParser() {}

    public static TerminalCommands parseCommand(String[] args) {
        if (args == null || args.length < 4) throw new ZeroArgs();
        Set<String> received = new HashSet<>();

        for (int pos = 1; pos < args.length; pos++) {
            if (!received.contains(args[pos]) && verifyInput(args[pos]))
                received.add(args[pos]);
            else
                throw new ZeroArgs("Wrong Argument.");
        }

        if (!(!received.contains("-s") ^ !received.contains("-i")))
            throw new ZeroArgs("Wrong Argument.");

        if (!(received.contains("-a") || received.contains("-d")))
            received.add("-a");

        LinkedList<String> commands = new LinkedList<>();
        commands.add(args[0]);
        commands.addAll(received);

        return new TerminalCommands(commands);
    }

    private static boolean verifyInput(String str) {
        if (str.length() == 2)
            return str.charAt(0) == '-' && flags.contains(str.charAt(1));
        else
            return (str.contains("out") ^ str.contains("in")) && str.contains(".txt");

    }
}
