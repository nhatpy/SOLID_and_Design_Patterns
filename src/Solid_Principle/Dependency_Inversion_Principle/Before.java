package Solid_Principle.Dependency_Inversion_Principle;

public class Before {
    interface DataPersistence {
        // void saveData(String MongoDB);
        void saveData(String MySQL);
    }

    class MongoDB implements DataPersistence {
        @Override
        public void saveData(String MongoDB) {
            System.out.println("Saving data to MongoDB: " + MongoDB);
        }
    }

    // If we want to add a new database, we need to modify the code in this class.
    class MySQL implements DataPersistence {
        @Override
        public void saveData(String MySQL) {
            System.out.println("Saving data to MySQL: " + MySQL);
        }
    }
}
