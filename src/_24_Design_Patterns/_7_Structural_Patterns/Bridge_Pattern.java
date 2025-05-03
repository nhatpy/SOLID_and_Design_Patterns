package _24_Design_Patterns._7_Structural_Patterns;

// Description:
// Bridge is a structural design pattern that lets you split 
// a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.

// It's converted of Adapter Pattern
public class Bridge_Pattern {
    class Youtube {
        private Bridge bridge;

        public Youtube(Bridge bridge) {
            this.bridge = bridge;
        }

        public void paymentYoutube() {
            bridge.paymentYoutube();
        }

        public Bridge getBridge() {
            return bridge;
        }

        public void setBridge(Bridge bridge) {
            this.bridge = bridge;
        }
    }

    interface Bridge {
        void paymentYoutube();
    }

    class Visa implements Bridge {
        @Override
        public void paymentYoutube() {
            System.out.println("Payment method: Visa");
        }
    }

    class Cash implements Bridge {
        @Override
        public void paymentYoutube() {
            System.out.println("Payment method: Cash");
        }
    }

    public static void main(String[] args) {
        Bridge_Pattern bridgePattern = new Bridge_Pattern();
        Bridge visaMethod = bridgePattern.new Visa();
        Bridge cashMethod = bridgePattern.new Cash();

        Youtube youtube = bridgePattern.new Youtube(visaMethod);
        Youtube youtube2 = bridgePattern.new Youtube(cashMethod);

        youtube.paymentYoutube(); // Output: Payment method: Visa
        youtube2.paymentYoutube(); // Output: Payment method: Cash
    }
}
