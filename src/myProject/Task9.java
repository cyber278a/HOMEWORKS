package myProject;
//Maximum and minimum number in the array?
public class Task9 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 4, 5, 6, 7, 80};
        int max=arr[0];

        int min=arr[0];

        for (int i = 0; i < arr.length; i++){
        if (arr[i]>max){max=arr[i];}
        if (arr[i]<min){min=arr[i];}

    }
        System.out.println("Maximum number is "+max+" and minimum number is "+min );
}}
