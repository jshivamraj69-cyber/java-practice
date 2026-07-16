import java.util.Scanner;
class OccurrencesForEach {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to finding occurrencs");
        int[] nums = ArrayUtility.inputArray();
        System.out.print("now, enter the number you want to find the occurrences of: ");
        int element = scanner.nextInt();   
        int occ = countOccurrence(nums,element);
        System.out.println("Tour element was found:" + occ + "times.");
}
public static int countOccurrence(int[] nums,int element){
    int occ =0;
    for (int num : nums) {
        if (num == element){
            occ++;
        }
    }
    return occ;
}
}
