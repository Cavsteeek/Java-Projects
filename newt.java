import java.util.Scanner;
public class newt{
    public static void main(String[] args){
        String[] name = new String[5];
        int[] matNO = new int[5];
        Scanner inu = new Scanner(System.in);
        System.out.println("Students and Their Matric Number");
        System.out.println("Input your matric number and name");
      //Code block for accepting user input  
      for(int i=0;i<5;i++){
        System.out.print("Matric Number: ");
        matNO[i]=inu.nextInt();
        inu.nextLine();
        System.out.println();
        System.out.print("Full Name: ");
        name[i]=inu.nextLine();
        System.out.println();
        }
      //Code block for the output of the user input
        for(int j=0;j<5;j++){
            System.out.print("Student ID");
            System.out.print(" "+j+1);
            System.out.print(": ");
            System.out.print(" "+name[j]);
            System.out.print(", "+matNO[j]);
            System.out.println();
        }
    }
}
