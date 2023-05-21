package p01variables;

public class p04Variables {

    public static void main(String[] args) {

        p04Variables obj = new p04Variables();
        System.out.println(obj.myMethod('A','b'));
    }

    public int myMethod(char c1, char c2){
        return (c1+c2);
    }


}
