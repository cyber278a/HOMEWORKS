package homeworkClass19;

public class Teacher {

        String name;
        int age;
        char gender;
        void bilingual(){
            System.out.println("Speak different languages");}
        void strict(){
            System.out.println("Straight to the subject");}
        void loud(){
            System.out.println("Speaking very loud ");}
        void help(){
            System.out.println("Can help to understand the subject ");
        }}



        class MathTeacher extends homeworkClass19.Teacher {
            String experience;
            void count(){
                System.out.println("Can count to 10");

            }
        }
        class ChemistryTeacher extends homeworkClass19.Teacher {
            String hobby;
            void chem (){
                System.out.println("Works with chemicals time to time ");
            }
        }
        class PianoTeacher extends homeworkClass19.Teacher {
            String voice;
            void piano(){
                System.out.println("Can play piano");
            }
        }


