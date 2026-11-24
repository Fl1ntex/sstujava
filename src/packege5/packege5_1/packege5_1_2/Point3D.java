package packege5.packege5_1.packege5_1_2;

public final class Point3D extends Point {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{"
                + super.getX() + ", "+ super.getY() + ", " + z +
                '}';
    }

    @Override
    public int hashCode(){
        return super.getX() + super.getY() + z;
    }

    @Override
    public boolean equals(Object o){
        if (o == this) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Point3D p = (Point3D) o;
        if (super.getX() == p.getX()){
            if (super.getY() == p.getY()){
                if (z == p.getZ()){
                    return true;
                }
            }
        }
        return false;
    }
}
