package data_structure.recursiveFunction;

public class TestOne {
    public static void main(String[] args) {
        int n  = returnName(3);
        System.out.println(n);
    }
    static int returnName(int p){
        if(p == 1){
            return 1;
        }else {
            System.out.println("hello");
            returnName(p-1);
        }


        return 1;
    }
}
