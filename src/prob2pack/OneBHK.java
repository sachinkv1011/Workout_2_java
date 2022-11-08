package prob2pack;

public class OneBHK {
    protected double roomArea;
    protected double hallArea;
    protected double price;

    OneBHK()
    {

    }

    OneBHK(double roomArea,double hallArea,double price)
    {
       this.roomArea=roomArea;
       this.hallArea=hallArea;
       this.price=price;
    }

    void show()
    {
        System.out.println("Room Area : "+this.roomArea+"sqft"+ "\nHall Area : "+this.hallArea+"sqft"+ "\nPrice : "+this.price);
        System.out.println("-----------------------");
    }
}
