public class Student {
    private Person person;
    private EnumDepartment department;

    Student(Person person, EnumDepartment department) {
        this.person = person;
        this.department = department;
    }

    @Override()

    public String toString() {
        return "Imię: " + person.getName() + " Nazwisko: " + person.getSurname() + " Wydział: " + department;

    }
}
