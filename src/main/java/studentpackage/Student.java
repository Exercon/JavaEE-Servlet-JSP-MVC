package studentpackage;


public class Student {

    private String name;
    private String surname;
    private double ID;
    private String email;

    public Student(String name, String surname, double ID, String email) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getID() {
        return ID;
    }

    public void setID(double ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", ID=" + ID +
                ", email='" + email + '\'' +
                "} <br/>";
    }
}
