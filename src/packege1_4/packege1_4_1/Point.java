package packege1_4.packege1_4_1;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Point(Point p){
        isNull(p);
        this.x = p.getX();
        this.y = p.getY();
    }

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    @Override
    public String toString(){
        return "{" + x + ":" + y + "}";
    }
    private void isNull(Object val){
        if (val == null) {
            throw new NullPointerException();
        }
    }
}