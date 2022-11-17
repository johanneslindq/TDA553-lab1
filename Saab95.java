import java.awt.*;

public class Saab95 extends car{

    private boolean turboOn;
    
    public Saab95(){
        super(2, Color.red, 125, "Saab95");
	    this.turboOn = false;
        stopEngine();
    }

    protected void setTurboOn(){
	    turboOn = true;
    }

    protected void setTurboOff(){
	    turboOn = false;
    }
    
    protected double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

    protected void incrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    protected void decrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }
    
}

