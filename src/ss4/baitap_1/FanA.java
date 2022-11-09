package ss4.baitap_1;

public class FanA {


    public static void main(String[] args) {

        Fan fan1 = new Fan(Fan.FAST,true, 10,"yellow");
        Fan fan2 = new Fan(Fan.MEDIUM,false, 5,"blue");
        System.out.println(fan1.toString() + " trạng thái bậc");
        System.out.println(fan2.toString() + " trạng thái tắc" );
    }
}
