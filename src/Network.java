import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

import Jama.Matrix;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 * This class is used to create neurons. each neurons
 * has an input, output, activation function, and an array of weights
 * for all the input neurons of the previous layer.
 */
public class Network {
	
	private TrainingSet data;
	
	public Network(String fileName, int numberOfHiddenLayers, int neuronsPerLayer) throws BiffException, IOException{
		
	data = new TrainingSet(fileName);
	
    
	}
	
	
	public static void main(String[] args) throws BiffException, IOException {
		Network n = new Network();
	}
}
