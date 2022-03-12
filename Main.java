import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     double numberOne, numberTwo, result;
     int choose;

     do{
        choose = GetValueForMenu();
        switch (choose){
            case 1:
                numberOne = GetDecimalNumber();
                numberTwo = GetDecimalNumber();
                result = Addiction(numberOne,numberTwo);
                showResult(result);
                break;
            case 2:
                numberOne = GetDecimalNumber();
                numberTwo = GetDecimalNumber();
                result = Subtraction(numberOne,numberTwo);
                showResult(result);
                break;
            case 3:
                numberOne = GetDecimalNumber();
                numberTwo = GetDecimalNumber();
                result = Impact(numberOne,numberTwo);
                showResult(result);
                break;
            case 4:
                numberOne = GetDecimalNumber();
                numberTwo = GetDecimalNumber();
                result = Divide(numberOne,numberTwo);
                showResult(result);
                break;
            default:
                System.out.println("Thanks for use calcuator");
                break;

        }
     }while(choose !=5);
        System.out.println("You exited");
    }


    public static void showMenu(){
        System.out.println("1-Addiction\n"+"2-Subtraction\n"+"3-Impact\n"+"4-Divide\n");
    }
    public static int GetValueForMenu(){
        Scanner input = new Scanner(System.in);
        int number;
        showMenu();
        number = input.nextInt();


        while (number<1 || number>5){
            showMenu();
            System.out.println("\n Please enter a valid choose.");
        }


        return number;
    }
    public static double GetDecimalNumber(){
        Scanner input = new Scanner(System.in);
        double number;
        System.out.println("Please enter a decimal number:");
        number = input.nextInt();
        return number;
    }
    public static double Addiction(double numOne, double numTwo){
        return  numOne+numTwo;
    }
    public static double Subtraction(double numOne,double numTwo){
        return numOne-numTwo;
    }
    public static double Impact(double numOne, double numTwo){
        return numOne*numTwo;
    }
    public static double Divide(double numOne, double numTwo){
        return numOne/numTwo;
    }
    public static void showResult(double num){
        System.out.println("Your's result =" + num);
    }
}
