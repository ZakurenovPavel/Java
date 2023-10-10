public class TestShapes {
    public static void main (String[] args) {
        Shape thisShape = new Shape(65.61);
        thisShape.print();
        Ball thisBall = new Ball(1.1);
        thisBall.print();
        Cylinder thisCylinder = new Cylinder(14.8, 6.3);
        thisCylinder.print();
        Pyramid thisPyramid = new Pyramid(14.44, 86.7);
        thisPyramid.print();
        ColourPyramid thisColourPyramid = new ColourPyramid(19.99, 22.77, "Red");
        thisColourPyramid.print();
    }
}
