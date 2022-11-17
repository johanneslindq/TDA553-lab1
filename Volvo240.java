import java.awt.*;

public class Volvo240 extends car{
    private final static double trimFactor = 1.25;
    public static void main(String[] args){
    }
    public Volvo240(){
        super(4, Color.black, 100, "Volvo240", 0, 0);
        stopEngine();
    }
    
    protected double speedFactor(){
        return enginePower * 0.01 * trimFactor;
    }

    protected void incrementSpeed(double amount){
	    currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount, getEnginePower());
    }

    protected void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }

     
}
