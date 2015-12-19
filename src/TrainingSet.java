import java.io.File;
import java.io.IOException;

import Jama.Matrix;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TrainingSet {
	
	
	private int numberOfInputs;
	private int numberOfOutputs;
	private int numberOfTrials;
	private Workbook workbook;
	private Sheet infoSheet;
	private Sheet dataSheet;
	private Cell cell;
	
	
	
	public TrainingSet(String docName) throws BiffException, IOException{
		workbook = Workbook.getWorkbook(new File(docName));
	    infoSheet = workbook.getSheet(1);
	    dataSheet = workbook.getSheet(0);
	    
	   cell = infoSheet.getCell(0, 1);
	   numberOfInputs = Integer.parseInt(cell.getContents());
	   
	   cell = infoSheet.getCell(1, 1);
	   numberOfOutputs = Integer.parseInt(cell.getContents());
	   
	   cell = infoSheet.getCell(2, 1);
	   numberOfTrials = Integer.parseInt(cell.getContents());
	   
	    
	    workbook.close();
		}
	
	/**
	 * Returns number of inputs for the training set
	 */
	public int getNumberOfInputs() {
		return numberOfInputs;
	}
	
	/**
	 * Returns number of outputs for the training set
	 */
	public int getNumberOfOutputs() {
		return numberOfOutputs;
	}
	
	/**
	 * Returns number of trials for the training set
	 */
	public int getNumberOfTrials() {
		return numberOfTrials;
	}
	
	/**
	 * returns a matrix of inputs for a given trial
	 * @param trial the trial number to return inputs for.
	 */
	public Matrix getInput(int trial) {
		
		double[][] inputs = new double[numberOfInputs][1];
		
		for(int i=0;i<numberOfInputs;i++){
			cell = dataSheet.getCell(i,trial+1);
			inputs[i][1]= Integer.parseInt(cell.getContents());
		}
		
		return new Matrix(inputs);
	}
	
	/**
	 * returns a matrix of inputs for a given trial
	 * @param trial the trial number to return inputs for.
	 */
	public Matrix getOutput(int trial) {
		
		double[][] outputs = new double[numberOfOutputs][1];
		
		for(int i=0;i<numberOfOutputs;i++){
			cell = dataSheet.getCell(numberOfInputs+i,trial+1);
			outputs[i][1]= Integer.parseInt(cell.getContents());
		}
		
		return new Matrix(outputs);
	}
}
