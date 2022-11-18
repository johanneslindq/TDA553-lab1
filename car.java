
import java.awt.*;

public abstract class car implements movable{

protected int nrDoors; // Number of doors on the car
protected double enginePower; // Engine power of the car
protected double currentSpeed; // The current speed of the car
protected Color color; // Color of the car
protected String modelName; // The car model name
protected double x; // X coordinate
protected double y; // Y  coordinate
protected int direction; // The direction written as 0-3. 


public car(int nr_doors, Color car_color, int power, String model, double x, double  y){
    this.nrDoors = nr_doors;
    this.color = car_color;
    this.enginePower = power;
    this.modelName = model;
    this.x = x;
    this.y = y;
    this.direction = 0;
    stopEngine();
    
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

protected void gas(double amount){
    if (amount > 0 && amount <= 1){
        incrementSpeed(amount);
    }
    else{
        System.out.println("Fel gas värde, värdet ska ligga mellan 0 och 1.");
    }
}

protected void brake(double amount){

    if (amount < 0 || amount > 1){
        System.out.println("Fel broms värde, värdet ska ligga mellan 0 och 1.");
    }
    else{
        decrementSpeed(amount);
    }
}

protected abstract void incrementSpeed(double amount);
protected abstract void decrementSpeed(double amount);
protected abstract double speedFactor();

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
}