class Circle implements Shapes {
    int radius;

    Circle (int radius) {
        this.radius = radius;
    }

    @Override
    public boolean canFit (String name) {
        return name.length() <= this.radius * 2;
    }
}