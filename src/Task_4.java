import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args){

        //задание 4: программа, вычисляющая а*в без знака умножения
        System.out.println("Enter 2 numbers, you want to multiply");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int summ4 = 0;
        for (int i=0; i<num2;i++){
            summ4 = summ4 + num1;
        }
        System.out.println("Multiplicity of this numbers is: " + summ4);

    }
}
