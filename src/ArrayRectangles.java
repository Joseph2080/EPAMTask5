public class ArrayRectangles {

    private int size;
    private Rectangle rectangle_array[];
    public ArrayRectangles(int n){
        size = 0;
        rectangle_array = new Rectangle[n];
    }

    public boolean addRectangle(Rectangle rectangle){
        if(size<rectangle_array.length){
            rectangle_array[size] = rectangle;
            size++;
        }
        return false;
    }

    public int numberMaxArea(){
        double max = rectangle_array[0].calcArea();
        int index = 0;
        for(int i =0;i < rectangle_array.length;i++){
            if(max<rectangle_array[i].calcArea()){
                max = rectangle_array[i].calcArea();
                index = i;
            }
        }
        return index;
    }

    public int numberMinPerimeter(){
        double min = rectangle_array[0].calcPerimeter();
        int index = 0;
        for(int i =0;i < rectangle_array.length;i++){
            if(min>rectangle_array[i].calcPerimeter()){
                min = rectangle_array[i].calcPerimeter();
                index = i;
            }
        }
        return index;
    }

    public int numberSquare(){
        int count = 0;
        for(Rectangle rectangle:rectangle_array){
            if(rectangle.isSquare()){
                count++;
            }
        }
        return count;
    }

}
