import exceptions.ZeroArgs;
import methods.CommandLineParser;
import methods.TerminalCommands;

public class Main {
    public static void main(String[] args) throws ZeroArgs {
        System.out.println("Main Started\n----------");
        //if (args.length == 0)
        //    throw new ZeroArgs("No args");

        TerminalCommands tc4 = CommandLineParser.parseCommand(new String[]{"sort-it.exe", "in2.txt", "-a", "out.txt.", "in.txt"});
        TerminalCommands tc1 = CommandLineParser.parseCommand(new String[]{"sort-it.exe", "-i", "-a", "out.txt.", "in.txt"});
        TerminalCommands tc2 = CommandLineParser.parseCommand(new String[]{"sort-it.exe", "-s", "out.txt", "in1.txt", "in2.txt", "in3.txt"});
        TerminalCommands tc3 = CommandLineParser.parseCommand(new String[]{"sort-it.exe", "-d", "-s", "out.txt", "in1.txt", "in2.txt"});
        TerminalCommands tc5 = CommandLineParser.parseCommand(new String[]{"sort-it.exe", "-d",  "out.txt", "in1.txt", "in2.txt"});

        System.out.println(tc1.toString());
        System.out.println(tc2.toString());
        System.out.println(tc3.toString());
        System.out.println(tc4.toString());
        System.out.println(tc5.toString());

    }
}
