package data_structure.array;

public class TwoDArray {
    public static void main(String[] args) {
int [][] TwoD = new int[][]{
        {1,2,3,4},
        {2,4,6},
        {1}
};
       // System.out.println(TwoD[0].length);
        //System.out.println(TwoD.length);
for (int i = 0 ; i<TwoD.length;i++){

    for (int j = 0;j<TwoD[i].length;j++){
        System.out.print(TwoD[i][j]);

    }
    System.out.print("\n");
}


   }
}
