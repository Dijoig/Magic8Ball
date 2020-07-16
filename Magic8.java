import java.util.Random;
import java.util.Scanner;

public class Magic8 {
  public static void main(String[] args) {
    //Generating random factor for the answers the ball will give:
    Random random = new Random();
    int randomFactor1 = random.nextInt(6);
    int randomFactor2 = random.nextInt(6);

    //Generating array of possible answers:
    String[] answers = {"Oh yes! Definetely", "Yeah Yeah, i think so....", "Yes", "Maybe. Probably Maybe", "No", "Oh.... I wouldn't count on that", "Oh no! God no!"};

    //Interacting with user through questions and getting the input question as string:
    System.out.println("Welcome to the Magic8Ball! You can ask me anything...");
    System.out.println("As long as the answer is Yes or No");
    System.out.println("Tell me human, what do you wish to know?");
    //Getting user input:
    Scanner scanner = new Scanner(System.in);
    String question1 = scanner.nextLine();
    if (question1.contains("?")) {
      System.out.println(answers[randomFactor1]);
      System.out.println("Is there anything else you wish to know?");
    } else {
      System.out.println("I believe you are confused... questions need a '?' pontuation....");
    }

    //Answering randomly based on the answers list:
    System.out.println("Is there anything else you wish to know?");
    String question2 = scanner.nextLine();
    if (question2.contains("?")) {
      System.out.println(answers[randomFactor2]);
      System.out.println("I am afraid you are out of questions now...");;
    } else {
      System.out.println("I believe you are confused... questions need a '?' pontuation....");
      System.out.println("I am afraid you are out of questions now...");
    }



  }
}