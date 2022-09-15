package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListDemo
{
    public static void demo()
    {
        //Initializing the ArrayList, else null pointer
        ArrayList<Student> students = new ArrayList<>(); // Type inference

        //students' creation
        Student student1 = new Student(1, "Tayler", "Spooner", 24);
        Student student2 = new Student(2, "Hallam", "Read", 27);
        Student student3 = new Student(3, "Kameron", "Townsend", 18);
        Student student4 = new Student(4, "Tegan", "Flower", 25);
        Student student5 = new Student(5, "Charlie", "Small", 33);

        // add students in the ArrayList
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        // number of students in the list
        // Do not call size() on a null ArrayList (uninitialized)
        System.out.println(students.size());

        // access student3 in list.
        // returns the third element since collections start at index 0
        students.get(2);

        // removes student4
        students.remove(3); // using the index
        students.remove(student4); // using object comparison

        //adjusts the list's size
        students.trimToSize();


        //option 1 : With indexed for loop
        for (int i = 0; i < students.size(); i++) {
            Student e = students.get(i);
        }

        // reversed loop, good for removing elements
        for (int i = students.size() - 1; i >= 0; i--) {
            Student e = students.get(i);
        }


        //option 2 : With enhanced for loop
        // cannot remove elements here
        for (Student etu : students) {
            Student e = etu;
        }

        //option 3 : Using a while loop
        int no = 0;
        while (no < students.size()) {
            Student e = students.get(no);
            no++;
        }

        //option 4 : With an iterator for loop
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        students.forEach((value) -> System.out.println(value)); // Lambda function. Return is implicit in an Expression body (arrow)
        students.forEach(value -> System.out.println(value)); // Parentheses are optional when only passing one value
        students.forEach(System.out::println); // same thing as line above. Called Method Reference, or Method Grouping

        // Needs the type in the list to implement Comparable<T>.
        // Go to Student class and remove the implementation, it should not compile anymore
        Collections.sort(students);

        Collections.sort(students, new ComparatorAge());
        students.sort(new ComparatorAge()); // same thing as line above
        Collections.sort(students, new ComparatorFirstName());

        //clears the list
        students.clear();
    }
}


/**
 * Comparator for Student class. Compares Students by first name
 */
class ComparatorFirstName implements Comparator<Student>
{
    @Override
    public int compare(Student e1, Student e2) {
        return e1.getFirstName().compareTo(e2.getFirstName());
    }
}

/**
 * Comparator for Student class. Compares Students by Age
 */
class ComparatorAge implements Comparator<Student>
{
    @Override
    public int compare(Student e1, Student e2)
    {
        return Integer.signum(e1.getAge() - e2.getAge());
    }
}
