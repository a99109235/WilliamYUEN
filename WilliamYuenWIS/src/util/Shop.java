
	package util;

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;


	import util.FileReader;

	public class Shop {
	    

	    public ArrayList<String> idList;
	    public ArrayList<String> nameList;
	    public ArrayList<String> quantityList;
	    
	    public Shop(String shopPath) throws FileNotFoundException,NumberFormatException
	
	    {
	    	ArrayList<String> idList = new ArrayList<String>();
		    ArrayList<String> quantityList = new ArrayList<String>();
		    //ArrayList<String> dataList = new ArrayList<String>();
		    
		    File file = new File(shopPath);

		    Scanner scanner = new Scanner(file);

		    int a1 = 0;
		    while (scanner.hasNext()) {

		      List<String> line = FileReader.parseLine(scanner.nextLine());

		      a1 += 1;

		      if (a1 != 1) {
		        String[] info1 = new String[4];


		        // info id
		        info1[0] = line.get(0);
		        idList.add(info1[0]);

		        // info quantity
		        info1[1] = line.get(1);
		        quantityList.add(info1[1]);

		        //System.out.print(info1[0]);
		        //System.out.print(",  ");
		        //System.out.print(info1[1]);
		        
		        //System.out.println("------next-----");
		        //dataList.add(info1[0]);
		        //dataList.add(info1[1]);
		    }
//		    scanner.close();
		   this.idList = idList;
		   this.quantityList = quantityList;

		  }

	    }

	    // private void buildshop(String shopPath) throws FileNotFoundException, SkuNotExistException, NumberFormatException,
	    //     EmptyBlankInFileException {

	    // readShopTable(shopPath);

	    // }
	    

	}


