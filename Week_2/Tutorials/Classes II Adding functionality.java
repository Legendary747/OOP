class ParkingGarage {
    private int size;
    private int parkedCars;

    /**Constructor: creates a new ParkingGarage with size n, and 0 parked cars.
    * @param size - An int value representing the total amount of parking spaces in the garage.
    */
    public ParkingGarage(int size) {
        this.size = size;
        parkedCars = 0;
    }

    /**Getter for the size of the ParkingGarage.
    * @return the value of size.
    */
    public int getSize() {
        return size;
    }
    
    /**Getter for the amount of cars parked in the ParkingGarage.
    * @return the value of parkedCars.
    */
    public int getParkedCars() {
        return parkedCars;
    }

    // Your methods.
    public String parkCar() {
        if (parkedCars < getSize()) {
            parkedCars++;
            return "Car parked successfully!";
        } else {
            return "The garage is full!";
        }
    }

    public int freeSpaces() {
        return getSize() - parkedCars;
    }
    
}
