package myProject;
//)Create a 2D array of integers.
// Develop a program which will calculate the sum of  even and odd numbers for that array.
public class Task5 {
    public static void main(String[] args) {

        int[][] arr={   { 11,54,8},
                {44,32,33},
                {33,43,38},};
        int sumEven=0;
        int sumOdd=0;
        for (int i = 0; i <arr.length; i++)
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j]%2==0)
           sumEven=sumEven+arr[i][j];
                if (arr[i][j]%2!=0)
                   sumOdd=sumOdd+arr[i][j];}{
                System.out.println("Sum of even numbers is "+sumEven+" and sum of odd numbers is "+sumOdd );}




    }}
