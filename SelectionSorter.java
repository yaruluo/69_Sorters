/**
  Implement an insertion sort, in the Sorters structure
  oriignal code: Junhee Lee
 */
import java.util.ArrayList;

public class SelectionSorter extends Sorter {

    /**
      Construct an instance to process the user's data
     */
    public SelectionSorter(  ArrayList< String> usersData) {
      super(usersData);
      //mySort();  
      // your code here, if necessary
    }
    

    /**
      sort the user's data, implementing selection sort
      */
    
    /*
      precondition(s): an array of the same type.
      synopsis: Run select for positions 0 through n–2 in the list.
      postcondition(s): same array, sorted.
    */
    public void mySort() {
        for(int numSorted = 0;
            numSorted < elements.size() - 1;
            select(numSorted++)){
              System.out.println(debug(numSorted));
            }
    }

    /*
      precondition(s): startAt is a valid int less than the size of the array.
      synopsis: Find the smallest value in the unsorted region.
                Swap it with the first value in the unsorted region.
      postcondition(s): expands the sorted region by one.
    */
    public void select(int startAt) {
        int dweebIndex;
        for(int indexToCompare = (dweebIndex = startAt) + 1;
            indexToCompare < elements.size();
            indexToCompare++){
                if(elements.get(dweebIndex).compareTo(elements.get(indexToCompare)) > 0) {
                    dweebIndex = indexToCompare;
                }
            }
        elements.set(startAt, elements.set(dweebIndex, elements.get(startAt)));
    }

}
