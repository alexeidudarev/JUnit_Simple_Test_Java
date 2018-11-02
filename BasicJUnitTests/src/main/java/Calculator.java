public class Calculator {

    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){

        return a-b;
    }
    public double devide(double a, double b){
        if(a == 0 || b == 0 ){
           return 0;
        }
        return a/b;
    }
    public int multy(int a, int b){
        if (b == 0){
           return 1;
        }
        return a*b;
    }

}
