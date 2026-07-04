 class ArraySumAverage{

 
 public static void main(String[] args) {
        System.out.println("Welcome to the Array Sum and Average program!");
        int[] numArray = ArrayUtility.inputArray();
        if (numArray == null || numArray.length == 0) {
            System.out.println("No numbers provided.");
            System.out.println("The sum of the array is: 0");
            System.out.println("The average of the array is: 0.0");
            return;
        }
        long sum = sum(numArray);
        double avg = average(numArray);
        System.out.println("The sum of the array is: " + sum);
        System.out.println("The average of the array is: " + avg);

}
public static long sum(int[] numArray){
    long sum = 0;
    for (int i = 0; i < numArray.length; i++) {
        sum += numArray[i];
    }
    return sum;
    

}
public static double average(int[] numArray){
    long sum = sum(numArray);
    return (double) sum / numArray.length;
}
}

