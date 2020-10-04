import java.util.Scanner;
/**
 *
 * @author Gavin Sandhar
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create scanner for user input
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter an integer to count down to");
     int count = 100;
     int number = input.nextInt();
     while(count >= number){
      // print the number we are at
      System.out.println(count);
      // decrease number by 5
      count = count - 5;
     }
    System.out.println("All Done!");
  }
}

