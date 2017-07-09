package studentpackage;


import java.util.ArrayList;
import java.util.List;

public class StudentUtils {


    public static List<Student> CreateList(){
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("ant","kaynak",21,"antkaynak1@gmail.com"));
        studentList.add(new Student("jonathan","papabless",69,"vapenasionyall@zortmail.com"));

        return studentList;
    }

    public static String DisplayInfo(List<Student> studentList){
        String info = "";
        for(Student i : studentList){
            info+= i.toString() + "  ";
        }

        return info;
    }

}
