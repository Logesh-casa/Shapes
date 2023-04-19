class Square implements Shapes {
    int side;

    Square (int side) {
        this.side = side;
    }

    @Override
    public boolean canFit (String name) {
        return name.length() <= this.side;
    }
}