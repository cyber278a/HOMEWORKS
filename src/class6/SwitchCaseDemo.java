package class6;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        String country="china";

        switch (country.toLowerCase()){// change all to lower case "usa"
            case "usa":
              System.out.println("Burgers");
              break;
            case "italy":
                System.out.println("Pasta");
                break;
            case "afghanistan":
                System.out.println("Kebab");
                break;
            default:
                System.out.println("Wrong country");
        }


    }
}
