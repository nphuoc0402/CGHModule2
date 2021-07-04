package product;

public class Table {
    private boolean occupied;

    public Table(){
        this.occupied = false;
    }


    public boolean isOccupied(){
        return occupied == true;
    }

    public void bookTable(Table table){
        occupied = true;

    }

    public void release(Table table){
        occupied = false;
    }


}
