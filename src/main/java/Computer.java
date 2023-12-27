// abstract means something is incompleted
// every abstract class MUST participate in the Inheritance
// we can't create
    public abstract class Computer {
        // static --- access modifier (optional) non access modifier(optional) dataType name(must)
        public static String type;
        public String name;
        protected int memory;
        String color;

        public Computer(String name, int memory, String color){
            this.name=name;
            this.memory=memory;
            this.color=color;
        }

    //non access modifier(optional) returnType name() { (must)
        public static void playMusic(){
            System.out.println("I can play music on my "+type);
        }
        protected void printInfo(){
            System.out.println("I have "+name+" computer with "+memory+" memory");

           // abstract void executeCode();

           // public abstract void readEmails();
        }
        class Apple extends Computer{

            public Apple(String name, int memory, String color){
                super(name, memory, color);
            }
        // when we provide implementation to the abstract classes we MUST follow rules of Overriding
            // same method name and parameters MUST be same - method signature must be same return type must be same
            // Access modifier must be same or wider
            void executeCode(){
                System.out.println("Executing code on "+type+" "+name);
            }
        public void readEmails(){
            System.out.println(name+" can read my emails");
        }
        }

    }

