package core;

public class NewCustomer {
    private final String name, lastName;
    private int age;
    private String address;


// create constructor for this class on your local branch.Thanks
//I forgot to add that you need to create setter and getter as well and toString


    public NewCustomer(String name, String lastName, int age, String address) {
        this.name = name;
        this.lastName = lastName;
        if (age < 0 || age > 150) {
            if (age < 0)
                throw new IllegalArgumentException("Age of the person should not be negative:" + age);
        } else {
            throw new IllegalArgumentException("Age of the person should not be more than 150" + age);
        }
        setAge(age);
        setAddress(address);
    }

    public String getName() {
        return name;
    }


    public String getLastName() {
        return lastName;
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
