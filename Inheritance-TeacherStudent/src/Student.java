public class Student extends Person{

    private int note;

    public Student(String firstName, String lastName, int note){
        super(firstName, lastName);
        this.note = note;
    }

    @Override
    public String toString() {
        return super.toString() + ", and the note is: " + this.note;
    }
}
