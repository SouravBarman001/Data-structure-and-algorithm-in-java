package data_structure.stack.usingArray;

public class Pop {
    Main obj = new Main();
    int value;

    void PopElement(){

        if (obj.top == -1){
            System.out.println("Under Flow");
        }else {

            obj.top = -1;
            System.out.println("Item deleted");
        }



    }


}
