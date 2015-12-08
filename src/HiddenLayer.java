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
		
	}
	public ArrayList<Neuron> getNeurons() {
		return neurons;
	}
	public void setNeurons(ArrayList<Neuron> neurons) {
		this.neurons = neurons;
	}
	public Matrix getOutputs() {
		return outputs;
	}
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
	public void update(){
		
	}
	
}
