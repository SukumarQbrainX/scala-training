package assignment.date19;

class User {
        private final String name;
        private final long mobileNumber;

        public  User(String name, long mobileNumber){
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public String getName () {
        return this.name;
    }
    public long getNumber () {
        return this.mobileNumber;
    }


}
