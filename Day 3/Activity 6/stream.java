
class streamPopcornClass {
    public void taste() {
        System.out.println("salty");
    }

    public void color() {
        System.out.println("Orange");
    }
}

class AnonymousDemo {
    public void createClass() {
        
        streamPopcornClass sp2 = new streamPopcornClass() {
            public void taste() {
                System.out.println("sweet");
            }

        };
        sp2.taste();

        streamPopcornClass sp3 = new streamPopcornClass() {
            public void taste() {
                System.out.println("spicy");
            }
        };

        sp3.taste();
    }
}

class Main {
    public static void main(String[] args) {
        AnonymousDemo an = new AnonymousDemo();
        an.createClass();
    }
}
