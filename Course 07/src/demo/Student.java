package demo;

public class Student implements Comparable<Student>{
    //class attributes
    private int id;
    private String lastName;
    private String firstName;
    private int age;
    //constructor
    public Student(int id, String firstName, String lastName, int age) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }
    //getter setter
    public String getLastName() {
        return lastName;
    }
    public int getId() {
        return id;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o)
    {
        return Integer.signum(age - o.getAge());
    }

    @Override
    public String toString()
    {
        return getFirstName() + " " + getLastName();
    }
}

