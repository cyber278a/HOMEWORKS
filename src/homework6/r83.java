package homework6;
//Write a program that calculates the sum of elements from each row in a 2D array
// and adds them into array of integers
public class r83 {
    public static void main(String[] args) {
        int[][] a = {
                {1,1,2}, //sum = 4
                {3,1,2}, //sum = 6
                {3,5,3}, //sum = 11
                {0,1,2}  //sum = 3
        };

        for (int i = 0; i <a.length ; i++) {
            int sum1=0;
            for (int j = 0; j <a[i].length ; j++) {
                
                sum1=sum1+a[i][j];
                }
            System.out.println(sum1);
            }











    }
}
