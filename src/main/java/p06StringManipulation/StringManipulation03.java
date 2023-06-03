package p06StringManipulation;

public class StringManipulation03 {
    public static void main(String[] args) {
        //EX: Type a code to see the order of the first occurrence of the character 'a'
        // "I want to learn Java"


        String str = "I like to learn Java";
         int num = str.indexOf('a');
        System.out.println(num+1);

        //EX: Type code to see the order of the first occurrence of "Java"
        // "I like to study Java, earn money, Java is easy."
        String str1 = "I like to study Java, earn money, Java is easy.";
        int index =  str1.indexOf("Java");
        System.out.println(index+1);


        //Ex: Type code to check if a String has 'a' in it or not. Print appropriate messages for the scenarios.
        String str2 = "I like to study more";

        int exist = str2.indexOf('a');
        System.out.println(exist);

        if (str2.indexOf('a')==-1){
            System.out.println("'a' is not exist inside of given string");
        }else {
            System.out.println("'a' is  exist inside of given string ");
        }


        //EX: Type code to find the order of number of last occurrence of "Java" in a sentence
        String str3 = "I like to study Java, learn Java, earn money, Java is easy.";
        int lastIndex = str3.lastIndexOf("Java");
        System.out.println(lastIndex);










    }
}
