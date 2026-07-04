import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n;
        try {
            String line = sc.nextLine().trim();
            n = Integer.parseInt(line);
        } catch (Exception e) {
            return new int[0];
        }
        if (n <= 0) {
            return new int[0];
        }
        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers (space or newline separated):");
        for (int i = 0; i < n; i++) {
            try {
                arr[i] = sc.nextInt();
            } catch (Exception e) {
                arr[i] = 0;
                if (sc.hasNext()) sc.next();
            }
        }
        return arr;
    }

    public static int[][] input2DArray(Scanner sc) {
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        
        int[][] arr = new int[rows][cols];
        System.out.println("Enter " + (rows * cols) + " integers:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
}
