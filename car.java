
import java.awt.*;
import java.util.HashMap;

public abstract class car implements movable{

protected int nrDoors; // Number of doors on the car
protected double enginePower; // Engine power of the car
protected double currentSpeed; // The current speed of the car
protected Color color; // Color of the car
protected String modelName; // The car model name
protected double x;
protected double y;
protected int direction;


public car(int nr_doors, Color car_color, int power, String model, double x, double  y){
    this.nrDoors = nr_doors;
    this.color = car_color;
    this.enginePower = power;
    this.modelName = model;
    this.x = x;
    this.y = y;
    this.currentSpeed = 0;
    this.direction = 0;
}

public void move(){
    switch (direction){
        case 0: 
        setY(getY() + getCurrentSpeed());
        break;
        case 1:
        setX(getX() - getCurrentSpeed());
        break;
        case 2:
        setY(getY() - getCurrentSpeed());
        break;
        case 3:
        setX(getX() + getCurrentSpeed());
        break;
    }
}

public void turnLeft(){
    direction += 1;
    direction = direction % 4;
}

public void turnRight(){
    direction -= 1;
    direction = (((direction % 4) + 4) % 4);
}

public int getDirection(){
    return direction;
}
public int getNrDoors(){
    return nrDoors;
}
public double getEnginePower(){
    return enginePower;
}

public void setX(double new_x){
    x = new_x;
}
public void setY(double new_y){
    y = new_y;
}

public double getX(){
    return x;
}
public double getY(){
    return y;
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

protected void startEngine(){
    currentSpeed = 0.1;
}

protected void stopEngine(){
    currentSpeed = 0;
}

// TODO fix this method according to lab pm
protected void gas(double amount){
    incrementSpeed(amount);
}

// TODO fix this method according to lab pm
protected void brake(double amount){
    decrementSpeed(amount);
}

protected abstract void incrementSpeed(double amount);
protected abstract void decrementSpeed(double amount);
protected abstract double speedFactor();


}