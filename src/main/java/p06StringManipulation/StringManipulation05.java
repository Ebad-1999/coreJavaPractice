package p06StringManipulation;

public class StringManipulation05 {
    public static void main(String[] args) {
        String str = "Java is OOP";

        String result = str.replace('O', '*');
        System.out.println(result);

        String result2 = str.replace("Java", "*");
        System.out.println(result2);


        String st = "Ali is in 13 years old, I think he seems 335.";

        //EX: Change all the digits to * in the given String
        String result3 = st.replace('0','*').
                replace('1','*').
                replace('2','*').
                replace('3','*').
                replace('4','*').
                replace('5','*').
                replace('6','*').
                replace('7','*').
                replace('8','*').
                replace('9','*');
        System.out.println(result3);



        String pwd = "!a23b4?es";
        boolean length = pwd.replaceAll("\\s", "").length()>7;
        //System.out.println(length);
        //boolean newLength = pwd.replaceAll("[a-zA-Z0-9]","").replaceAll("\\s", "").length()>0;
        //System.out.println(newLength);

        boolean newLength = pwd.replaceAll("[a-zA-Z0-9 ]","").length()>0;//simple way
        System.out.println(newLength);













    }
}
