package homework5;

public class DayOff {
    public static void main(String[] args) {


        /*boolean workDay = true;
        int day = 1;
        while (workDay) {
            System.out.println("I need a day off");
            if (day >= 5) {
                workDay = false;
            }
            day++;
        }
        System.out.println("I do not need a day off anymore");*/
//*******************  same result   ********************
        boolean workDay1=true;
        int day1=1;
        while (workDay1){
            if(day1<=5){
                System.out.println("I need a day off");
            }else {
                System.out.println("I do not need a day off anymore");
                workDay1=false;
            }
            day1++;  // it is equal to day=day+1 day+=1
        }





    }


    }
