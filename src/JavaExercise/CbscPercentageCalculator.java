package JavaExercise;

import java.util.Scanner;

public class CbscPercentageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of first subject: ");
        int sub1 = sc.nextInt();
        System.out.print("Enter marks of second subject: ");
        int sub2 = sc.nextInt();
        System.out.print("Enter marks of third subject: ");
        int sub3 = sc.nextInt();
        System.out.print("Enter marks of fourth subject: ");
        int sub4 = sc.nextInt();
        System.out.print("Enter marks of fifth subject: ");
        int sub5 = sc.nextInt();

        float percentage = (sub1 + sub2 + sub3 + sub4 + sub5)/500.0f*100;
        int  marks = (sub1 + sub2 +sub3 + sub4 + sub5);

        System.out.println("Marks out of 500: "+marks);

        System.out.println("Percentage: "+ percentage);


        if (sub1>=33 && sub2>=33 && sub3>=33 && sub4>=33 && sub5>=33){
            System.out.println("Congratulations you have passed the exam!");
        }else {
            System.out.println("Better luck next time");
        }
    }
}
