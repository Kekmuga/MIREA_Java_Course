package Pract_17;

public class Student{
    String name;
    int age;
    Student next;

    public Student(String name, int age){
        this.next = null;
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, Student nextValue){
        this.name = name;
        this.age = age;
        this.next = nextValue;
    }

    public Student() {
    }

    public Student getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "node data = {" + "name: " + name + ";age: " + age + "}";
    }

    public void setNext(Student next) {
        this.next = next;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
