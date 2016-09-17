
package demo;

public class Student implements Comparable<Student> {
   private String name, lastname;
   private Long passbookID;
   private Integer courseyear;

    public Student(String name, String lastname, Long passbookID, Integer courseyear) {
        this.name = name;
        this.lastname = lastname;
        this.passbookID = passbookID;
        this.courseyear = courseyear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Long getPassbookID() {
        return passbookID;
    }

    public void setPassbookID(Long passbookID) {
        this.passbookID = passbookID;
    }

    public Integer getCourseyear() {
        return courseyear;
    }

    public void setCourseyear(Integer courseyear) {
        this.courseyear = courseyear;
    }
    
    public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [Name: ").append(name)
                       .append(", Last Name: ").append(lastname)
                       .append(", Passbook ID: ").append(passbookID.toString())
                       .append(", Course Year: ").append(courseyear.toString()).append("]");
		return builder.toString();
		
	}
    
    
    @Override
    public int compareTo(Student o) {
    return this.lastname.compareTo(o.lastname);
    }
    
}
