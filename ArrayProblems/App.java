import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size1,size2;

        System.out.println("Enter the size of the Array1!!");
        size1 = input.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter the array1 elements!!"); 

        for (int i = 0; i < size1; i++) {
            arr1[i]=input.nextInt();
        }

        System.out.println("Enter the size of the Array2");
        size2 = input.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter the array2 Elements!!");

        for (int i = 0; i < size2; i++) {
            arr2[i]=input.nextInt();
        }

        System.out.println("Array 1 Follows ->");
        for (int i:arr1) {
            System.out.println(i);
        }

        System.out.println("Array 2 Follows ->");
        for (int i:arr2) {
            System.out.println(i);
        }


        // System.out.println("The Minimum in the array is -> ");
        // Minimum(arr1);
    }

    // static void Minimum(int arr[]){
    //     int min=arr[0];
    //     for (int i : arr) {
    //         if(min>i)
    //             min=i;
    //     }
    //     System.out.println(min);
    // }

}