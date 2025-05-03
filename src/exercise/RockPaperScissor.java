package exercise;
import java.util.*;

public class RockPaperScissor {
    public static void main(String[] args) {
        //variables decelerations
        int opt;

        //generating the random number
        int randomNum = (int)(Math.random()*3)+1;
//		System.out.println(randomNum);


        System.out.println("Rock Paper Scissor");
        System.out.println("Your Choices are \n1.Rock \n2.Paper\n3.Scissor");
        System.out.print("Enter your Choice: ");
        Scanner input = new Scanner(System.in);
        opt = input.nextInt();
        input.close(); //closes the input in case of leak

        //using Ternary Operator to for value subsitution
        System.out.println("Computer Choose :" + (randomNum==1?"Rock":(randomNum==2?"Paper":"Scissor")));
        System.out.println("You Choose :" + (opt==1?"Rock":(opt==2?"Paper":"Scissor")));

        //condition for tie
        if(randomNum == opt) {
            System.out.println("Its a tie");
        }
        //condition for computer wins
        else if(randomNum==1 && opt == 3 || randomNum == 3 && opt == 2 || randomNum==2 && opt ==1 ) {
            System.out.println("Computer Wins");
        }
        //if computer does not win player wins
        else {
            System.out.println("You Win!");
        }
    }

}
