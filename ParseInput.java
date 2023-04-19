class ParseInput {
    static Square parseSquare (String[] splitted) {
        return new Square(Integer.parseInt(splitted[1]));
    }

    static Circle parseCircle (String[] splitted) {
        return new Circle(Integer.parseInt(splitted[1]));
    }

    static Rectangle parseRectangle (String[] splitted) {
        return new Rectangle(Integer.parseInt(splitted[1]), Integer.parseInt(splitted[2]));
    }
}