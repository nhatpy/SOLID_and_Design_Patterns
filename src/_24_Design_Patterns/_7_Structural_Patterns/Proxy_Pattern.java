package _24_Design_Patterns._7_Structural_Patterns;

// Describe the Proxy Pattern
// Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object.
// A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.

public class Proxy_Pattern {
    class Boss {
        public void acceptRequest() {
            System.out.println("Boss accepted the request.");
        }
    }

    class Secretary {
        private Boss boss;

        public Secretary(Boss boss) {
            this.boss = boss;
        }

        public void receiveRequest() {
            System.out.println("Secretary accepted the request.");
            boss.acceptRequest();
        }
    }

    class Developer {
        public void sendRequest(Secretary secretary) {
            System.out.println("Developer sent a request.");
            secretary.receiveRequest();
        }
    }
}
