import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        loop();
    }

    public static void loop() throws InterruptedException {
        System.out.println("To view commands, type \"help\"");
        boolean running = true;
        Scanner sc = new Scanner(System.in);
        while (running) {
            System.out.print(">> ");
            String input = sc.next();
            if (input == null) { continue;
            } else {
                if (input.equals("quit")) break;
                else if (input.equals("help")) helpCommand();
                else if (input.equals("translate")) translate("a word");
            }
        }
        System.out.println("Quitting...");
        TimeUnit.SECONDS.sleep(1);
    }

    public static void helpCommand() {
        System.out.println("Here is a list of commands. <> means the argument is required, [] means it is optional." +
                "\n - help : display this list." +
                "\n - translate <word> : translate the word ");
    }

    public static void translate(String word) {
        System.out.println("translating \"" + word + "\" ...");
    }

}
