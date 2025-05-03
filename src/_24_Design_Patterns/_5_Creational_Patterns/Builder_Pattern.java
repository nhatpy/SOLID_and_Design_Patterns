package _24_Design_Patterns._5_Creational_Patterns;

//Description:
// Builder is a creational design pattern that lets you construct complex objects step by step. 
// The pattern allows you to produce different types and representations of an object using the same construction code.

public class Builder_Pattern {

    class Person {
        private String name;
        private int age;
        private String address;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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

        public Person(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
        }

    }

    class PersonBuilder {
        private String name;
        private int age;
        private String address;

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            return new Person(name, age, address);
        }
    }

    public static void main(String[] args) {
        PersonBuilder personBuilder = new Builder_Pattern().new PersonBuilder();
        Person person = personBuilder
                .setName("John")
                .setAge(30)
                .setAddress("123 Main St")
                .build();
        System.out.println(person);
    }
}
