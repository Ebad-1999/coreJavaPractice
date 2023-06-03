package p06StringManipulation;

public class StringManipulation02 {
    public static void main(String[] args) {
        //EX: Type a code to get the initial of the first and the last name of a given name. Ali Can ==> AC, Mary Star ==> MS etc.
        String name = "Tom Hanks";

        String fi = name.substring(0, 1);
        String se = name.split(" ")[1].substring(0, 1);
        System.out.println(fi + " " + se);

        //EX: Type code to find the number of words in a String; "I like to move it, move it" ==> 7
        String word = "I like to move it, move it";
        int numOfWords = word.split(" ").length;
        System.out.println(numOfWords);


        //EX: Type code to check if a character is unique in a string or not
        //     "Hello" ==> H is unique, e is unique, o is unique.

        String st = "Hello";
        if (st.indexOf('l')==-1){
            System.out.println("Character does not exist");
    }else if (st.indexOf('l')==st.lastIndexOf('l')){
            System.out.println("H is a unique character ");
        }else {
            System.out.println("H is not a unique character");
        }




    }
}
