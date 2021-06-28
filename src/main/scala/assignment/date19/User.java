package AssignmentDate19;

public class User {
    private final String name;
    private final long mobileNumber;

    public  User(String name,Long mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }

    public String getName(){
        return this.name;
    }
    public long getMobile(){
        return this.mobileNumber;
    }

}
