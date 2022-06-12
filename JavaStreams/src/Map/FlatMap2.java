package Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

class Student{
    String sName;
    int sId;
    char grade;
    public Student(String sName, int sId, char grade){
        this.sName=sName;
        this.sId=sId;
        this.grade=grade;
    }
}

public class FlatMap2 {

    public static void main(String[] args) {
        List<Student> list= asList(
                new Student("John", 1, 'B'),
                new Student("JohnWick", 2, 'A'),
                new Student("Marry", 3, 'C'),
                new Student("Jenice", 4, 'B')
        );
        List<Student> list1= asList(
                new Student("David", 5, 'B'),
                new Student("KeanuReeves", 6, 'A'),
                new Student("Tom", 7, 'C'),
                new Student("Harry", 8, 'B')
        );

        List<List<Student>> studentList= Arrays.asList(list,list1);

        //fetch names from studentList Collections

        //before Java 8
        for(List<Student> es: studentList){
            for(Student seu: es)
                System.out.println(seu.sName);
        }

        //using Streams and FlatMap and forEach
        studentList.stream().flatMap(x-> x.stream().map(e-> e.sName)).forEach(System.out::println);

        //using Streams and FlatMap and collect
        List<String> name=studentList.stream().flatMap(x-> x.stream().map(e-> e.sName)).collect(Collectors.toList());
        System.out.println(name);
    }
}
