package ss4.ThucHanh;

public class Quadratic {
        private double a;
        private double b;
        private double c;
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
    public double getFirsTest1(){
            return (-this.b + Math.sqrt(getTest()))/ (this.a * 2) ;
    }
    public double getFirstTest2(){
            return (-this.b - Math.sqrt(getTest())) / (this.a * 2) ;
    }
    public double getSecondTest(){
            return -this.b /(2* this.a ) ;
    }
    public String getThirdTest() {
            return "phương trình vô nghiệm";
    }
}
