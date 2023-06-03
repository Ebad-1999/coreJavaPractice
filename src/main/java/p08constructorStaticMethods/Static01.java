package p08constructorStaticMethods;

public class Static01 {


    public static int staticCounter = 0;
    public int nonStaticCounter = 0;


    public Static01(){
        staticCounter++;
        nonStaticCounter++;
    }
}
