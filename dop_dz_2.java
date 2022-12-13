import java.util.Scanner;

public class dop_dz_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] a = new int[4];
        for (int i = 0; i < 4; i++){
            System.out.print("Введите число: ");
            a[i] = sc.nextInt();
        }
        sc.close();
    }
}
