package myProject;
//Write a java program to find the second largest number in the array?
public class Task10 {
    public static void main(String[] args) {int [] arr={10, 20, 30, 4, 67, 6, 7, 80};
        int max=arr[0];
        int secondLargest=arr[0];

        for (int i=0;i< arr.length;i++){
            if (arr[i]>max){
                secondLargest=max;
                max=arr[i];
            }else if (arr[i]>secondLargest){
                secondLargest=arr[i];}

        }System.out.println("second largest number is "+secondLargest);
    }}
