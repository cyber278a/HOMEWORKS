package homework6;



class Method {




   static int sum2D(int[][]a){
       int sum1=0;
       for (int i = 0; i <a.length; i++) {
           for (int j = 0; j < a[i].length; j++) {
               sum1=sum1+a[i][j];}}return sum1;

   }




}
class hello extends Method{
    public static void main(String[] args) {


    int[][] a = {

            { 1, 2, 3 },

            { 4, 5, 6 },

            { 7, 8, 9 }

    };

        System.out.println(sum2D(a));
}}