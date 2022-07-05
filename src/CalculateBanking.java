import java.util.Scanner;

public class CalculateBanking {
    public static void main(String[] args) {
        double money,interestRate,totalInterest;
//        int month;
        Scanner input   =new Scanner(System.in);
        System.out.println("Enter money");
        money=input.nextDouble();
        System.out.println("Enter interestRate");
        interestRate=input.nextDouble();
//        System.out.println("Enter month");
//        month=input.nextInt();
        for (int i=0;i<=12;i++){
            totalInterest=money*(interestRate/100)/12*i;
            System.out.println("Total of interest with " +i +" is "  + totalInterest);
        }
    }
}
