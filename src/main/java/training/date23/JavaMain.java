package training.date23;

public class JavaMain {

    public static void main(String[] args) {

        ScalaExample scalaExample = new ScalaExample(33);
        ScalaExample scalaExample1 = new ScalaExample(3);

        ScalaExample scalaExample2 = scalaExample.$plus(scalaExample1);
    }
}
