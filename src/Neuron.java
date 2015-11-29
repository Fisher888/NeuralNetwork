import java.lang.Math;
import java.util.ArrayList;
import java.util.Random;


/**
 * This class is used to create neurons. each neurons
 * has an input, output, activation function, and an array of weights
 * for all the input neurons of the previous layer.
 */
public class Neuron {

	private double input;
	private double output;
	private ActivationFunction function;
	private ArrayList<Double> inputWeights;

	public Neuron(Layer l, ActivationFunction function) {
		Random rand = new Random();
		this.function = function;
		input = 0;
		output = 0;
		inputWeights = new ArrayList<Double>();
		
		for(int i=0;i<l.getNeurons().size();i++){
			inputWeights.add(rand.nextDouble());
		}

	}

	
	/**
	 * returns input of the neuron
	 */
	public double getInput() {
		return input;
	}

	/**
	 * returns output of neuron
	 */
	public double getOutput() {
		return output;
	}

	/**
	 * calculates input, runs it through activation function,
	 * returns 1 if neuron fires
	 * @param l input neuron Layer
	 */
	public double act(Layer l) {
		double temp;

		setInput(l);
		temp = function.activate(input); // activation function (Sigmoid)

		if (temp >= 1)
			return 1;
		else
			return 0;
	}
	
	/**
	 * sets input to the sum all input neurons multiplied
	 * by their corresponding weights
	 * @param l Input Layer of neurons
	 */
	private void setInput(Layer l) {
		int i = 0;

		for (Neuron n : l.getNeurons()) {

			input = input + (n.getOutput() * this.inputWeights.get(i));
			i++;
		}
	}
}
