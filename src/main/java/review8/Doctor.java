package review8;

    public class Doctor {
        public static String hospital;
        public String firstName, lastName;
        protected String speciality;
        int yearsOfExperience;
        private double salary;

            public Doctor(String firstName, String lastName, String speciality, int yearsOfExperience){
                this.firstName = firstName;
                this.lastName = lastName;
                this.speciality = speciality;
                this.yearsOfExperience = yearsOfExperience;
            }
            public static void work() {
                System.out.println("Doctors work at  " + hospital);
            }
            public void checkVitals() {
                System.out.println(firstName + " " + lastName + " check vitals on every patient");

            }
            // What is overloading - in the same class we have method with same name
            // How to overload: changing number of the parameters or dataType or sequance
            // In overloading the method signature MUST be different
            // we do not care about return type or access modifiers - meaning by changing those we are not overloading

            public void checkVitals (String patient){
                System.out.println(firstName + " " + lastName + " check vitals on " + patient);
                patient.trim();
            }
            public void prescribeMedication (String medication){
                    System.out.println(firstName + " " + lastName + " prescribed " + medication);
                }
            }
            class Surgeon extends Doctor {

                String location;

                Surgeon(String firstName, String lastName, String speciality, int yearsOfExperience, String location) {
                    super(firstName, lastName, speciality, yearsOfExperience); // call to the constructor happens first
                    this.location = location;

                }
                // Method overriding - In subclass (child class) and parent class we have method with the same name
                // How to override: we need inheritance
                // MUST keep same, parameters and same retutn type
                // Access Modifier MUST be the same or have wider access
                // In overriding Method Signature MUST be the same
                @Override
                public void prescribeMedication(String patient) {
                    System.out.println("Surgeon " + lastName + " prescribed madication to " + patient);
                }
            }