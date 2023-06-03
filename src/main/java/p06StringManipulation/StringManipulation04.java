package p06StringManipulation;

public class StringManipulation04 {
    public static void main(String[] args) {
        String str = "Java is easy";
        boolean isExist =  str.contains("Java");
        System.out.println(isExist);

       boolean startWith =  str.startsWith("Java");
        System.out.println(startWith);

        boolean startWith2 = str.startsWith("i", 5);
        System.out.println(startWith2);


        //EX: Check if the given password
        String pwd = "xy1AmSW?";
        // has "A" in any position
        boolean fl = pwd.contains("A");
        // has "xy" at the beginning
        boolean se = pwd.startsWith("xy");
        // has "W" as 7th character
        boolean th = pwd.startsWith("W",6);
        // has 8 characters in total
        boolean fo = pwd.length()==8;

        System.out.println("Is the password valid? "+ (fl && se && th && fo));


        String t = str.concat("!");
        System.out.println(t);













    }
}
