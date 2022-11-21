import java.util.Scanner;

public class dop_dz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int[] myArraw = new int[5];

        int[] myArraw;
        myArraw = new int[5];

        for (int i = 0; i <= 4; i++) {
            myArraw[i] = sc.nextInt();
        }

//        System.out.println("Минимальное число: " + Math.min(Arrays.toString(myArraw)));
        System.out.println("Минимальное число: " + Math.min(myArraw));
    }
}