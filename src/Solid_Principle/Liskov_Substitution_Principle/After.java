package Solid_Principle.Liskov_Substitution_Principle;

public class After {

    interface Property {
    }

    interface DomesticProperty extends Property {

        public void buyContract();

        public void rentContract();
    }

    interface ForeignProperty extends Property {

        public void rentContract();
    }

    class CountrysideContract implements DomesticProperty {
        @Override
        public void buyContract() {
            System.out.println("Buy countryside contract");
        }

        @Override
        public void rentContract() {
            System.out.println("Rent countryside contract");
        }
    }

    class CityContract implements DomesticProperty {
        @Override
        public void buyContract() {
            System.out.println("Buy city contract");
        }

        @Override
        public void rentContract() {
            System.out.println("Rent city contract");
        }
    }

    class ForeignContract implements ForeignProperty {

        @Override
        public void rentContract() {
            System.out.println("Rent foreign contract");
        }
    }
}
