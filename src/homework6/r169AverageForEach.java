package homework6;
//Create final method avgElements that will average all the elements in an
// integer array (passed to the method as a parameter) and return the average.
public class r169AverageForEach {

final static double avgElements(int[]a){

double sum=0;
for(double i:a){sum+=i;}// i here is a number from array
// for (int i = 0; i < a.length; i++) {sum=sum+a[i];// i here is just index
double average=sum/a.length;return average;}

    public static void main(String[] args) {
        int[] a = {2,7,3,8,4};
        System.out.println(avgElements(a)); //should print 4.8
    }
}














