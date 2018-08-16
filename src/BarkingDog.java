public class BarkingDog {

    public static void main(String[] args)
    {
        bark(true, 1);
    }

    public static void bark(boolean barking, int hourOfDay)
    {
        if(barking) {
            if(hourOfDay < 0 || hourOfDay > 23) {
                System.out.println("false");
            } else if(hourOfDay < 8 || hourOfDay > 22) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
    }
}
