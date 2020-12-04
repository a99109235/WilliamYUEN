package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import util.FileReader;
import util.Shop;

public class Combine {
    

    public ArrayList<String> nameList = new ArrayList<String>();
    public ArrayList<String> idList = new ArrayList<String>();
    public ArrayList<String> combineList = new ArrayList<String>();
    
  





public Combine(Shop shop1, Shop shop2 ,Translate codeid) {

    int i = 0;
    int length1 = shop1.idList.size();
    
    int length2 = shop2.idList.size();
    // System.out.println(length);
    while(i<length1){
      if(codeid.idList.get(i)==null){
        break;
      }
      //statement
      // System.out.print(codeid.idList.get(i));
      // System.out.print(codeid.idList.get(i));
      System.out.print(codeid.idList.get(i));
      combineList.add(codeid.idList.get(i));
      System.out.print(",");
      System.out.print(shop1.idList.get(i));
      combineList.add(shop1.idList.get(i));
      System.out.print(",CWB QTY:");
      
      int k = 0;
      boolean checker = false;
      // if("a"=="a"){
      //   System.out.println("CORRECT");
      // }
      while(k<length2){

        if(shop1.idList.get(i).equals(shop2.idList.get(k))){
          System.out.print(shop1.quantityList.get(i));
          combineList.add(shop1.quantityList.get(i));
          System.out.print(",TKO QTY");
          System.out.println(shop2.quantityList.get(k));
          combineList.add(shop2.quantityList.get(i));
          checker = true;
        }else{
          // System.out.print("Not Mathch");
          
        }
        k+=1;
      }
      // if checker is false shop2 no such product
      if(!checker){
        System.out.println(shop1.quantityList.get(i));
      
      }
          

      i+=1;
    } // end of while loop



  }}