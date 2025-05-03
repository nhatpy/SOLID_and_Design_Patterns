package _24_Design_Patterns._11_Behavioral_Patterns;

// Describe the Strategy Pattern
// Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.

public class Strategy_Pattern {
    // Don't apply pattern

    class Func {
        public void encoder(String str) {
            // Encoding logic here
            System.out.println("Encoding: " + str);
        }

        public void decoder(String str) {
            // Decoding logic here
            System.out.println("Decoding: " + str);
        }
    }

    // Apply pattern

    class Encoder {
        public void encode(String str) {
            // Encoding logic here
            System.out.println("Encoding: " + str);
        }
    }

    class Decoder {
        public void decode(String str) {
            // Decoding logic here
            System.out.println("Decoding: " + str);
        }
    }
}
