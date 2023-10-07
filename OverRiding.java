class Shape{
    int sides;

    void area(){
        System.out.println("Area is side the Shape class");
    };
}

class square extends Shape{
    int side;
    @Override    //it checks that is that function override or not
    void area(){
        System.out.println("Area of the square  ");
    }
}

class triangle extends Shape{
    String type;
    void area(){
        System.out.println("Area of the triagle  ");
    }
}

public class OverRiding {
    public static void main(String[] args){
        // Shape shape=new Shape();
        // square sq=new square();
        // triangle tr=new triangle();

        // shape.area();
        // sq.area();
        // tr.area();

        Shape shape=new square();
        shape.area();


    }
}
