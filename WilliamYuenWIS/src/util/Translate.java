package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import util.FileReader;

public class Translate {
    
    public ArrayList<String> nameList;
    public ArrayList<String> idList;
    
    public Translate(String shopPath) throws FileNotFoundException {

        ArrayList<String> idList = new ArrayList<String>();
        ArrayList<String> nameList = new ArrayList<String>();
        ArrayList<String> dataList = new ArrayList<String>();
        
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

            // info name
            info1[1] = line.get(1);
            nameList.add(info1[1]);

            System.out.print(info1[1]);
            System.out.print(",  ");
            System.out.print(info1[0]);
            
            System.out.println("------next-----");
            dataList.add(info1[1]);
            dataList.add(info1[0]);
        }
//        scanner.close();
       this.idList = idList;
       this.nameList = nameList;

      }
    }
}