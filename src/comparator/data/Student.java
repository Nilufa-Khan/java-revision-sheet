package comparator.data;

public class Student implements Comparable<Student> {
    private int rollNum;
    private String name,email;
    @Override
    public int compareTo(Student obj) {
        return this.name.compareTo(obj.name);
        //return Integer.compare(this.rollNum, obj.rollNum);
    }

    public Student(int rollNum, String name, String email) {
        this.rollNum = rollNum;
        this.name = name;
        this.email = email;
    }
    public Student(){}

    public int getRollNum() {
        return rollNum;
    }

    public void setName(int rollNum) {
        this.rollNum = rollNum;

    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNum=" + rollNum +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
