package Solid_Principle.Liskov_Substitution_Principle;

public class Before {

    interface Property {
        public void buyContract();

        public void rentContract();
    }

    class CountrysideContract implements Property {
        @Override
        public void buyContract() {
            System.out.println("Buy countryside contract");
        }

        @Override
        public void rentContract() {
            System.out.println("Rent countryside contract");
        }
    }

    class CityContract implements Property {
        @Override
        public void buyContract() {
            System.out.println("Buy city contract");
        }

        @Override
        public void rentContract() {
            System.out.println("Rent city contract");
        }
    }

    // This class is violating LSP because subclass is not substitutable for the
    // base class
    // Although it also works, it is not a good design
    class ForeignContract implements Property {
        @Override
        public void buyContract() {
            System.out.println("Foreigner does not have permission to buy property in this country");
        }

        @Override
        public void rentContract() {
            System.out.println("Rent foreign contract");
        }
    }
}
