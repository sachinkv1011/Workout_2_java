package prob2pack;

public class TwoBHK extends OneBHK{
    double room2Area;

    TwoBHK()
    {
        System.out.println("Created TwoBHK!");
    }

    TwoBHK(double roomArea,double room2Area,double hallArea,double price)
    {
        this.roomArea=roomArea;
        this.room2Area=room2Area;
        this.hallArea=hallArea;
        this.price=price;
    }

    void show()
    {
        System.out.println("Room1 Area : "+this.roomArea+"sqft"+"\nRoom2 Area : "+this.room2Area+"sqft"+ "\nHall Area : "+this.hallArea+"sqft"+ "\nPrice : "+this.price);
        System.out.println("-----------------------");
    }
}
