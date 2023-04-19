class Rectangle implements Shapes {
    int length;
    int breadth;

    Rectangle (int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    @Override
    public boolean canFit (String name) {
        return name.length() <= this.length || name.length() <= this.breadth;
    }
}