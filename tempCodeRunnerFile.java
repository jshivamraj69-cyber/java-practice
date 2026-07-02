class MultiplicationTable {
    publlic static void main(Strings[] args){
    Scanner scanner = new Scanner(System.in);
System.out.println("Welcome to the Multiplication World\n");
System.out.println("Please enter a number: ");
int num = scanner.nextInt();
printMultiplicationTable(num);
    }
    public static void printlnMultiplicationTable(int num){
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
    }
}
