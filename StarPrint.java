public class StarPrint {
    public static void main(String[] args) {
        int n = 5;
        if (args.length >= 1) {
            try {
                n = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
            }
        }

        System.out.println("Right triangle:");
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }

        System.out.println("\nInverted triangle:");
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i; j++) System.out.print("*");
            System.out.println();
        }

        System.out.println("\nPyramid:");
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++) System.out.print(" ");
            for (int k = 0; k < 2 * i - 1; k++) System.out.print("*");
            System.out.println();
        }

        System.out.println("\nDiamond:");
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < n - i; s++) System.out.print(" ");
            for (int k = 0; k < 2 * i - 1; k++) System.out.print("*");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 0; s < n - i; s++) System.out.print(" ");
            for (int k = 0; k < 2 * i - 1; k++) System.out.print("*");
            System.out.println();
        }
    }
}
