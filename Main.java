import java.util.*;

class Main {
    public static void main ( String args[] ) {
        Scanner sc = new Scanner ( System.in );
        System.out.println("Enter name : ".toUpperCase());
        String name = sc.nextLine();
    
        while (true) {
            System.out.println ("\nEnter the shape and dimension : \n".toUpperCase());
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
        Shapes shapeObj = null;

        switch (shape) {
            case "circle":
                shapeObj = ParseInput.parseCircle(splitted);
                break;
            case "rectangle":
                shapeObj = ParseInput.parseRectangle(splitted);
                break;
            case "square":
                shapeObj = ParseInput.parseSquare(splitted);
                break;
            default:
                break;
        }
        
        if (shapeObj == null) {
            System.out.println("\nInvalid Shape");
            return;
        }

        canFit = shapeObj.canFit(name);
        System.out.println(canFit ? "Can Fit" : "Can't Fit");
    }
}
