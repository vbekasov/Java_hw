package methods;

import exceptions.ZeroArgs;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class TerminalCommands {
    LinkedList<String> commands;

    public TerminalCommands(LinkedList<String> commands) {
        try {
            this.commands = commands;
        } catch (NullPointerException e) {
            throw new ZeroArgs();
        }
    }

    public TerminalCommands(String[] input) {
        this.commands = new LinkedList<>();
        try {
            Collections.addAll(commands, input);
        } catch (NullPointerException e) {
            throw new ZeroArgs();
        }
    }

    public LinkedList<String> getCommands() {
        return commands;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListIterator<String> th = getCommands().listIterator();
        ListIterator<String> ob = ((TerminalCommands)o).commands.listIterator();

        while (th.hasNext() && ob.hasNext()) {
            th.next();
            ob.next();
            if (!th.equals(ob)) return false;
        }

        return th.hasNext();
    }

    @Override
    public int hashCode() {
        int total = 0;
        for (String it : getCommands())
            total += it.hashCode();
        return total;
    }

    @Override
    public String toString() {
        return "TerminalCommands{" +
                "commands=" + commands +
                '}';
    }
}
