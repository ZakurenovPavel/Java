non-sealed class Cylinder extends Shape {

  private double height;

  public Cylinder(double volume, double height) {
    super(volume);
    this.height = height;
  }

  @Override
  public void print() {
    System.out.println("Высота цилиндра равна " + height);
    System.out.println("Объем цилиндра равен " + getVolume());
    System.out.println(
        "Радиус основания цилиндра равен " + Math.sqrt(getVolume() / (height * Math.PI)));
    System.out.println("Площадь боковой поверхности цилиндра равна " + 2 * Math.sqrt(
        getVolume() * Math.PI * height));
    System.out.println("Площадь основания цилиндра равна " + getVolume() / height);
  }
}


