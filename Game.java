import java.util.Scanner;
/**
 * The 2-06 program with lesson 3
 * static means the variable is the same in every instance
 * while final means it can't be changed once it is assigned.
 *
 * @author  Mr. Coxall
 * @version 1.0
 * @since   2020-01-01
 */

class Game {
  public static void main(String[] args) {
    String choose = "";
    int randomNumber = -1;
    String random = "";
    int turn = 0;

    Scanner myobj = new Scanner(System.in);
    System.out.println("Rock, paper, scissor game!");
    for (int loopCounter = 0; loopCounter < loopCounter + 1; loopCounter++) {
      randomNumber = (int) Math.floor(Math.random() * (3 - 1 + 1) + 1);
      if (randomNumber == 1) {
        random = "rock";
      } else if (randomNumber == 2) {
        random = "paper";
      } else if (randomNumber == 3) {
        random = "scissor";
      }
      System.out.print("Please choose one from rock, paper and scissor: ");
      choose = myobj.nextLine();
      System.out.println("The computer chooses " + random);
      if (choose.equals("rock") || choose.equals("paper") || choose.equals("scissor")) {
        if (choose.equals(random)) {
          System.out.println("Tie.");
        } else {
          if (random.equals("rock")) {
            if (choose.equals("paper")) {
              break;
            } else {
              System.out.println("You lose!");
            }
          }
          if (random.equals("paper")) {
            if (choose.equals("scissor")) {
              break;
            } else {
              System.out.println("You lose!");
            }
          }
          if (random.equals("scissor")) {
            if (choose.equals("rock")) {
              break;
            } else {
              System.out.println("You lose!");
            }
          }
        }
      } else {
        System.out.println("Please choose one from rock, paper and scissor!");
      }
      System.out.println("Please try again.\n");
      turn = loopCounter + 1;
      if (turn + 1 > 5) {
        break;
      } else {
        continue;
      }
    }
    turn = turn + 1;
    if (turn > 5) {
      System.out.println("\nYou don't win in 5 turns!");
    } else {
      System.out.println("\nYou win!");
      System.out.println("It takes you " + turn + " turns to win the game.");
    }
    System.out.println("\nDone.");
  }
}

