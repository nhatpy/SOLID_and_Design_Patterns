package _24_Design_Patterns._5_Creational_Patterns;

// Description: 
// Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.

public class Singleton_Pattern {
    static class Singleton {
        private static Singleton instance = null;

        private Singleton() {
            // private constructor to prevent instantiation
        }

        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }
    }
}
