public class Main {
    public static void main(String[] args) {
   Shape triangle=new Triangle(2,3,4);
        System.out.println(triangle);
        System.out.println(triangle.getPerimeter());
        System.out.println();
        Shape sqaure=new Square(5);
        System.out.println(sqaure);
        System.out.println(sqaure.getPerimeter());
        System.out.println();
        Shape rectengle =new Rectangle(3,6);
        System.out.println(rectengle);
        System.out.println(rectengle.getPerimeter());
        System.out.println();
        Shape romb = new Romb(6);
        System.out.println(romb);
        System.out.println(romb.getPerimeter());
        System.out.println();
        Shape pentagon =new Pentagon(2,3,4,5,6);
        System.out.println(pentagon);
        System.out.println(pentagon.getPerimeter());


    }}