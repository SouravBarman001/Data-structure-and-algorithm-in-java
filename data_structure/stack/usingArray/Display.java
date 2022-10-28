package data_structure.stack.usingArray;

public class Display {
    Main obj = new Main();
    void displayAll(){
        System.out.println("Items are:");

   for (int j= obj.top;j>=0;j--){
       System.out.println(obj.array[j]);
   }

    }
}
