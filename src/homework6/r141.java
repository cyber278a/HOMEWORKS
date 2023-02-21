package homework6;
//Create the maxValue method that will accept int array and return  the maximum value in the array.
//
//Method should be  visible every class in any package!
public class r141 {
    /*public*/ int maxValue(int arr[]) {

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {


        int[] arr = {5, 12, -3, 7, 3, 22};
        r141 hello=new r141();
        System.out.println(hello.maxValue(arr)); //should print 22

    }
}