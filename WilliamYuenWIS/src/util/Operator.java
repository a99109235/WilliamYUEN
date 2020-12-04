package util;
import java.util.ArrayList;
import java.util.Scanner;



import util.Shop;

public class Operator {
    // public ArrayList<String> combineList = new ArrayList<String>();
    

	public Operator(ArrayList<String> combineList) {


        System.out.println("Please enter 1 for correction, 2 for company list");
        Scanner myObj = new Scanner(System.in);
        // Scanner myObj2 = new Scanner(System.in);
        String dataToBeChanged;
        dataToBeChanged = myObj.nextLine(); 
        if(dataToBeChanged.equals("1")){
          // GO TO CORRECT
          System.out.println("Now we will go to correct page");
          System.out.println("Please enter 1 for take from TKO, 2 for take from CWB");
          dataToBeChanged = myObj.nextLine(); 
          if(dataToBeChanged.equals("1")){
        //   Scanner myObj2 = new Scanner(System.in);
          System.out.println("Please enter the product code take from TKO eg.A-01");
          //catch element from arrylist
          String product = myObj.nextLine(); 
          int k = combineList.indexOf(product);
        //   System.out.print(k);
          k= k+1;
          
          System.out.println("Please enter the quantity take from TKO");
          int qty0 = myObj.nextInt();
          String oqty = combineList.get(k); // get value
          int qty11 =Integer.parseInt(oqty);
          qty11 = qty11 + qty0; // increment value
          oqty=String.valueOf(qty11);
          combineList.set(k, oqty); // replace value1
        //   int qty0 = myObj.nextInt();
        //   int qty1 = combineList.get(k) -- qty0;
        //   combineList.set(k, qty1) ;  
           k= k+1;
           String oqty1 = combineList.get(k); // get value
           int qty12 =Integer.parseInt(oqty1);
           qty12 = qty12 - qty0; // increment value
           oqty1=String.valueOf(qty12);
           combineList.set(k, oqty1); // replace value1
    
          }
          else if(dataToBeChanged.equals("2"))
          {System.out.println("Please enter the product code take from CWB");
          String product = myObj.nextLine(); 
          int k = combineList.indexOf(product);
        //   System.out.print(k);
          k= k+2;
          
          System.out.println("Please enter the quantity take from CWB");
          int qty0 = myObj.nextInt();
          String oqty = combineList.get(k); // get value
          int qty11 =Integer.parseInt(oqty);
          qty11 = qty11 + qty0; // increment value
          oqty=String.valueOf(qty11);
          combineList.set(k, oqty); // replace value1
        //   int qty0 = myObj.nextInt();
        //   int qty1 = combineList.get(k) -- qty0;
        //   combineList.set(k, qty1) ;  
           k= k-1;
           String oqty1 = combineList.get(k); // get value
           int qty12 =Integer.parseInt(oqty1);
           qty12 = qty12 - qty0; // increment value
           oqty1=String.valueOf(qty12);
           combineList.set(k, oqty1); // replace value1
    
        }
          else{System.out.println("Invalid output, please reenter");}
        }else if(dataToBeChanged.equals("2")){
          // GOTO COMPANY LIST
          
          System.out.println("Now we will go to LIST page");
        }else{
          // please re-enter
          System.out.println("Invalid output, please reenter");
          
    }
    }
}
