import java.util.*;

class Main {
    public static void main ( String args[] ) {
        Scanner sc = new Scanner ( System.in );
        System.out.println("Enter name : ".toUpperCase());
        String name = sc.nextLine();
    
        while (true) {
            System.out.println ("\nEnter the shape and dimension : ".toUpperCase());
            String input = sc.nextLine();
            if (haveToQuit(input)) break;
            handleInput(input, name);
        }
    }

    static boolean haveToQuit (String input) {
        if (input.equals("q")) return true;
        return false;
    }

    static void handleInput (String input, String name) {
        String splitted[] = input.split(" ");
        String shape = splitted[0].toLowerCase();
        boolean canFit;

        switch (shape) {
            case "circle":
                canFit = handleCircle(splitted, name);
                break;
            case "rectangle":
                canFit = handleRectangle(splitted, name);
                break;
            case "square":
                canFit = handleSquare(splitted, name);
                break;
            default:
                System.out.println("Invalid shape");
                break;
        }
        
        System.out.println(canFit ? "Can Fit" : "Can't Fit");
    }

    static boolean handleCircle (String[] splitted, String name) {
        Circle circle = ParseInput.parseCircle(splitted);
        return circle.canFit(name);
    }

    static boolean handleRectangle (String[] splitted, String name) {
        Rectangle rectangle = ParseInput.parseRectangle(splitted);
        return rectangle.canFit(name);
    }

    static boolean handleSquare (String[] splitted, String name) {
        Square square = ParseInput.parseSquare(splitted);
        return square.canFit(name);
    }
}
