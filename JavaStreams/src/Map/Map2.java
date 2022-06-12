package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

class Employee{
    int  id;
    String ename;
    int salary;
    public Employee(int id, String ename, int salary){
        this.id=id;
        this.ename=ename;
        this.salary=salary;
    }
}

public class Map2 {
    public static void main(String[] args) {

        List<Employee> list= asList(
                new Employee(1, "John", 20000),
                new Employee(2,"Marry", 5000),
                new Employee(3, "JohnWick", 50000),
                new Employee(4, "Jenice", 45000)
        );
        List<Integer> empSalList= new ArrayList<>();

        //salary of employee gretaer than or equal to 20k
        // combination of filter and map
        empSalList= list.stream().filter(e -> e.salary>=20000).map(e-> e.salary).collect(Collectors.toList());
        System.out.println(empSalList);

        //usingForach
        list.stream().filter(e-> e.salary>=20000).forEach(e-> System.out.println(e.salary));


    }
}
