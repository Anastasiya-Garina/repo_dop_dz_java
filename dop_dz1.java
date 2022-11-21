import java.util.Scanner;

public class dop_dz1 {
    public static void main(String[] args) {
        Scanner vvod = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = vvod.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = vvod.nextInt();
        System.out.print("Введите третье число: ");
        int number3 = vvod.nextInt();
        System.out.print("Введите четвёртое число: ");
        int number4 = vvod.nextInt();

        if (number1 >= number2 && number1 >= number3 && number1 >= number4)
            System.out.println(number1);
        else if (number2 >= number1 && number2 >= number3 && number2 >= number4)
            System.out.println(number2);
        else if (number3 >= number1 && number3 >= number2 && number3 >= number4)
            System.out.println(number3);
        else if (number4 >= number1 && number4 >= number3 && number4 >= number2)
            System.out.println(number4);
        else
            System.out.println("error");
    }
}