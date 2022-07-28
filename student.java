
public class student {
    private String ID;
    private String fullName;
    private int age;
    private float gpa;
    
    
    public student(String ID) {
        this.ID = ID;
    }

    public student(String ID, String fullName, int age, float gpa) {
        this.ID = ID;
        this.fullName = fullName;
        this.age = age;
        this.gpa = gpa;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    
    public String toString() {
        int i = 0;
        return "SinhVien " +  "  [ID = " + ID + ",\tfullName= " + fullName + ",\tage = " + age
                + ",\tgpa = " + gpa + "]";
    }

	// @Override
	// public boolean equals(Object obj) {
	// 	if (this == obj)
	// 		return true;
	// 	if (obj == null)
	// 		return false;
	// 	student other = (student) obj;
	// 	return Objects.equals(ID, other.ID);
	// }
	
}


