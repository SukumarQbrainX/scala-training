package training.date28;

public class JavDefaultInheritance {

    public static void main(String[] args) {

        ObjectInheritanceInterface objectInheritanceInterface = new ObjectInheritanceInterfaceImpl();

        System.out.println(objectInheritanceInterface instanceof ObjectInheritanceInterface);
        System.out.println(objectInheritanceInterface instanceof ObjectInheritanceInterfaceImpl);
        System.out.println(objectInheritanceInterface instanceof Object);

        System.out.println(objectInheritanceInterface.toString());
        System.out.println(objectInheritanceInterface.equals(null));
        System.out.println(objectInheritanceInterface.hashCode());
//        System.out.println(objectInheritanceInterface.wait());
//        System.out.println(objectInheritanceInterface.notify());
//        System.out.println(objectInheritanceInterface.notifyAll());
    }
}
