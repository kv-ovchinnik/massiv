import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Введите колличество строк: ");
        int rows = kb.nextInt();

        System.out.print("Введитите колличество элементов строки: ");
        int cols = kb.nextInt();
        int[][] arr = new int[rows][cols];
        int summ = 0;
        int max = arr[0][0];
        int min = arr[0][0];

        Random rand = new Random(0);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = rand.nextInt(100);


            }
        }
        System.out.println();
        System.out.println("колличество строк: " + arr.length);
        System.out.println("колличество элементов строки: " + arr[0].length);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");
                System.out.println();

                summ += arr[i][j];
            }
        }
        System.out.println("Сумма всех элементов двумерного массива = " + summ);
        System.out.println("Среднее значение = " + summ / (cols * rows));

        System.out.println();


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }


            System.out.println("MIN = " + min);
                    System.out.println("MAX = " + max);
                }
            }
        }


