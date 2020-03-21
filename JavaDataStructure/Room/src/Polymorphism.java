
public class Polymorphism {

    public static void main(String[] args) {
        Cyclist mc = new MotorCyclist();
        Cyclist uc = new UniCyclist();
        System.out.println(mc.ride(false));
        System.out.println(uc.ride(false));
        System.out.println("");
        System.out.println(mc.getStatus());
        System.out.println(uc.getStatus());
    }
}
