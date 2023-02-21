package homework6;

public class r169 {
    final static double avgElements(int[]a){

        double sum=0;
        for (int i = 0; i < a.length; i++) {sum=sum+a[i];
//
        }
        double average=sum/a.length;return average;}

    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(avgElements(a)); //should print 4.8
    }
}
