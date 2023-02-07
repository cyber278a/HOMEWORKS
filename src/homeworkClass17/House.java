package homeworkClass17;
//Write a java class that will have a constructor:
// one with parameters and second without any parameters.
// Create a separate Test class where you will execute both of the constructors 1 by 1.
public class House {

    int yearBuild;
    String type;
    int floors;
    String color;

    House(int houseYearBuild,String houseType,int houseFloors,String houseColor){
        yearBuild=houseYearBuild;
        type=houseType;
        floors=houseFloors;
        color=houseColor;
    }

House(){}
    void printInfo(){
        System.out.println(yearBuild+" "+ type+" "+floors+" "+color);
    }
}

