
public class Player {
    public String firstName;
    public String lastName;
    public int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Player(final String firstName, final String lastName, final int age){
        this.firstName = firstName;
        this.lastName= lastName;
        this.age = age;
    }

    public void displayPlayer(){
        System.out.println(this.firstName + " " + this.lastName + " " + this.age);
    }

}
