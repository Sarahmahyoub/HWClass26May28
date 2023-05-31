package HWClass26;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;


public class Employee {

//2)Create a Map that will store Employee name and salary.
// Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
//John Smith=$100000
    public static void main(String[] args) {

        LinkedHashMap< String,Integer> empSalary= new LinkedHashMap<>();

        empSalary.put ("John",90000);
        empSalary.put("Mary",100000);
        empSalary.put("Matt", 65000);
        empSalary.put("Sam", 120000);


        Integer highestSalary=Collections.max(empSalary.values());

        for (var e:empSalary.entrySet()){
            if(e.getValue().equals(highestSalary)){

                System.out.println(e.getKey()+" = "+e.getValue());
            }
        }
        }

        }




