import java.util.Scanner;
public class dop_dz_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[5];
        for (int i = 0; i < 5; i++){
            System.out.print("Введите число: ");
            a[i] = sc.nextInt();
        }
        int min = 1000000000;
        for (int i = 0; i < a.length; i++){
            if (a[i] < min) {
                min = a[i];
            }
        }
        int max = -1000000000;
        for (int i = 0; i < a.length; i++){
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
        sc.close();
    }
}
