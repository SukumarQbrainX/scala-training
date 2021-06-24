package training.date24;

//import training.date24.defaultTest.DefaultAccessModifier;

import training.date24.defaultTest.ProtectedAccessModifier;

import static java.lang.System.out;
import static java.lang.Math.*;

public class JavaMain extends ProtectedAccessModifier {

    public static void main(String[] args) {

        PrivateAccessModifier privateAccessModifier = new PrivateAccessModifier("Akash");
        PrivateAccessModifier privateAccessModifier1 = new PrivateAccessModifier("Akashq");

        System.out.println(privateAccessModifier.compareName(privateAccessModifier));
        System.out.println(privateAccessModifier.compareName(privateAccessModifier1));
//        privateAccessModifier.name

        System.out.println(PrivateAccessModifier.compareName(privateAccessModifier, privateAccessModifier));

        new java.util.Date();
//        System.out.println(new DefaultAccessModifier());

        out.println("sdasdasd");

        out.println(Math.max(1, 2));

        out.println(max(1, 3));
        out.println(abs(-10));
        out.println(min(1, 2));

        new JavaMain().add(2,3);
    }
}
