package app;

class Person {
    private String lastName, firstName;
    private int age;

    public Person(String lName, String fName, int a) {
        lastName = lName;
        firstName = fName;
        age = a;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void displayPerson() {
        System.out.print(" Last Name : " + lastName);
        System.out.print(", First Name : " + firstName);
        System.out.println(", Age : " + age);
    }
}