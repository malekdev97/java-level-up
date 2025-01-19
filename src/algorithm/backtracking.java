import java.util.Arrays;
public class backtracking {
    public static void main(String[] args) {
        String[] vehicles = {"C","B2","B1"};
        arrangeVehicles(vehicles);
    }
    public static void arrangeVehicles(String[] vehicles) {
        String[][]s = new String[4][3];
        for(int i =0;i< vehicles.length;i++){
            for(int j =0;j<vehicles.length;j++){
                if (i==j){
                    continue;
                }
                swap(vehicles,i,j);
                if(vehicles[1]== "C" ) {
                    swap(vehicles,i,j);
                    continue;
                }
                else if(!isRowIn2DArray(vehicles,s)) {
                    for(int n =0;n<vehicles.length;n++){
                    s[i][n]=vehicles[n];
                    System.out.print(s[i][n]+" ");
                }
                System.out.println();
            }
            }
        }
        System.out.println("_________");
        for(int i =0;i<s.length;i++){
            for(int j =0;j<s[i].length;j++){
                System.out.print(s[i][j]+" ");
            }
            System.out.println();
    }
    }
    public static void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static boolean isRowIn2DArray(String[] arr, String[][] matrix) {
        for (String[] row : matrix) {
            if (Arrays.equals(arr, row)) {
                return true;
            }
        }
        return false;
    }
}