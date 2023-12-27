package class17;
//  Write program: User that has a constructor that initializes instance variable name and mobile number.
//  Create a subclass/child class  userInfo that will have user address variable
//  and it also being initialized through constructor call.
//  Print users name, mobile number and address in userDetails method. Test your code.

    class PersonDetails {
        private String name;
        private String mobNo;

        public PersonDetails(String name, String mobNo) {
            this.name = name;
            this.mobNo = mobNo;
        }

        public void displayPersonalDetails() {
            System.out.println(name + " " + mobNo);
        }
    }

    class PersonInfo extends PersonDetails {
        private String address;

        public PersonInfo(String name, String mobNo, String address) {
            super(name, mobNo);
            this.address = address;
        }

        public void displayPersonDetails() {
            super.displayPersonalDetails();
            System.out.println(address);
        }
    }

