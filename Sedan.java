
class Sedan extends Vehicle implements Automobile {    
    /**
     * 
     * This is how to accelerate the car
     */
    public void accelerate(int moreSpeed){
        speed = speed + moreSpeed;
        System.out.println("Acceleration speed: "+speed+" km/h");
    }

    /**
     * 
     * This is how to stop the car
     */
    public void stop(int lessSpeed){
        speed = speed - ;
        System.out.println("Deceleration speed: "+speed+" km/h");
    }

    /**
     * 
     * This is how to check for gas
     */
    public void gas(int newCapacity){
        Capacity = newCapacity;
        System.out.println("Gas: "+Capacity+" litres");
    }

    @Override
    void accelerate() {
        //
        System.out.println("The vehicle is accelerating"); 

    }

    @Override
    void stop() {
        // 

    }

    @Override
    void gas() {
        // 
    }

}
