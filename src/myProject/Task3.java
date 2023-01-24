package myProject;
//3) Create a 2D array of integer values. Print the sum of all numbers.
public class Task3 {
    public static void main(String[] args) {
        int[][] arr={   { 11,54,8,9,14},
                         {44,32,33}};
        int sum1=0;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum1=sum1+arr[i][j];}}


        System.out.println("Sum of all numbers is "+sum1);
    }
}
