non-sealed class Pyramid extends Shape {
    private double height;
    private double area;

    public Pyramid(double height, double area) {
        super(height * area / 3.0);
        this.height = height;
        this.area = area;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return area;
    }

    public void print() {
        System.out.println("Высота пирамиды равна " + height);
        System.out.println("Площадь основания пирамиды равна " + area);
        System.out.println("Объем пирамиды равен " + getVolume());
    }
}
