
package demo;

import java.util.Comparator;


public class StudentByCourseYearComparator implements Comparator<Student> {
    
    @Override
    public int compare(Student s1, Student s2){
       return s1.getCourseyear().compareTo(s2.getCourseyear());
    }
    
}
