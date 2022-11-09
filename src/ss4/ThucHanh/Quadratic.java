package ss4.ThucHanh;

public class Quadratic {
        double a,c,b;
        public Quadratic(){
        }
        public Quadratic(double a, double b , double c) {
            this.a = a;
            this.b = b;
            this.c = c;
    }
    public double getTest(){
       return  (this.b * this.b) - (4 * this.a * this.c ) ;
    }
    public double getTest11(){
            return (-this.b + Math.sqrt(getTest()))/ (this.a * 2) ;
    }
    public double getTest12(){
            return (-this.b - Math.sqrt(getTest())) / (this.a * 2) ;
    }
    public double getTest2(){
            return -this.b /(2* this.a ) ;
    }
    public String getTest3() {
            return "phương trình vô nghiệm";
    }
}
