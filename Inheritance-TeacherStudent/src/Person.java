public class Person {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "The " + getClass().getName()
                +  "'s firstname is: " + this.firstName + ", lastname is: " + lastName;
    }
}