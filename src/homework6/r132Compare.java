package homework6;
//Complete the reduce10 method by making it subtract 10 from every element of the double array nums.
//The method should static and it should return a new 2D array object
public class r132Compare {





    static void reduce10(int[][] a) {for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print((a[i][j] - 10) + " ");


            }


            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7},};

        reduce10(a);
    }


}


