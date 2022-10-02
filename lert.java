import java.util.Scanner;
public class lert {
    public static void main(String[] args){
        System.out.println("Hello There, please input your age and full name");
        Scanner all = new Scanner(System.in);
        System.out.print("Age: ");
        int age = all.nextInt();
        all.nextLine();
        System.out.println();
        System.out.print("Full name: ");
        String name = all.nextLine();
        System.out.println();
         System.out.println("Your age is: "+age);
        System.out.println("Your full name is: "+name);
        System.out.println();
        System.out.println("Are your details correct?");
        System.out.println("1 - Yes, 2 - No,: ");
        int choice = all.nextInt();
        all.nextLine();
        if(choice==1)
        {
            System.out.println("Welcome!.......");
            System.out.println("What genre of movie do you want to watch?");
            System.out.println("1. Action");
            System.out.println("2. Romance");
            System.out.println("3. Comedy");
            System.out.print(": ");
            int option = all.nextInt();
            all.nextLine();
             System.out.println();
            switch(option)
            {
                case 1:
                    System.out.println("We have handpicked the best 2022 action movies for you.......enjoy");
                    break;
                case 2: 
                    if(age<15){
                          System.out.println("You're not eligible to view this genre");
                    }
                    else{
                          System.out.println("We have handpicked the best 2022 romance movies for you.......enjoy");
                    }
                  
                    break;
                case 3:
                    System.out.println("We have handpicked the best 2022 comedy movies for you.......enjoy");
                    break;
                default:
                    System.out.println("You have picked outside your options restart and try a valid option");
                    break;
            }


        }
        else if(choice == 2)
        {
              System.out.println("you'll have to restart the program, next time input valid details");
        }


    }
}