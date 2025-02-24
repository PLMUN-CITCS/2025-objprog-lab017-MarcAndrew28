import java.util.Scanner;
public class GradeCalculator{
    static int grade; // Global variable that will be shared between methods
    public static void main(String[] args){

       Getscore(); // will prompt the user to input their score
       Calculategrade(); // will prompt the user to know their grade

    }
    public static void Getscore(){ // this method will store the inputs
        Scanner cram = new Scanner(System.in);

        System.out.print("Enter score: ");
        grade = cram.nextInt();
        cram.close();
    }
    public static void Calculategrade(){ // this line will validate the input and will be prompt to the user

        if(grade >= 90){

            System.out.println("your grade is A");

        }

        else if(grade <= 89 && grade >= 80){

            System.out.println("your grade is B");

        }

        else if(grade <= 79 && grade >= 70){

            System.out.println("your grade is C");

        }
        else if(grade <= 69 && grade >= 60){

            System.out.println("your grade is D");

        }
        else{

            System.out.println("your grade is F");

        }
    
    }

}