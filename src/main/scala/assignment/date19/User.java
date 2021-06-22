package assignment.date19;

class User {
        private final String Name;
        private final long MobileNumber;

        public  User(String Name, long MobileNumber){
        this.Name = Name;
        this.MobileNumber = MobileNumber;
    }

    public String getName () {
        return this.Name;
    }
    public long getNumber () {
        return this.MobileNumber;
    }


}
