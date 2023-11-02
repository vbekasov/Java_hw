import exceptions.ZeroArgs;
import methods.CommandLineParser;
import methods.TerminalCommands;

public class Main {
    public static void main(String[] args) throws ZeroArgs {
        System.out.println("Main Started\n----------");
        //if (args.length == 0)
        //    throw new ZeroArgs("No args");

//        TerminalCommands tc1 = CommandLineParser.parseCommand(new String[]{"sort-it.exe", "-i", "-a", "out.txt.", "in.txt"});
//        TerminalCommands tc2 = CommandLineParser.parseCommand(new String[]{"sort-it.exe", "-s", "out.txt", "in1.txt", "in2.txt", "in3.txt"});
        TerminalCommands tc3 = CommandLineParser.parseCommand(new String[]{"sort-it.exe", "-d", "-s", "out.txt", "in1.txt", "in2.txt"});

    }
}
