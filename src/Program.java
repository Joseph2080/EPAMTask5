public class Program {

    public static void main(String args[]){
        ArrayRectangles arrayRectangles = new ArrayRectangles(5);
        arrayRectangles.addRectangle(new Rectangle());
        arrayRectangles.addRectangle(new Rectangle(5));
        arrayRectangles.addRectangle(new Rectangle(5,4));
        arrayRectangles.addRectangle(new Rectangle(5,5));
        arrayRectangles.addRectangle(new Rectangle(2));
        System.out.println("Max area: rectangle[" + arrayRectangles.numberMaxArea() + "]");
        System.out.println("Min Perimeter: rectangle[" + arrayRectangles.numberMinPerimeter() + "]");
        System.out.println("Number Square:" + arrayRectangles.numberSquare());



    }
}
