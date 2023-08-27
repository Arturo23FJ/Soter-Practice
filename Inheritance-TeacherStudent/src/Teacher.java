public class Teacher extends Person{

    private String specialization;

    public Teacher(String firstName, String lastName, String specialization){
        super(firstName, lastName);
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return super.toString() + ", and the specialization is: " + this.specialization;
    }
}
