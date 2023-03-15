import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
        double[] massiv = {1.57, 7.654, 9.986};
        for (int i = 0; i < massiv.length; i++) {
            System.out.println(massiv[i]);
        }
        System.out.println();
        int[] mine = new int[6];
        for (int index = 0; index < mine.length; index++) {
            mine[index] = index+1;
            System.out.println(mine[index]);
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.println(numbers[i]);
                break;
            }
            System.out.print(numbers[i]+", ");
        }
        double[] massiv = {1.57, 7.654, 9.986};
        for (int i = 0; i < massiv.length; i++) {
            if (i == massiv.length - 1) {
                System.out.println(massiv[i]);
                break;
            }
            System.out.print(massiv[i]+", ");
        }
        int[] mine = new int[6];
        for (int index = 0; index < mine.length; index++) {
            mine[index] = index+1;
            if (index == mine.length - 1) {
                System.out.println(mine[index]);
                break;
            }
            System.out.print(mine[index]+", ");
        }
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = numbers.length -1 ; i >= 0; i--) {
            if (i == 0) {
                System.out.println(numbers[i]);
                break;
            }
            System.out.print(numbers[i]+", ");
        }
        double[] massiv = {1.57, 7.654, 9.986};
        for (int i = massiv.length - 1; i >=0; i--) {
            if (i == 0) {
                System.out.println(massiv[i]);
                break;
            }
            System.out.print(massiv[i]+", ");
        }
        int[] mine = new int[6];
        for (int index = mine.length - 1; index >=0; index--) {
            mine[index] = index+1;
            if (index == 0) {
                System.out.println(mine[index]);
                break;
            }
            System.out.print(mine[index]+", ");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int[] numbers = new int[6];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            if (numbers[i] % 2 != 0) {
                numbers[i]=numbers[i]+1;
            }
        }
        System.out.print(Arrays.toString(numbers));
    }
}