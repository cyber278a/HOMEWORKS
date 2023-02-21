package homework6;

public class r141a {
    /*public*/ void  maxValue(int arr[]) {

    int max = 0;

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }// no return
    }
}


    public static void main(String[] args) {


        int[] arr = {5, 12, -3, 7, 3, 22};
        r141 hello=new r141();
        System.out.println(hello.maxValue(arr)); //should print 22

    }
}
