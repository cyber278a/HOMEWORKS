package homeworkClass19;

public class TeacherTester {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
       t1.age=33;
       t1.strict();

       MathTeacher mt=new MathTeacher();
       mt.strict();
       mt.count();

       ChemistryTeacher ct=new ChemistryTeacher();
       ct.loud();
       ct.chem();

       PianoTeacher pt=new PianoTeacher();
       pt.name="John";
       pt.help();
       pt.piano();

    }

}
