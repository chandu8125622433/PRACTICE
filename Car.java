public class Car   {
    // Attributes (fields) of the Car class
    private String colour;
    private int gearCount;
    private String material;
    private boolean patrol;

    // Constructor to initialize the Car object
    public Car(String colour, int gearCount, String material, boolean patrol) {
        this.colour = colour;
        this.gearCount = gearCount;
        this.material = material;
        this.patrol = patrol;
    }

    // Method to display the properties of the car
    public void properties() {
        System.out.println("Car Colour: " + colour);
        System.out.println("Number of Gears: " + gearCount);
        System.out.println("Material: " + material);
        System.out.println("Patrol: " + (patrol ? "Yes" : "No"));
    }

    // Getters and Setters for each field
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getGearCount() {
        return gearCount;
    }

    public void setGearCount(int gearCount) {
        this.gearCount = gearCount;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isPatrol() {
        return patrol;
    }

    public void setPatrol(boolean patrol) {
        this.patrol = patrol;
    }
}
    
 
