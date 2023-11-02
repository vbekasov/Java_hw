package methods;

import exceptions.ZeroArgs;

import java.util.*;

public class CommandLineParser {
    private static Set<Character> flags = new HashSet<>(
            Arrays.asList('a', 'd', 's', 'i')
    );

    {
        flags = new HashSet<>();
        Collections.addAll(flags, 'a', 'd', 's', 'i');
    }

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

        if (received.contains("-s") && received.contains("-i"))
            throw new ZeroArgs("Wrong Argument.");

        LinkedList<String> commands = new LinkedList<>();
        commands.add(args[0]);
        for (String it : received)
            commands.add(it);

        return new TerminalCommands(commands);
    }

    private static boolean verifyInput(String str) {
        if (str.length() == 2)
            return str.charAt(0) == '-' && flags.contains(str.charAt(1));
        else
            if ((str.contains("out") ^ str.contains("in") ) && str.contains(".txt"))
                return true;
            else
                return false;

    }
}
