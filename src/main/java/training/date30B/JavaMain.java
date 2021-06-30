package training.date30B;

import java.util.Optional;

public class JavaMain {

    static int findStringLength(String input) {
        Optional<String> optionalS = Optional.ofNullable(input);
        if (optionalS.isPresent()) {
            System.out.println("Field is not null");
            String temp = optionalS.get();
            return temp.length();
        } else {
            System.out.println("Field is null");
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println(findStringLength(null));
        System.out.println(findStringLength("Hello"));

        Optional<String> stringOptional = Optional.empty();
        System.out.println(stringOptional.isPresent());
        System.out.println(stringOptional.isEmpty());

        String optionString = stringOptional.get();

        Optional<String> stringOptional1 = Optional.of("asasass");
        System.out.println(stringOptional1.isPresent());
        System.out.println(stringOptional1.isEmpty());

        Optional<String> stringOptional2 = Optional.ofNullable("sasdas");

        String output = stringOptional2.orElse("Default");
        String output1 = stringOptional2.orElseThrow();
//        String output2 = stringOptional2;

        System.out.println(stringOptional2.isPresent());
        System.out.println(stringOptional2.isEmpty());
    }
}
