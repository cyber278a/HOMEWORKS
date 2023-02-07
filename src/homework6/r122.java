package homework6;

import class16.Students;

//Declare 3 instance variables to hold:
//
//- name of the country
//- capital
//- population size
//
//Create a method to display values of instance variables
//
//Create 2 Object, assign values to instance variables, execute method display;
//
//**Expected Output:**
//
//```
//The capital of USA is Washington DC and population is 330000000
//The capital of Kazakhstan is Astana and population is 18500000
//```
public class r122 {
String countryName;
String countryCapital;
int countryPopulation;

    void display(){
        System.out.println("The capital of "+ countryName+" is "+countryCapital+" and population is "+countryPopulation);
    }



    public static void main(String[] args) {

        r122 c1=new r122();
        c1.countryName="USA";
        c1.countryCapital="Washington DC";
        c1.countryPopulation=330000000;
        c1.display();


        r122 c2=new r122();
        c2.countryName="Kazakhstan";
        c2.countryCapital="Astana";
        c2.countryPopulation=18500000;
        c2.display();


}}
