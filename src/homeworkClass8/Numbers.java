package homeworkClass8;

public class Numbers {
    public static void main(String[] args) {
        for (int i = 1; i <=55 ; i++) {
          if(i%3==0)
           continue;// skipping previous condition
              System.out.println(i);
        }
    }
}
