package list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //student list
        List<Student> studs = new ArrayList<>();
        studs.add(new Student("ujef",8));
        studs.add(new Student("King",7));
        studs.add(new Student("Shlok",9));
        studs.add(new Student("Awej",8));

        //print the student list
        for(Student s: studs) {
            System.out.println(s);
        }
        //sort the student ascending logic
        studs.sort((s1,s2)-> Double.compare(s1.getGpa(), s2.getGpa()));
        System.out.println("\n--- Sorted by GPA (Descending) ---");
        for(Student s: studs) {
            System.out.println(s);
        }

        //chanining comparators
        Comparator<Student> customLogic = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
        studs.sort(customLogic);

        System.out.println("\n --- Sorted by GPA (Descending) and Name---");
        for(Student s: studs){
            System.out.println(s);
        }

    }

}
