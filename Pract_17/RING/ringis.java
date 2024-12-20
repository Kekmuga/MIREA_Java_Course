package Pract_17.RING;


public class ringis {
    private Student head;
    private int listCount;

    public ringis(){
        this.head = new Student();
        this.listCount = 0;
    }

    public void add(Student student){
        Student current = null;
        if (size() == 0) {
            current = head;
        } else {
            current = head.getNext();
        }

        while (current.getNext() != head.getNext()){
            current = current.getNext();
        }

        current.setNext(student);
        student.setNext(head.getNext());
        listCount++;
    }

    public void add(Student student, int index){
        Student current = head;

        for(int i = 1; i < index && current.getNext() != head.getNext(); i++){
            current = current.getNext();
        }

        student.setNext(current.getNext());
        current.setNext(student);
        listCount++;
    }

    public String get(int index){
        if(index <= 0)
            return null;

        Student current = head.getNext();
        for (int i = 1; i < index; i++) {
            if(current.getNext() == null)
                return null;
            current = current.getNext();
        }
        return current.toString();
    }

    public boolean remove(int index){
        if(index < 1 || index > size())
            return false;

        Student current = head;
        for(int i = 1; i < index; i++){
            if(current.getNext() == null)
                return false;
            current = current.getNext();
        }

        current.setNext(current.getNext().getNext());
        listCount--;
        return true;
    }

    public void clear(){
        for (int i = size(); i > 0; i--) {
            remove(i);
        }
        listCount = 0;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public int size(){
        return listCount;
    }

    public Student getHead() {
        return head;
    }

    @Override
    public String toString() {
        if(size() == 0){
            return "[]";
        }
        Student current = head.getNext();
        String output = "";

        while(current != null){
            output += "[" + current + "]\n";
            current = current.getNext();
        }
        return output;
    }
}

