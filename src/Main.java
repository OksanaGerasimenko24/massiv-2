public class Main {
    public static void main(String[] args) {
        //задача 1
        int totalSalary = 0;
        int[] salaryArray = {140, 344, 6767, 6767, 56};
        for (int salary : salaryArray) {
            totalSalary += salary;
        }
        System.out.println("Сумма  трат за месяц составила" + totalSalary);
    }

    //задача 2
         public static void task2 () {
        int[] arr = {140, 344, 6767, 6767, 56};
        int min = arr[0];
        int max = arr[0];

        for (int element : arr) {
            if (element < min) {
                min = element;
            } else if (element > max) {
                max = element;
            }
            System.out.println("минимальные траты за день" + min);
            System.out.println("максимальные затраты за день" + max);
        }


        // задача 3
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    //задача 4
    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int length = reverseFullName.length;
        for (int i = 0; i < length / 2; i++) {
            char cash = reverseFullName[i];
            reverseFullName[i] = reverseFullName[length - 1 - i];
            reverseFullName[length - 1 - i] = cash;
        }
        System.out.println(reverseFullName);
    }
}

