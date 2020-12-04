
import java.io.IOException;
import java.util.ArrayList;
import util.Combine;
import util.Operator;
import util.OutputFileWriter;
import util.Shop;
import util.Translate;

public class Main {

	  /** Run the simulation. */
	  public static void main(String[] args)  throws NumberFormatException, IOException{

	    Shop shop1 = new Shop(".\\CWB.csv"); 
	    Shop shop2 = new Shop(".\\TKO.csv"); 
	    Translate codeid = new Translate(".\\translation.csv");
	    //array
	    Combine combine = new Combine(shop1 , shop2 , codeid);



	       // 1. read code array (A1 - > Apple, A2 -> Orange)
	       // 2. Check if other shop array contain code array element 
	       // 3. for each element gather all the data from three shop and sum up a new dataset
	       // 4. put the sum uped data into new 'final.csv'
	    
	    // ------------------- OPERATION---------------
	    
        Operator operater = new Operator(combine.combineList);

	    // --------------------output class------------------
	    OutputFileWriter writeFile = new OutputFileWriter(combine.combineList);
	    writeFile.writeCsvFile();
	    // writeFile.writeOrderFile();


	  }
}
