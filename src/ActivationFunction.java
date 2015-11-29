/**
 * An abstract outline of an activation function
 */
public abstract class ActivationFunction {
	public abstract double activate(double input);
}

/**
 *Sigmoid Activation Function
 */
class Sigmoid extends ActivationFunction{
	
	@Override
	public double activate(double input) {
		
	 return 1/(1+Math.exp(input));	
	}
}
