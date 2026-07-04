 import java.util.Scanner;

class Search2DArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to 2D search\n");
        int[][] numArr = ArrayUtility.input2DArray(input);
        System.out.println("Enter the number to search for:");
        int num = input.nextInt();
        boolean isFound = search(numArr, num);
        if (isFound){
            System.out.println(num + " was found in the array");
        } else {
            System.out.println(num + " was not found in the array");
        }
    }

    public static boolean search(int[][] numArr, int target){
        int i = 0;
        while (i < numArr.length){
            int j = 0;
            while (j < numArr[i].length){
                if (numArr[i][j] == target){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
