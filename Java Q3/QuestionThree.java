import java.util.Scanner;
import java.util.StringTokenizer;

class ClassA{
    public static void main(String[] args){

        int number = 1;

        Scanner inputKeyBoard = new Scanner(System.in);
        
        System.out.print("Input the investment amount: ");
        double investAmount = inputKeyBoard.nextDouble();

        System.out.print("Input the rate of interest: ");
        double rate = inputKeyBoard.nextDouble();

        System.out.print("Input number of years: ");
        int years = inputKeyBoard.nextInt();

        rate *= 0.01;

        ClassB calc = new ClassB();

        System.out.println("Years:        Future Value:");

        for(int i = 1; i <= years; i++){
            System.out.printf(i + "             " + "%" + ".2f\n", calc.futureInvestmentValue((investAmount), rate/12, i));
        }

    }

}

class ClassB{

    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }

}