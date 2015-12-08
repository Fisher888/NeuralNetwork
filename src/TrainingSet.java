import java.io.File;
import java.io.IOException;

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
	
	public int getNumberOfInputs() {
		return numberOfInputs;
	}
	
	public int getNumberOfOutputs() {
		return numberOfOutputs;
	}

	public int getNumberOfTrials() {
		return numberOfTrials;
	}

	public Matrix getInputs(int trial) {
		
	}
	public static void main(String[] args) throws BiffException, IOException {
		TrainingSet t = new TrainingSet("TrainingSet1.xls");
	
		
	}
	

}
