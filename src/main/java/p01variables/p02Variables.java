package p01variables;

public class p02Variables {
    public static void main(String[] args) {

        System.out.println(calculatePercentage(200, 30));

        printAge(22);
    }

    public static double calculatePercentage (double n, double y){
        return (n*y)/100;

    }



    public static void printAge(int age){
        System.out.println(age);
    }


}
