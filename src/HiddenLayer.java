import java.util.ArrayList;

import Jama.Matrix;

public class HiddenLayer {

	private ArrayList<Neuron> neurons;
	private Matrix outputs;


	public HiddenLayer(int size, Matrix inputs, ActivationFunction function){
		outputs = new Matrix(size,1);
		neurons = new ArrayList<Neuron>();

		for(int i =0;i<size;i++){
			neurons.add(new Neuron(inputs,function));
		}


		/**
		 * Returns a list of neurons present in the layer
		 */
	}
	public ArrayList<Neuron> getNeurons() {
		return neurons;
	}

	/**
	 * sets the neurons on this layer
	 * @param neurons List of neurons add to the layer
	 */
	public void setNeurons(ArrayList<Neuron> neurons) {
		this.neurons = neurons;
	}

	/**
	 * Returns output Matrix of the layer
	 */
	public Matrix getOutputs() {
		return outputs;
	}

	/**
	 * Returns number of inputs for the training set
	 */
	public void act(Matrix inputs){
		double[][] vals = new double[neurons.size()][1];
		int i=0;

		for(Neuron n: neurons){
			n.act(inputs);
			vals[i][1]=n.getOutput();
			i++;
		}
		outputs=new Matrix(vals);
	}

	/**
	 * Updates the layer
	 */
	public void update(){

	}

}
