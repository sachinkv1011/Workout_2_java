package prob2pack;

public class DriverClass {
    public static void main(String[] args) {
        TwoBHK tbk1=new TwoBHK();
        TwoBHK tbk2=new TwoBHK(135,140,450,4000000);
        TwoBHK tbk3=new TwoBHK(132,137,400,5000000);

        int totalCost= (int) (tbk1.price+ tbk2.price+ tbk3.price);

        tbk1.show();
        tbk2.show();
        tbk3.show();

        System.out.println("Total Amount of all Flats ="+totalCost);
    }
}
