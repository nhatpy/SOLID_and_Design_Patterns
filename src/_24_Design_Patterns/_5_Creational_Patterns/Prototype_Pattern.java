package _24_Design_Patterns._5_Creational_Patterns;

// Description:
// Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.

public class Prototype_Pattern {
    // clone all of the fields of the object, including the private ones
    interface Prototype {
        Prototype clone();
    }

    static class ConcretePrototype implements Prototype {
        private String field1;
        private int field2;

        public ConcretePrototype(String field1, int field2) {
            this.field1 = field1;
            this.field2 = field2;
        }

        @Override
        public Prototype clone() {
            return new ConcretePrototype(field1, field2);
        }

        @Override
        public String toString() {
            return "ConcretePrototype{" +
                    "field1='" + field1 + '\'' +
                    ", field2=" + field2 +
                    '}';
        }
    }

    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("field1", 42);
        ConcretePrototype clone = (ConcretePrototype) prototype.clone();

        System.out.println("Original: " + prototype);
        System.out.println("Clone: " + clone);

        // Modify the clone
        clone.field1 = "modified field1";
        clone.field2 = 100;

        System.out.println("After modification:");
        System.out.println("Original: " + prototype);
        System.out.println("Clone: " + clone);
    }
}