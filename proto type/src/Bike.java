public class Bike implements ProtoType{


    private String name;
    private int capacity;
    private String brand;


    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }



    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getBrand() {
        return brand;
    }

    public Bike(String name, int capacity, String Brand){

        this.name=name;
        this.capacity=capacity;
        this.brand=Brand;

    }

    @Override
    public Bike clone() {
        Bike bike=new Bike(this.name,this.capacity,this.brand);
        return bike;
    }

    @Override
    public String toString() {
        String detail="Brand: "+this.brand+" "+"name: "+this.name+" "+"Storage: "+this.capacity;
        return detail;
    }
}
