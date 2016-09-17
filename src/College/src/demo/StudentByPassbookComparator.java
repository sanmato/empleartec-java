
package demo;

import java.util.Comparator;

public class StudentByPassbookComparator implements Comparator<Student> {
    
    @Override
    public int compare(Student s1, Student s2){
       return s1.getPassbookID().compareTo(s2.getPassbookID());
        
    }
    
}
