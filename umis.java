import java.util.Scanner;
public class umis{
    static Scanner fuse = new Scanner(System.in);
    static int chce;
    static void wlcme(){
        System.out.println("                                           Welcome to GREGORY COLLEGE");
        System.out.println("______________________________________________________________________________________________________________");
        System.out.println("- Already a Student[Enter one to proceed]                                 - New Student[Enter two to Proceed]");
    }
    public static void main(String[] args){
        wlcme();
        int slction;
        System.out.print(": ");
        slction = fuse.nextInt();
        fuse.nextLine();
        System.out.println();
        if(slction == 1)
        {
            System.out.print("Full Name: ");
            String fname = fuse.nextLine();
            System.out.println();
            System.out.print("Matric Number: ");
            String mat = fuse.nextLine();
            System.out.println();
            System.out.print("Password: ");
            String pass;
            pass=fuse.nextLine();
            System.out.println();
            int acck = (int)(Math.random()*101);
            System.out.println("Your access key is - "+acck);
            System.out.println();
            System.out.println("Note - you'll be asked for your unique access key everytime you want to make changes to your page");
            System.out.println();
            System.out.println("Welcome Back");
            System.out.println();
            System.out.println("1. Report a Problem");
            System.out.println();
            System.out.println("2. Check Semester Result");
            System.out.println();
            System.out.println("3. Register for Semester");
            System.out.println();
            System.out.print(": ");
            chce = fuse.nextInt();
            fuse.nextLine();
            System.out.println();
            if(chce == 1)
            {
                System.out.print("Access key: ");
                int op1 = fuse.nextInt(); 
                System.out.println();
                if(op1==acck)
                {
                    System.out.println("Complaint(PS:Enter exits the complaint box): ");
                    String plaint = fuse.nextLine();
                    System.out.println("YOUR COMPLAINT HAS BEEN RECORDED, WE'LL GET BACK TO YOU SHORTLY");
                }
                else{
                    System.out.println("You have been logged out of your page (Incorrect Access key)");
                }
                
            }
            else if(chce == 2)
            {
                System.out.print("Access key: ");
                int op1 = fuse.nextInt();
                System.out.println();
                if(op1==acck){
                    System.out.print("Enter your level(Numbers Only): ");
                    int lvl = fuse.nextInt();
                    System.out.println();
                    if((lvl>600 || lvl<100))
                    {
                        System.out.println("Unable to fetch data");
                    }
                    else if(lvl == 100){
                        System.out.println("(Numbers Only) 1. Sem1          2. Sem2");
                        System.out.print(": ");
                        int lv1 = fuse.nextInt();
                        System.out.println();
                        if(lv1==1){
                            System.out.println("Notice: You can only download your result at the moment");
                            System.out.println("1. PDF   2.PNG   3.JPG");
                            System.out.print(": ");
                            int don = fuse.nextInt();
                            System.out.println();
                            if((don==1 || don==2 || don==3))
                            {
                                System.out.println("Downloading.......Check your Browser for Details");
                            }
                        }else if(lv1==2){
                            System.out.println("Notice: You can only download your result at the moment");
                            System.out.println("1. PDF   2.PNG   3.JPG");
                            System.out.print(": ");
                            int don1 = fuse.nextInt();
                            System.out.println();
                            if((don1==1 || don1==2 || don1==3))
                            {
                                System.out.println("Downloading.......Check your Browser for Details");
                            }
                        }
                    }
                    else if(lvl == 200){
                         System.out.println("(Numbers Only) 1. Sem1          2. Sem2");
                         System.out.print(": ");
                        int lv2 = fuse.nextInt();
                        System.out.println();
                        if(lv2==1){
                            System.out.println("Notice: You can only download your result at the moment");
                            System.out.println("1. PDF   2.PNG   3.JPG");
                            System.out.print(": ");
                            int don2 = fuse.nextInt();
                            System.out.println();
                            if((don2==1 || don2==2 || don2==3))
                            {
                                System.out.println("Downloading.......Check your Browser for Details");
                            }
                        }else if(lv2==2){
                            System.out.println("Notice: You can only download your result at the moment");
                            System.out.println("1. PDF   2.PNG   3.JPG");
                            System.out.print(": ");
                            int don3 = fuse.nextInt();
                            System.out.println();
                            if((don3==1 || don3==2 || don3==3))
                            {
                                System.out.println("Downloading.......Check your Browser for Details");
                            }
                        }
                    }
                    else if(lvl == 300){
                         System.out.println("(Numbers Only) 1. Sem1          2. Sem2");
                        int lv3 = fuse.nextInt();
                        if(lv3==1){
                            System.out.println("Notice: You can only download your result at the moment");
                            System.out.println("1. PDF   2.PNG   3.JPG");
                            System.out.print(": ");
                            int don4 = fuse.nextInt();
                            System.out.println();
                            if((don4==1 || don4==2 || don4==3))
                            {
                                System.out.println("Downloading.......Check your Browser for Details");
                            }
                        }else if(lv3==2){
                            System.out.println("Notice: You can only download your result at the moment");
                            System.out.println("1. PDF   2.PNG   3.JPG");
                            System.out.print(": ");
                            int don5 = fuse.nextInt();
                            System.out.println();
                            if((don5==1 || don5==2 || don5==3))
                            {
                                System.out.println("Downloading.......Check your Browser for Details");
                            }
                        }
                    }
                    else if(lvl == 400){
                         System.out.println("(Numbers Only) 1. Sem1          2. Sem2");
                        int lv4 = fuse.nextInt();
                        if(lv4==1){
                            System.out.println("Notice: You can only download your result at the moment");
                            System.out.println("1. PDF   2.PNG   3.JPG");
                            System.out.print(": ");
                            int don6 = fuse.nextInt();
                            System.out.println();
                            if((don6==1 || don6==2 || don6==3))
                            {
                                System.out.println("Downloading.......Check your Browser for Details");
                            }
                        }else if(lv4==2){
                            System.out.println("Notice: You can only download your result at the moment");
                            System.out.println("1. PDF   2.PNG   3.JPG");
                            System.out.print(": ");
                            int don7 = fuse.nextInt();
                            System.out.println();
                            if((don7==1 || don7==2 || don7==3))
                            {
                                System.out.println("Downloading.......Check your Browser for Details");
                            }
                        }
                    }
                    else if(lvl == 500){
                         System.out.println("(Numbers Only) 1. Sem1          2. Sem2");
                        int lv5 = fuse.nextInt();
                        if(lv5==1){
                            System.out.println("Notice: You can only download your result at the moment");
                            System.out.println("1. PDF   2.PNG   3.JPG");
                            System.out.print(": ");
                            int don8 = fuse.nextInt();
                            System.out.println();
                            if((don8==1 || don8==2 || don8==3))
                            {
                                System.out.println("Downloading.......Check your Browser for Details");
                            }
                        }else if(lv5==2){
                            System.out.println("Notice: You can only download your result at the moment");
                            System.out.println("1. PDF   2.PNG   3.JPG");
                            System.out.print(": ");
                            int don9 = fuse.nextInt();
                            System.out.println();
                            if((don9==1 || don9==2 || don9==3))
                            {
                                System.out.println("Downloading.......Check your Browser for Details");
                            }
                        }
                    }
                    else if(lvl == 600)
                    {
                         System.out.println("(Numbers Only) 1. Sem1          2. Sem2");
                        int lv6 = fuse.nextInt();
                        if(lv6==1){
                            System.out.println("Notice: You can only download your result at the moment");
                            System.out.println("1. PDF   2.PNG   3.JPG");
                            System.out.print(": ");
                            int don10 = fuse.nextInt();
                            System.out.println();
                            if((don10==1 || don10==2 || don10==3))
                            {
                                System.out.println("Downloading.......Check your Browser for Details");
                            }
                        }else if(lv6==2){
                            System.out.println("Notice: You can only download your result at the moment");
                            System.out.println("1. PDF   2.PNG   3.JPG");
                            System.out.print(": ");
                            int don0 = fuse.nextInt();
                            System.out.println();
                            if((don0==1 || don0==2 || don0==3))
                            {
                                System.out.println("Downloading.......Check your Browser for Details");
                            }
                        }
                    }
                }
                else{
                    System.out.println("You have been logged out of your page (Incorrect Access key)");
                }
            }
            else if(chce == 3)
            {
                System.out.print("Access key: ");
                int op2 = fuse.nextInt();
                System.out.println();
                if(op2==acck)
                {
                    System.out.println("Off campus? - type '.' and press enter to proceed");
                    System.out.println();
                    System.out.print("Level: ");
                    int l=fuse.nextInt();
                    fuse.nextLine();
                    System.out.println();
                    System.out.print("School: ");
                    String soh = fuse.nextLine();
                    System.out.println();
                     System.out.print("Hall of Residence: ");
                    String nit = fuse.nextLine();
                    System.out.println();
                    System.out.print("Worship Center: ");
                    String wshctr = fuse.nextLine();
                    System.out.println();
                    System.out.print("Department: ");
                    String dept=fuse.nextLine();
                    System.out.println();
                    System.out.println("Your Course list & Course form for the semester will be sent to you via E-mail");
                    System.out.println();
                    System.out.println("Paid for the session/semester?(yes/no || y/n || Y/N || Yes/No || YES/NO)");
                    System.out.print(": ");
                    String yn = fuse.nextLine();
                    System.out.println();
                    if((yn.equals("Yes") || yn.equals("No") || yn.equals("y") || yn.equals("n") || yn.equals("Y") || yn.equals("N") || yn.equals("yes") || yn.equals("no") || yn.equals("YES") || yn.equals("NO")))
                    {
                        System.out.println("______________________________________________________________________________");
                        System.out.println("|                                                                            |");
                        System.out.println("|                               GREGORY COLLEGE                              |");
                        System.out.println("|____________________________________________________________________________|");
                        System.out.println("|                                                                            |");
                        System.out.println("|                              STUDENT RECEIPT                               |");
                        System.out.println("|____________________________________________________________________________|");
                        System.out.println();
                        System.out.println("~ Name: "+fname);
                        System.out.println();
                        System.out.println("~ Matric NO.: "+mat);
                        System.out.println();
                        System.out.println("~ Level: "+l);
                        System.out.println();
                        System.out.println("~ School: "+soh);
                        System.out.println();
                        System.out.println("~ Department: "+dept);
                        System.out.println();
                        System.out.println("~ Hall of Residence: "+nit);
                        System.out.println();
                        System.out.println("~ Worship Center: "+wshctr);
                        System.out.println();
                        System.out.println("|____________________________________________________________________________|");

                    }
                    else{
                        System.out.println("Pay to bursary and come back to complete your registration");
                    }


                }
                else{
                    System.out.println("You have been logged out of your page (Incorrect Access key)");
                }
        }


        }
        else if(slction==2)
        {
            System.out.println("1. Enquiries");
            System.out.println("2. Admissions");
            System.out.print(": ");
            chce=fuse.nextInt();
            fuse.nextLine();
            System.out.println();
            if(chce==1){
                System.out.println("1. School Fees");
                System.out.println("2. Requirements");
                System.out.println("3. How to Apply");
                System.out.print(": ");
                chce=fuse.nextInt();
                fuse.nextLine();
                System.out.println();
                switch(chce)
                {
                    case 1: 
                        System.out.println("Undergraduate Fees Structure");
                        System.out.println("                  100 - 200 LEVEL     300 - 500 LEVEL");
                        System.out.println("PROGRAMME      (#)FULL YEAR 1ST SEM   FULLYEAR 1ST SEM");
                        System.out.println("ACCOUNTING        739,449   406,697   568,807  310,865");
                        System.out.println("AGRICULTURE       654,129   359,771   503,176  274,996");
                        System.out.println("ANATOMY           711,009   391,055   546,930  298,909");
                        System.out.println("BANKING&FINANCE   711,009   391,055   546,930  298,909");
                        System.out.println("BIOCHEMISTRY      711,009   391,055   546,930  298,909");
                        System.out.println("BUSINESSADMIN     711,009   391,055   546,930  298,909");
                        System.out.println("COMPUTERINFOSYS   739,449   406,697   568,807  310,865");
                        System.out.println("COMPUTERSCIENCE   739,449   406,697   568,807  310,865");
                        System.out.println("COMPUTERTECH      739,449   406,697   568,807  310,865");
                        System.out.println("ECONOMICS         711,009   391,055   546,930  298,909");
                        System.out.println("ENGLISH/FRNCH/MSC 682,569   375,413   525,053  286,952");
                        System.out.println("EDUCATIONPROGRMS  375,413   206,477   288,779  157,824");
                        System.out.println("HISTORY&INTLRLTS  654,129   359,771   503,176  274,996");
                        System.out.println("MARKETING         711,009   391,055   546,930  298,909");
                        System.out.println("MASS COMM.        711,009   391,055   546,930  298,909");
                        System.out.println("MICROBIOLOGY      711,009   391,055   546,930  298,909");
                        System.out.println("NURSING SCIENCE   739,449   406,697   568,807  310,865");
                        System.out.println("NUTRITION & DIET  654,129   359,771   503,176  274,996");
                        System.out.println("PHYSIOLOGY        711,009   391,055   546,930  298,909");
                        System.out.println("POLITICAL SCIENCE 682,569   375,413   525,053  286,952");
                        System.out.println("SOCIAL WORK       682,569   375,413   525,053  286,952");
                        System.out.println("PUBLIC HEALTH     682,569   375,413   525,053  286,952");
                        System.out.println("PUBLIC ADMIN      682,569   375,413   525,053  286,952");
                        System.out.println("SOFTWARE ENG.     739,449   406,697   568,807  310,865");
                        System.out.println("THEOLOGY          625,688   344,128   481,298  263,040");
                        break;
                    case 2:
                        System.out.println("GENERAL ENTRY REQUIREMENTS:");
                        System.out.println("Minimum qualification for the First Degree Programs: 5 credits at the GCE/SSCE/NECO Examinations or their equivalent (at not more than 2 sittings); one sitting only for Medicine. Candidates below 15 years of age are advised not to apply.");
                        System.out.println("CANDIDATES AWAITING 2022 WAEC/NECO/SSCE RESULTS WILL BE REQUIRED TO PRESENT ACCEPTABLE QUALIFICATIONS BEFORE MATRICULATION.");
                        break;
                    case 3:
                        System.out.println("GOTO: 'www.babcock.edu.ng' for more information");             
                }

            }


        }    
  }
}