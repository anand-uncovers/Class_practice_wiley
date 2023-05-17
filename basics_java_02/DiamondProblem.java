package basics_java_02;
interface Person{
    public void getRole();
}
interface Student extends Person{}
class Teacher implements Person{
    @Override
    public void getRole(){
        System.out.println("Teaching");
    }
}
class ClassRoom extends Teacher implements Student{
    @Override
    public void getRole(){
        System.out.println("ClasRoom Teaching");
    }
}
public class DiamondProblem {


    public static void main(String[] args) {
       Teacher t= new Teacher();
       t.getRole();
       ClassRoom s = new ClassRoom();
       s.getRole();
    }

}
