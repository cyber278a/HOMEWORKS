package homework6;
/*Write a method header with the following specs:


Returns:

```
a String
```

Name:

```
censorLetter
```

Parameters:

```
a String
```

```
a char
```

Then complete the method by programming the following behavior

```
Replace all instances of given character with a "*" within the given String.
See below examples.
```

Examples:

```
censorLetter("computer science",'e') ==> "comput*r sci*nc*"
censorLetter("trick or treat",'t') ==> "*rick or *rea*"*/

public class r119LookAgain {
    String censorLetter(String s, char c) {

        String a = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                a += "*";
            } else {
                a += s.charAt(i);
            }
        }
        return a;
    }
    public static void main(String[] args) {

        r119LookAgain check= new r119LookAgain ();
        System.out.println(check.censorLetter("computer science",'e'));
        System.out.println(check.censorLetter("trick or treat",'t'));

    }}
