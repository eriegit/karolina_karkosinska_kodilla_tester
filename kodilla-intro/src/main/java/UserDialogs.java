import java.util.Scanner;

public class UserDialogs {
    public static String getUsername() { // static - Metody takie  mogą być wywoływane wprost na klasie,
                                         //  bez konieczności tworzenia obiektu danej klasy.
        Scanner scanner = new Scanner(System.in);                 // [1] wbudowana w Javę klasa Scanner
        while (true) {                                            // [2]wywołujemy metodę nextLine z klasy Scanner
            System.out.println("Enter your name:");                // [3] (trim usuwa spacje na pocz i k)
            String name = scanner.nextLine().trim();               // [4]Metoda ta pozwala użytkownikowi na wprowadzenie tekstu z klawiatury, który
            if (name.length() >= 2) {                              // [5] zostanie przekazany do naszego programu po naciśnięciu przycisku Enter
                return name;                                        // [6] instrukcja return kończy wykonywanie metody
            }
            System.out.println("Your name is too short. Try again.");
        }
    }

    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select calculation (A-add, S-subtract, D-divide, M-multiply):");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "A":
                    return "ADD";
                case "S":
                    return "SUB";
                case "D":
                    return "DIV";
                case "M":
                    return "MUL";
                default:
                    System.out.println("Wrong calculation. Try again.");
            }
        }
    }

    public static int getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int val = scanner.nextInt();
        return val;
    }


}
