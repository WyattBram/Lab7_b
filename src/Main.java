import java.util.Scanner;

public class Main {

    public static int recursive_multiply(int  i, int j){
        if(j == 1){
            return i;
        }
        if(j == 0){
            return 0;
        }
        else{
            return i + recursive_multiply(i,j-1);
        }
    }

    public static int recursive_div(int  i, int j){
        if(j == 0){
            return -1;
        }
        if(j == i){
            return 1;
        }
        if(j > i){
            return 0;
        }

        else{
            return 1 + recursive_div(i - j, j);
        }
    }

    public static int recursive_mod(int  i, int j){
        int count;
        if(j == 0){
            return -1;
        }
        if(j > i){
            return i;
        }

        else{
            return recursive_mod(i - j, j);
        }
    }





    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        int choice;

        do{

            System.out.println(
                    "0. Quit\n" +
                            "1. Multiply 2 numbers\n"+
                            "2. Div 2 numbers\n"+
                            "3. Mod 2 numbers");
            choice = x.nextInt();
            x.nextLine();


            if (choice == 1){
                System.out.println("Enter the first number: ");
                int a = x.nextInt();
                x.nextLine();
                System.out.println("Enter the second number: ");
                int b = x.nextInt();
                x.nextLine();
                System.out.println("Anwser is: " + recursive_multiply(a,b));
            }

            else if (choice == 2){
                System.out.println("Enter the first number: ");
                int a = x.nextInt();
                x.nextLine();
                System.out.println("Enter the second number: ");
                int b = x.nextInt();
                x.nextLine();
                System.out.println("Anwser is: " + recursive_div(a,b));
            }

            else if (choice == 3){
                System.out.println("Enter the first number: ");
                int a = x.nextInt();
                x.nextLine();
                System.out.println("Enter the second number: ");
                int b = x.nextInt();
                x.nextLine();
                System.out.println("Anwser is: " + recursive_mod(a,b));
            }




        }while (choice != 0);

    }
}