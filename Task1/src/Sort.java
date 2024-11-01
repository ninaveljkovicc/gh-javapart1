import java.util.Scanner;

public class Sort {

    public static void main(String[] args){

        boolean sorted = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the array");
        int n = scanner.nextInt();


        int[] myArray = new int[n];

        System.out.println("Enter " + n + " numbers: ");
        for(int i = 0; i < n; i++){
            myArray[i] = scanner.nextInt();
        }

        scanner.close();

        for(int i = 0; i < myArray.length - 1; i++){

            if(myArray[i] > myArray[i + 1])
                sorted = false;

        }
        if(sorted){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }

    }
}
