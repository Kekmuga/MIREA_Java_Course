package Pract_17.STD2;


public class Student {
    String name;
    int age;
    Student next;
    Student prev;

    public Student(String name, int age){
        this.next = null;
        this.prev = null;
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, Student nextValue, Student prevValue){
        this.name = name;
        this.age = age;
        this.next = nextValue;
        this.prev = prevValue;
    }

    public Student() {
        this.next = null;
        this.prev = null;
    }

    public Student getNext() {
        return next;
    }

    public Student getPrev(){
        return prev;
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

    public void setPrev(Student prev) {
        this.prev = prev;
    }
}

