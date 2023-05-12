package core;

public class NewCustomer {
    private String name, lastName;
    private int age;
    private String address;
// create constructor for this class on your local branch.Thanks
//I forgot to add that you need to create setter and getter as well and toString


    public NewCustomer(String name, String lastName, int age, String address) {
       setName(name);
       setLastName(lastName);
       setAge(age);
       setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
