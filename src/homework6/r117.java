package homework6;

public class r117 {
    /*Create a method with the following specs:


Returns:

```
an integer
```

Name:

```
sumEvenToX
```

Parameters:

```
an integer called "x"
```

Purpose:

```
calculate the sum of the EVEN integers from 1 to x (including x)
```

Examples:

```
sumEvenToX(5) ==> 6
sumEvenToX(8) ==> 20 */
     int sumEvenToX(int x) {
        int sum = 0;
        for (int i = 2; i <= x; i+=2) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        r117 sumEven = new r117();
        System.out.println(sumEven.sumEvenToX(5));

    }}
