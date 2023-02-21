package homework;
//Complete the mystery method so that it takes in an integer array as a parameter, and then modifies each element based on whether it's even or odd.
//
// If the number is even, divide it by 2.  If it's odd, multiply it by 10.
//
//**Expected Output:**
//
//```
//10 1 30 2 50
//```
public class r1 {
    public static void main(String[] args) {
        int [] numbers={10,15,20,55,30,45,50};

        // Write code to add all the numbers from an array

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2==0){

                System.out.print(numbers[i]/2);}
                if(numbers[i]%2!=0){
                    System.out.print(numbers[i]*10);}
                System.out.print(" ");
        }




    }}

