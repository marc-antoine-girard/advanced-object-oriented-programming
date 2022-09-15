package demo;

import java.util.*;

public class HashMapDemo
{
    public static void demo()
    {
        //students' creation
        Student student1 = new Student(1, "Tayler", "Spooner", 24);
        Student student2 = new Student(2, "Hallam", "Read", 27);
        Student student3 = new Student(3, "Kameron", "Townsend", 18);
        Student student4 = new Student(4, "Tegan", "Flower", 25);
        Student student5 = new Student(5, "Charlie", "Small", 33);

        // HashMap of students
        HashMap<Integer, Student> studentsMap = new HashMap<>();

        // add the students
        studentsMap.put(student1.getId(), student1);
        studentsMap.put(student2.getId(), student2);
        studentsMap.put(student3.getId(), student3);
        studentsMap.put(student4.getId(), student4);
        studentsMap.put(student5.getId(), student5);

        // get the student4 with the key 4
        Student student4FromMap = studentsMap.get(student4.getId());
        student4FromMap = studentsMap.get(4);

        // Remove a student with the key 2
        studentsMap.remove(student2.getId());
        studentsMap.remove(2);

        // True if the key exists
        studentsMap.containsKey(10); // usually used in if statements

        // Know if the HashMap contains this object as a Value
        studentsMap.containsValue(student2); // returns true or false


        HashMap<String, ArrayList<Student>> classes = new HashMap<>();

        classes.put("oop", new ArrayList<>());

        if (!classes.containsKey("oop"))
        {
            classes.put("oop", new ArrayList<>());
        }

        classes.get("oop").add(new Student(6, "asd", "asd", 20));


        // Loop over keys and values (standard, recommended)
        for (Map.Entry<Integer, Student> studentEntry : studentsMap.entrySet())
        {
            int key = studentEntry.getKey();
            Student value = studentEntry.getValue();
        }

        // Loop over keys
        for (Integer key : studentsMap.keySet())
        {
            System.out.println(key);
        }

        // Loop over values
        for (Student value : studentsMap.values())
        {
            System.out.println(value.getId());
        }

        // Loop over keys and values using iterator
        // only loop where you can remove elements while cycling
        Iterator<Map.Entry<Integer, Student>> it = studentsMap.entrySet().iterator();
        while (it.hasNext())
        {
            Map.Entry<Integer, Student> pair = it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }

        studentsMap.forEach((id, student) -> System.out.println("id: " + id + " name: " + student.getFirstName()));
        studentsMap.forEach(HashMapDemo::methodWithTwoParameters);
    }

    public static void methodWithTwoParameters(Integer id, Student student){
        System.out.println("id: " + id + " name: " + student.getFirstName());
    }
}
