package ss6.ThucHanh.baitap2;

import java.util.Arrays;

public class Poin3D extends Poin2D{
    private float z = 0.0f;

    public Poin3D(float x, float y, float z) {
        super(x, y);
        this.z = z ;
    }

    public Poin3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ(){
        float[] array = { super.getX(),super.getY(),z};
        return array ;
    }
    public  void setXYZ(float x , float y , float z ) {
        super.getXY();
        this.z = z;
    }

    @Override
    public String toString() {
        return "Poin3D{" + " X= " + getX() + " Y= " + getY() +
                "z= " + z + " [x,y,z] " + Arrays.toString(getXYZ()) + super.toString() +
                '}';
    }
}
