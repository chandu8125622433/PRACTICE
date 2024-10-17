 class Autofan{
    boolean fanon;
    boolean fanoff;
    void turnOn(){
        fanon=true;
        

 System.out.println("fan on? :" + fanon);


    }
    void turnOff(){
        fanoff = false;
        System.out.println("fan on? :" + fanon);

    }
 }
 class Main {
    public static void main(String[] args) {
        Autofan colour = new Autofan();
        Autofan shape = new Autofan();
        colour.turnOn();
        shape.turnOff();



 }
}