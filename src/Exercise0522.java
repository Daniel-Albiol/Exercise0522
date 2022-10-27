import java.util.Scanner;

public class Exercise0522 {
    public static void main(String[] argv) {
        int[] array = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        for (int i = array.length - 1; i >= 1; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
