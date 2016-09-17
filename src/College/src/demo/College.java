
package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class College {
    
    public static void main(String[] args) {
    Student s1 = new Student("Santiago", "Mato", 1L, 2014);
    Student s2 = new Student("Lucas", "Osacar", 2L, 2015);
    Student s3 = new Student("Jorge", "Peralta", 3L, 2016);
    Student s4 = new Student("Maximo", "Cozzetti", 4L, 2013);
    Student s5 = new Student("Bruno", "Salamanca", 5L, 2016);
    
    List <Student> students = new ArrayList<>();
    students.add(s1);
    students.add(s2);
    students.add(s3);
    students.add(s4);
    students.add(s5);
    
    students.stream().forEach(student -> System.out.println(student));
		System.out.println("----------");
                
    Collections.sort(students);
    students.stream().forEach(student -> System.out.println(student));
    System.out.println("----------");
    
    Collections.sort(students, new StudentByPassbookComparator());
    students.stream().forEach(student -> System.out.println(student));
    System.out.println("----------");
    
    Collections.sort(students, new StudentByNameComparator());
    students.stream().forEach(student -> System.out.println(student));
    System.out.println("----------");
    
    Collections.sort(students, new StudentByCourseYearComparator());
    students.stream().forEach(student -> System.out.println(student));
    
    
    
    
    
    }
    
}
