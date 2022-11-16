public class Pentagon extends Shape{
    private int num;
    private int num2;
    private int num3;
    private int num4;
    private int num5;

    public Pentagon(int num, int num2, int num3, int num4, int num5) {
        this.num = num;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
        this.num5 = num5;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    public int getNum4() {
        return num4;
    }

    public void setNum4(int num4) {
        this.num4 = num4;
    }

    public int getNum5() {
        return num5;
    }

    public void setNum5(int num5) {
        this.num5 = num5;
    }

    @Override
    public double getPerimeter() {
return num+num2+num3+num4+num5;
    }

    @Override
    public String toString() {
        return "Pentagon{" +
                "num=" + num +
                ", num2=" + num2 +
                ", num3=" + num3 +
                ", num4=" + num4 +
                ", num5=" + num5 +
                '}';
    }
}
