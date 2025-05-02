package Solid_Principle.Dependency_Inversion_Principle;

public class After {
    interface DataPersistence {
        void saveData(String typeDatabase);
    }

    class MongoDB implements DataPersistence {
        @Override
        public void saveData(String MongoDB) {
            System.out.println("Saving data to MongoDB: " + MongoDB);
        }
    }

    class MySQL implements DataPersistence {
        @Override
        public void saveData(String MySQL) {
            System.out.println("Saving data to MySQL: " + MySQL);
        }
    }
}
