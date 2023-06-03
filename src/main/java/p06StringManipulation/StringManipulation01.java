package p06StringManipulation;

public class StringManipulation01 {
    public static void main(String[] args) {
        //EX: Print the first and second character of the given String
        String str = "Java is easy";
        char fc = str.charAt(0);
        char se = str.charAt(str.length()-1);
        System.out.println(""+fc+se);

        String first = str.substring(0,1);
        String second = str.substring(str.length()-1);

        System.out.println(""+first+second);

        //EX: Print just the animal name of given String " I like lion, horse, laptop, and cat".
        String animal = "I like lion, horse, laptop, and cat";
        String lion = animal.substring(7,11);
        String horse = animal.substring(13,18);
        String cat = animal.substring(32);
        System.out.println(lion +" "+ horse +" "+ cat);




    }
}
