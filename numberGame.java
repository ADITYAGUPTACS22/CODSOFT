import java.util.*;
public class numberGame {
    public static void main (String args[])
    {
        Random rand=new Random();
        int number =rand.nextInt(100);
        System.out.println(number);

        Scanner sc=new Scanner(System.in);
        for(int j=1;j<=5;j++){
            System.out.println("Predict the number between 1 to 100 : ");
            int Predict =sc.nextInt();
            if(Predict==number){
                System.out.println("Right");
                System.out.println("You will be a winner");
                System.out.println("You have Predicted the number in : "+j+" chance");
                break;
            }
            else if(Predict>number){
                System.out.println("Too High");
            }
            else{
                System.out.println("Too Low");
            }
            for(int k=j;k==5;){
                System.out.println("sorry! You lose the game.");
                System.out.println("Do you replay the game.");
                break;
            }
        }
    }
}
