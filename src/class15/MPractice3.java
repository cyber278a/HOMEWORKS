package class15;

public class MPractice3 {
    /*
    create a method that takes an array
     of int. sum all the elements from the array
    and return the sum.
    return type =>int
    name of Method=>arraySum
    parameters=int [] arr
     */

    int arraySum(int[] arr){
        int sum=0;

       for (int num:arr) {

        sum+=num;}return sum;
    }

}
//int sum=0;
//        int arr[]=new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=scan.nextInt();
//         sum=sum+arr[i];}