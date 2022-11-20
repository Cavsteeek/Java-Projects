import javax.swing.JOptionPane;
import java.util.Scanner;

public class rev1{
    public static void main(String[] args){
        //JOptionPane Revision
        int acck = (int)(Math.random()*101);
        JOptionPane.showMessageDialog(null,"Cavsteek's Hangout");
        String opt = JOptionPane.showInputDialog("1. Login\n2.Sign Up");
        int option = Integer.parseInt(opt);
        if(option == 1){
            String name = JOptionPane.showInputDialog("Username: ");
            JOptionPane.showMessageDialog(null,"This is your OTP(One Time Password) for login "+acck);
            String psswd = JOptionPane.showInputDialog("OTP: ");
            int pass = Integer.parseInt(psswd);
            if(pass == acck){
                JOptionPane.showMessageDialog(null,"Login Successful\nWelcome "+name);
            }
            else if(pass != acck){
                JOptionPane.showMessageDialog(null,"Wrong OTP\nTry Again");
                int count = 0;
                do{
                    psswd = JOptionPane.showInputDialog("OTP: ");
                    pass = Integer.parseInt(psswd);
                    if(pass == acck){
                        JOptionPane.showMessageDialog(null,"Login Successful\nWelcome "+name);
                    }
                    if(pass == acck){
                        break;
                    }
                    count++;
                    if(count == 3){
                        JOptionPane.showMessageDialog(null,"Reached your attempt limit try again");
                        continue;
                    }
                }
                while(count < 3);
            }
        }
        else if(option == 2){
            String name = JOptionPane.showInputDialog("Username: ");
            String age = JOptionPane.showInputDialog("Age: ");
            int age1 = Integer.parseInt(age);
            if(age1>18){
                JOptionPane.showMessageDialog(null,"You will receive an OTP shortly.......");
                JOptionPane.showMessageDialog(null,"Your OTP is "+acck);
                String psswd = JOptionPane.showInputDialog("OTP: ");
                int pass = Integer.parseInt(psswd);
                if(pass == acck){
                    JOptionPane.showMessageDialog(null,"Sign Up Successful\nWelcome "+name);
                }
                else if(pass != acck){
                    JOptionPane.showMessageDialog(null,"Wrong OTP\nTry Again");
                    int count = 0;
                    do{
                        psswd = JOptionPane.showInputDialog("OTP: ");
                        pass = Integer.parseInt(psswd);
                        if(pass == acck){
                            JOptionPane.showMessageDialog(null,"Sign Up Successful\nWelcome "+name);
                        }
                        if(pass == acck){
                            break;
                        }
                        count++;
                        if(count == 3){
                            JOptionPane.showMessageDialog(null,"Reached your attempt limit try again");
                            continue;
                        }
                    }
                    while(count < 3);
             }
            }
            else{
                JOptionPane.showMessageDialog(null,"You have to be atleast 18 years old to use this app");
            }
        }
    }
}