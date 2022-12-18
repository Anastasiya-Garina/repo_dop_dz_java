import java.util.Scanner;
public class dop_dz_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a = new int[4];
        for (int i = 0; i < 4; i++){
            System.out.print("Введите число: ");
            a[i] = sc.nextInt();
        }
        int max_number = -1000000;
        int counter = 1;
        for (int k = 0; k<4; k++){
            if (a[k]>=max_number){
                if (a[k] == max_number){
                    counter++;
                }else {
                    counter = 1;
                }
                max_number = a[k];

            }
        }
        System.out.print("Количество максимальных чисел: "+counter);
        sc.close();
    }
}