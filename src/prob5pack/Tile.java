package prob5pack;

public class Tile {
    private int edgeLength;

    Tile(int edge){
        this.edgeLength=edge;
    }
    int getArea(){
        int tileArea= this.edgeLength*this.edgeLength;
        return tileArea;
    }
}