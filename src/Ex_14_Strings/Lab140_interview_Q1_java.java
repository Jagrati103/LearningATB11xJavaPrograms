package Ex_14_Strings;

public class Lab140_interview_Q1_java {
    public static void main(String[] args) {
        String S1 = "Hello";
        String S3 = "Hello";
        String S10 = "Hello";

        String S2 = new String("HELLO");
        String S4 = new String("Hello");
        String S11 = new String("hello");

        // == -> Comparsion -> String -> this check the locations ref.
        System.out.println(S1 == S2);
        System.out.println(S3 == S4);
        System.out.println(S10 == S11);
        System.out.println(S1 == S3);
        System.out.println(S1.equalsIgnoreCase(S2));

        //  equalsIgnoreCase -> pramod. Pramod, PRAMOD , PraMod . PramoD -> pramod
        //  == - check for the ref
        // = assignment the value

        // equals ( content) -> value
        System.out.println(S1.equals(S11));
        System.out.println(S1.equals(S4));

    }
}
