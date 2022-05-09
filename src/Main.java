import Search.Search;

import static Search.Search.*;

class Main {


  public static void main(String args[]) {

    int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    int target = 10;
    int result;

    //result = binarySearch(array, target);
    //System.out.println(result);

    result = InterSearch(array, target);
    System.out.println(result);

    //result = normalSearch(array, target);
    //System.out.println(result);

  }
}