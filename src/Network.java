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
	
	Matrix inputData;
	
	//public static final int NUM_HIDDEN_LAYERS;
	//public static final int NUM_HIDDEN_NEURONS;
	
	public Network() throws BiffException, IOException{
	Workbook workbook = Workbook.getWorkbook(new File("test.xls"));
    Sheet sheet = workbook.getSheet(0);
    Cell cell1 = sheet.getCell(0, 1);
    
    String v = cell1.getContents();
    String v2 = sheet.getCell(0,2).getContents();
    
    int x;
    x= v.
    System.out.println(v+v2);
   
    
    workbook.close();
	}
	
	
	public static void main(String[] args) throws BiffException, IOException {
		Network n = new Network();
	}
}
