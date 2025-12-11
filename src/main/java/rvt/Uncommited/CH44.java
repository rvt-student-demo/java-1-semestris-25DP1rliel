import java.util.Scanner;

public class CH44 {

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
        ex6();
        ex7();
        ex8();
    }

    // Formats name with last name in UPPERCASE
    public static void ex1() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String full = scan.nextLine().trim();

        int spaceSpot = full.indexOf(" ");

        if (spaceSpot < 0) {
            System.out.println(full);
            return;
        }

        String first = full.substring(0, spaceSpot);
        String last = full.substring(spaceSpot + 1).toUpperCase();

        System.out.println(first + " " + last);
    }

    // Prints each char in string on new line
    public static void ex2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String input = sc.nextLine();

        int length = input.length();

        for (int x = 0; x < length; x++) {
            System.out.println(input.charAt(x));
        }
    }

    // Adds Mr./Ms. prefix depending on name start
    public static void ex3() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a name:\n");
            String raw = sc.nextLine();

            if (raw.length() == 0) break;

            String trimmed = raw.trim().toLowerCase();

            if (trimmed.startsWith("amy") ||
                trimmed.startsWith("buffy") ||
                trimmed.startsWith("cathy")) {

                System.out.println("Ms. " + raw + "\n");

            } else if (trimmed.startsWith("elroy") ||
                       trimmed.startsWith("fred") ||
                       trimmed.startsWith("graham")) {

                System.out.println("Mr. " + raw + "\n");

            } else {
                System.out.println(raw + "\n");
            }
        }
    }

    // Converts a numeric string (like "1234") into mm:ss format
    public static void ex4() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input time:");
        String rawTime = sc.nextLine();
        int len = rawTime.length();

        if (len > 2) {
            int splitAt = len - 2;
            String mins = rawTime.substring(0, splitAt);
            String secs = rawTime.substring(splitAt);
            System.out.println(mins + ":" + secs);
        } else {
            System.out.println("0:" + rawTime);
        }
    }

    // Only prints lines that are single-line comments
    public static void ex5() {
        Scanner input = new Scanner(System.in);

        while (input.hasNextLine()) {
            String line = input.nextLine().trim();
            if (line.startsWith("//")) {
                System.out.println(line);
            }
        }
    }

    // Prints single-line and block-style comments
    public static void ex6() {
        Scanner sc = new Scanner(System.in);
        boolean inBlock = false;

        while (sc.hasNextLine()) {
            String raw = sc.nextLine();
            String trimmed = raw.trim();

            if (trimmed.startsWith("/*")) {
                inBlock = true;
                System.out.println(raw);
                continue;
            }

            if (trimmed.startsWith("*/")) {
                inBlock = false;
                System.out.println(raw);
                continue;
            }

            if (trimmed.startsWith("//")) {
                System.out.println(raw);
                continue;
            }

            if (inBlock) {
                System.out.println(raw);
            }
        }
    }

    // Checks password meets basic requirements
    public static void ex7() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your password: ");
            String pass = sc.nextLine();

            if (pass.length() < 7) {
                System.out.println("Password is not acceptable!\n");
                continue;
            }

            boolean hasUp = false;
            boolean hasLow = false;
            boolean hasDigit = false;

            for (int i = 0; i < pass.length(); i++) {
                char ch = pass.charAt(i);

                if (Character.isUpperCase(ch)) hasUp = true;
                if (Character.isLowerCase(ch)) hasLow = true;
                if (Character.isDigit(ch)) hasDigit = true;
            }

            if (hasUp && hasLow && hasDigit) {
                System.out.println("Password is acceptable!\n");
                break;
            } else {
                System.out.println("Password is not acceptable!\n");
            }
        }
    }

    // Removes edge letters and indents remaining word
    public static void ex8() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        int padding = 0;

        while (word.length() > 0) {
            for (int s = 0; s < padding; s++) {
                System.out.print(" ");
            }

            System.out.println(word);
            padding++;

            if (word.length() > 1) {
                word = word.substring(1, word.length() - 1);
            } else {
                break;
            }
        }
    }
}
