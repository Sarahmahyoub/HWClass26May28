package HWClass26;

import java.util.Map;
import java.util.TreeMap;

public class Person {

    //Create a HWClass26.Person class with following private fields: name, lastName, age, salary.
    //Variables should be initialized through constructor.
    //Inside the class also create a method to print user details. In Test Class create a Map that will store key in ascending order.
    // In that map store personId and a HWClass26.Person Object. Print each object details..

    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {

        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;

    }


    void printInfo() {
        System.out.println(name + " " + lastName + " " + age + " " + salary);

    }

    @Override
    public String toString() {
        return "HWClass26.Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

    class PersonTester{
        public static void main(String[] args) {

                Person person=new Person("Matt","Jackson",45,120000);
                Map<String,Person > personStringTreeMap= new TreeMap<>();

                personStringTreeMap.put("4556486", new Person("Matt","Jackson",45,120000));


                for (Map.Entry<String,Person> emp:personStringTreeMap.entrySet()) {

                 System.out.println(emp.getValue()+" "+emp.getKey());
                 person.printInfo();

            }

        }

    }

