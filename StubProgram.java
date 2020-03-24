import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class StubProgram {

  /**
  * StubProgram uses MrCoxallStack.
  */

  public static void main(String[] args) {
    // program lets users add items to the MrCoxallStack
    MrCoxallStack anStack = new MrCoxallStack();
    String anItem;

    InputStreamReader r = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(r);

    Scanner input = new Scanner(System.in);
        
    System.out.println("Enter the amount of items you want in the stack:");
    int stackNumber = input.nextInt();
    
    for (int lockNumber = 0; lockNumber < stackNumber; lockNumber++) {
      System.out.println("Enter an item to the stack");
      try {
        anItem = br.readLine();
        anStack.push(anItem);
      
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        
      }
    }
  }
}