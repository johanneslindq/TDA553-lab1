
import java.awt.*;

public abstract class car{

protected int nrDoors; // Number of doors on the car
protected double enginePower; // Engine power of the car
protected double currentSpeed; // The current speed of the car
protected Color color; // Color of the car
protected String modelName; // The car model name

public car(int nr_doors, Color car_color, int power, String model){
    this.nrDoors = nr_doors;
    this.color = car_color;
    this.enginePower = power;
    this.modelName = model;
}

public int getNrDoors(){
    return nrDoors;
}
public double getEnginePower(){
    return enginePower;
}

public double getCurrentSpeed(){
    return currentSpeed;
}

public Color getColor(){
    return color;
}

public void setColor(Color clr){
    color = clr;
}

public void startEngine(){
    currentSpeed = 0.1;
}

public void stopEngine(){
    currentSpeed = 0;
}

// TODO fix this method according to lab pm
public void gas(double amount){
    incrementSpeed(amount);
}

// TODO fix this method according to lab pm
public void brake(double amount){
    decrementSpeed(amount);
}

public abstract void incrementSpeed(double amount);
public abstract void decrementSpeed(double amount);
public abstract double speedFactor();


}