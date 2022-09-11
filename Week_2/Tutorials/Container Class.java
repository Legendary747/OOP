package weblab;

class Showroom {
  
  private Car[] cars;
  private int amount;

  public Showroom(int size){
    this.amount = 0;
    cars = new Car[size];
  } 

  public int getShowroomSize() {
    return cars.length;
  }

  public Car getCar(int i) {
    if (i >= amount) throw new IllegalArgumentException();
    else {
      return cars[i];
    }
  }

  public int getAmount() {
    return this.amount;
  }

  public void addCar(Car car) {
    if (amount < cars.length) {
      cars[amount++] = car;
    } else {
      throw new IllegalArgumentException();
    }
  }
  
}