import java.util.ArrayList;

/**
 * This class is used to create network layers. 
 * Each layer consists of a list of neurons
 */
public class Layer {
	
 private ArrayList<Neuron> neurons;
 
 
 public Layer(int size, ActivationFunction function){
	 
	 neurons = new ArrayList<Neuron>();
	 
	 for(int i =0;i<size;i++){
		 neurons.add(new Neuron(this, function));
	 }
 }

 /**
  * returns the list of neurons contained in this layer
  */
public ArrayList<Neuron> getNeurons() {
	return neurons;
}

/**
 * Sets the list of neurons present in this layer
 * @param neurons The list of neurons the layer will contain
 */
public void setNeurons(ArrayList<Neuron> neurons) {
	this.neurons = neurons;
}

/**
 * Instructs all neurons in the layer to act
 */
public void act(){
	for(int i=0;i<neurons.size();i++){
		neurons.get(i).act(this);
	}
	
}

/**
 * Instructs all neurons to adjust their input weights
 * @param error The error which the the weights should be adjusted to
 */
public void update(double error){
}

}
