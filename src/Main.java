import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Adım: Array uzunluğunu istifadəçidən almaq
        System.out.print("Array uzunluğunu daxil edin: ");
        int uzunluq = scanner.nextInt();

        // 2. Adım: Array yaratmaq və elementləri daxil etmək
        int[] array = new int[uzunluq];
        System.out.println(uzunluq + " ədəd elementi daxil edin:");
        for (int i = 0; i < uzunluq; i++) {
            System.out.print("Element " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // 3. Adım: Array-in cüt indeksli elementlərinə 1 əlavə etmək və tək indeksli elementlərindən 1 çıxmaq
        for (int i = 0; i < uzunluq; i++) {
            if (i % 2 == 0) {
                // Cüt indeks
                array[i] += 1;
            } else {
                // Tək indeks
                array[i] -= 1;
            }
        }

        // 4. Adım: Array-i çap etmək
        System.out.println("Dəyişdirilmiş array:");
        for (int i = 0; i < uzunluq; i++) {
            System.out.print(array[i] + " ");
        }

        // Scanner'ı bağlamaq
        scanner.close();
    }
}
