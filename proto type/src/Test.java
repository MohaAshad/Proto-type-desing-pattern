public class Test {
    public static void main(String[] args) {

        Bike bike=new Bike("CT100",100,"Bajaj");

        Bike cloneObj=bike.clone();
        System.out.println(cloneObj.toString());

        cloneObj.setName("PLATINA");
        System.out.println(cloneObj);
    }
}
