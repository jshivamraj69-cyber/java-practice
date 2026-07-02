 class swap {
    public static void main(String[] args) {
        scanner input = new scanner(system.in);
        System.out.println("Welcome to swapping station");
        System.out.print("Enter the value of A: ");
        int a = input.nextInt();
        System.out.print("Enter the value of B: ");
        int b = input.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("After swapping:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }

}
