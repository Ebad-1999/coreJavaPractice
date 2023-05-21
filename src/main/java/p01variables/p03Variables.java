package p01variables;

public class p03Variables {

    int a = 12;
    public static void main(String[] args) {

        p03Variables obj = new p03Variables();
        System.out.println(obj.convert(20)+obj.a);
    }
    public static double convert(double mile){
        return mile*1.6;
    }

}
