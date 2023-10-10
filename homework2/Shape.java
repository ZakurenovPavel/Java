public sealed class Shape permits Ball, Cylinder, Pyramid {
    private double volume;

    public Shape(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void print() {
        System.out.println("Объем этой фигуры равен " + volume);
    }
}
