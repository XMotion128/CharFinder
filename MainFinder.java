import chfin.CharFinder;

public class MainFinder {

    public static void main(String[] args) {

        if (args.length == 0 || args[0].equals("-h") || args[0].equalsIgnoreCase("HELP")) {

            printHelp();

        }

        else {

            if (args[0].equals("-s") || args[0].equalsIgnoreCase("STRING")) { // Note: args[1] is the actual string and args[3] is the actual character

                if (args.length < 3) {

                    printHelp();

                }

                else {

                    CharFinder check = new CharFinder();

                    char characterChoosed = args[3].charAt(0);

                    System.out.println(check.charPos(args[1], characterChoosed));
                    System.out.println(check.charCount(args[1], characterChoosed));

                }

            }

            if (args[0].equals("-c") || args[0].equalsIgnoreCase("CHAR")) {

                if (args.length < 3) {

                    printHelp();

                }

                else {

                    CharFinder check = new CharFinder();

                    char characterChoosed = args[1].charAt(0);

                    System.out.println(check.charPos(args[3], characterChoosed));
                    System.out.println(check.charCount(args[3], characterChoosed));

                }

            }
        }

    }

    

    public static void printHelp() {

        System.out.println("How to use: \n \n");
        System.out.println("-h || HELP: \t Show this help \n");
        System.out.println("-s || STRING: \t String to consider (needed!) (in quotation marks!) \n");
        System.out.println("-c || CHAR: \t Character you want to find (needed!) (case sensitive) \n");

        System.exit(0);

    }

}
