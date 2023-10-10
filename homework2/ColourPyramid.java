final class ColourPyramid extends Pyramid {
    private String colour;

    public ColourPyramid (double height, double area, String colour) {
        super(height, area);
        this.colour = colour;
    }

    @Override
    public void print() {
        System.out.println("Цвет пирамиды " + colour);
        System.out.println("Высота пирамиды " + getHeight());
        System.out.println("Площадь основания пирамиды " + getArea());
        System.out.println("Объем пирамиды " + getVolume());
    }
}
