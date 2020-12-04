package util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;




public class OutputFileWriter {
  private FileWriter fileWriter1;
  public ArrayList<String> combineList;

  public OutputFileWriter(ArrayList<String> combineList)
      throws IOException {
    fileWriter1 = new FileWriter(new File("final.csv"));
    this.combineList = combineList;
  }



  public void writeCsvFile() {
    int combineLength = combineList.size();
    int i = 0;
    while (i<combineLength) {

      try {
        fileWriter1.append(combineList.get(i));
        fileWriter1.append(',');
        fileWriter1.append(combineList.get(i+1));
        fileWriter1.append(',');
        fileWriter1.append(combineList.get(i+2));
        fileWriter1.append(',');
        fileWriter1.append(combineList.get(i+3));
        fileWriter1.append('\n');
        i+=4;

      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
    try {
      fileWriter1.flush();
      fileWriter1.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    // Read me to shorten the debug time.
    // Next time when you start debugging, shart from here!
    // Hint: check here, the finishRequestProcessor is empty,
    // so nothing is written on the orders.csv
    // System.out.print(finishedRequestProcessor.getContents() + " ooooooooooooooo");

  }

}

