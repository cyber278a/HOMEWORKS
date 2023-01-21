package class11;

public class Example1 {public static void main(String[] args) {

    int num1=10;
    int num2=20; // THIS PART IS EXPLANATION OF TASK 6 IN THE PROJECT
    // 0 1 1 2 3 5 8 FIBONACCHI
    // 5 7 11 13 PRIME NUMBERS-NUMBERS ONLY CAN BE DEVIDED BY 1 OR BY THEMESELF

    int [][] matrix={{10,20,30},
            {45,55,66},
            {30,40,20,10,25}

    };

         // !!!FOREACH!!!!!!!!!!!!!!!!!!
    // foreach loop to print all the numbers from a 2D array
    for(int[] arr:matrix ){

        for(int number:arr){
            System.out.print(number+" ");
        }
        System.out.println();
    }















}
}
