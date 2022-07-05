import java.util.Scanner;

public class picturePrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice between 0 to 3 ");
        System.out.println("Choice 1:Rectangle ");
        System.out.println("Choice 2:Square triangle ");
        System.out.println("Choice 3:Isosceles triangle");

        int choice = 7;
        String a ="";
        while (choice != 1) {
            choice = input.nextInt();
            if (choice == 1) {
                for (int i = 1; i < 4; i++) {
                    for (int j = 0; j < 10; j++) {
                        a+= "*";
                    }
                    System.out.println(a);
                    a="";
                }
            }
            else if (choice==2){
                for (int i=1;i<=5;i++){
                    for (int j=1;j<=5;j++){
                        a+="*";
                    }
                }
                System.out.println(a);
                a="";
            }
        }
    }
}
