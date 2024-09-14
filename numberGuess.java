import java.util.Random;
import java.util.Scanner;

class numberGuess{
  public static void main(String[] args){
    
    Random rand = new Random();
    Scanner scan = new Scanner(System.in);
    
    int n = 0;
    int counter = 1;
    
   System.out.println("\n ___Guess_The_Number_Game___  \n");
   System.out.print("Enter Deficulty by 'n' attempts :");
   n = scan.nextInt();
   System.out.printf("\nOnly you have %d attempts 1-100 \n\n\n",n);
   
  int number = rand.nextInt(100)+1;
   
   while(counter <= n)
   {
   System.out.print(counter+" Guess the number :");
   int input = scan.nextInt();

   if(input > number){
     System.out.println(">>>Entered is High... less the number\n");
   }
   else 
   {
     if(input < number){
     System.out.println(">>>Entered is Low... add the number\n");
      }
    else{
       System.out.println("\n\nCorrect guess ..you won the game..\n\n");
      break;
     }
     }
   counter++;
   }
   
   if(counter==(n+1))
   {
     System.out.printf("\nThe number is %d ..you lost the game..\ntry again ;)\n\n",number);
   }
   }
  }
