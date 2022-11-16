public class Romb extends Shape{
     private int num;

    public Romb(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public double getPerimeter() {
        return num*4;
    }

    @Override
    public String toString() {
        return "Romb{" +
                "num=" + num +
                '}';
    }
}
