non-sealed class Ball extends Shape {
    private double radius;

    public Ball(double radius) {
        super(4.0 / 3.0 * Math.PI * Math.pow(radius, 3));
        this.radius = radius;
    }

    @Override
    public void print() {
        System.out.println("Радиус шара равен " + radius);
        System.out.println("Объем шара равен " + getVolume());
        System.out.println("Площадь поверхности шара равна " + 4 * Math.PI * Math.pow(radius, 2));
    }
}
