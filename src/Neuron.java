import java.lang.Math;

import java.util.ArrayList;
import java.util.Random;

import Jama.Matrix;



/**
 * This class is used to create neurons. each neurons
 * has an input, output, activation function, and an array of weights
 * for all the input neurons of the previous layer.
 */
public class Neuron {

	
	private Matrix inputs;
	private Matrix weights;
	private double output;
	

	private ActivationFunction function;
	
	

	public Neuron(Matrix inputs, ActivationFunction function) {
		
		this.function=function;
		this.inputs=inputs;
		this.output=1;
		
		weights = new Matrix(1,inputs.getColumnDimension());
		
		Random rand = new Random();
		for(int i=0;i<weights.getRowDimension();i++){
			weights.set(1, i, rand.nextDouble());
		}
	}

	

	public double getOutput() {
		return output;
	}
	
	/**
	 * calculates input, runs it through activation function,
	 * returns 1 if neuron fires
	 * @param l input neuron Layer
	 */
	public void act(Matrix inputs) {
	
		this.inputs=inputs;
		
		output = activate(inputs.times(weights));
		
	
		
	}
	
	private double activate(Matrix m) {
		double sum = 0;
		
		for(int i=0;i<m.getRowDimension();i++){
			for(int j=0;j<m.getColumnDimension();j++){
				sum=+ m.get(i, j);
			}
		}
		
		sum=function.activate(sum);
		
		return sum;
	}

	/**
	 * updates weight of neuron
	 * by their corresponding weights
	 * @param error the error from back propigation function
	 */
	public void update(double error){
		
	}
	
	}
	