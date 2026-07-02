import java.util.Scanner; 
class perimeter{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to perimeter calculator");
        System.out.println("Please enter all 4 sides in cms ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double perimeter = a + b + c + d;
        System.out.println("The perimeter of the quadrilateral is: " + perimeter);
    }
}
