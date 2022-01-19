import java.util.Scanner;

public class UserColour {
    public static String getUserColour() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select colour - type first letter (Y-yellow, R-red, B-blue, G-green, W-white):");
            String colour = scanner.nextLine().trim().toUpperCase();
            switch (colour) {
                case "Y":
                    return "YELLOW";
                case "R":
                    return "RED";
                case "B":
                    return "BLUE";
                case "G":
                    return "GREEN";
                case "W":
                    return "WHITE";
                default:
                    System.out.println("Wrong colour. Try again.");
            }
        }
    }
}
