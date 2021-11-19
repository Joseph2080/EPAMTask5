public class Rectangle {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA,double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(double sideA){
        this.sideA = sideA;
        sideB = 5;
    }

    public Rectangle(){
        sideA = 4;
        sideB = -3;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double calcArea(){
        return sideA*sideB;
    }

    public double calcPerimeter(){
        return 2*(sideA+sideB);
    }

    public boolean isSquare(){
        return (sideA==sideB);
    }

    public void replaceSides(){
        double temp = sideA;
        sideA = sideB;
        sideB = temp;
    }
}
