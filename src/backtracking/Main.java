package backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] vehicles = {"C", "B2", "B1"};
        arrangeVehicles(vehicles);
    }

    public static void arrangeVehicles(String[] vehicles) {
        ArrayList<String[]> solution = new ArrayList<>();

        for (int i = 0; i < vehicles.length; i++) {
            for (int j = 0; j < vehicles.length; j++) {
                if (i == j) {
                    continue;
                }

                swap(vehicles, i, j);

                if (vehicles[1]== "C") {
                    swap(vehicles, i, j); // Backtrack from the swap
                    continue;
                } else if (!isRowInList(vehicles, solution)) {
                    solution.add(Arrays.copyOf(vehicles, vehicles.length));
                }
            }
        }

        System.out.println("All the possible ways of arranging 2 bikes and 1 car:");
        for (String[] arrangement : solution) {
            for (String vehicle : arrangement) {
                System.out.print(vehicle + " ");
            }
            System.out.println();
        }
    }

    public static void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static boolean isRowInList(String[] arr, ArrayList<String[]> list) {
        for (String[] row : list) {
            if (Arrays.equals(arr, row)) {
                return true;
            }
        }
        return false;
    }
}