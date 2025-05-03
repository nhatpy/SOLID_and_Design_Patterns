package _24_Design_Patterns._7_Structural_Patterns;

// Description:
// Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.

public class Adapter_Pattern {
    // Asume that we have a class called `OldSystem` that has a method called
    // `oldMethod()`
    // and we want to use it in a new system that has a different interface.
    // We can create an adapter class that implements the new interface and uses the
    // old system internally.
    // This way, we can use the old system without modifying its code.

    class OldSystem {
        public void oldMethod() {
            System.out.println("Old method called");
        }
    }

    interface NewSystemInterface {
        void newMethod();
    }

    class Adapter implements NewSystemInterface {
        private OldSystem oldSystem;

        public Adapter(OldSystem oldSystem) {
            this.oldSystem = oldSystem;
        }

        @Override
        public void newMethod() {
            oldSystem.oldMethod();
        }
    }

    public static void main(String[] args) {
        OldSystem oldSystem = new Adapter_Pattern().new OldSystem();
        NewSystemInterface adapter = new Adapter_Pattern().new Adapter(oldSystem);
        adapter.newMethod();
    }
}
