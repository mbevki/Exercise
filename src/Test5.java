
//  5 - Merge two arrays, taking values alternatively from each one:
//        For example:
//
//        list 1 is ["a", "b", "c"]
//        list 2 us ["x", "y", "z"]
//
//        resulting list: ["a","x,"b","y","c","z"]

/**
 *
 * Finished
 *
 */

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
//        String[] list1 = new String[] {"a", "b", "c"};
//        String[] list2 = new String[] {"x", "y", "z"};

        String[] list1 = new String[] {"a", "b", "c", "W", "O", "R", "K"};
        String[] list2 = new String[] {"x", "y", "z"};

        String[] listCombined = new String[list1.length + list2.length];

//       VERSION 1 - only work with Array length [3]
//        for(int i = 0, j = 0; i < list1.length; i++, j+=2){
//            listCombined[j] = list1[i];
//            listCombined[j+1] = list2[i];
//        }

//      VERSION 2 - works with any Array (I hope)
        //take the length of two Arrays
        int lenght = list1.length > list2.length ? list1.length : list2.length;
        for(int i = 0, j = 0; i<lenght; i++, j+=2){
            // Checking if "i" is < then list1.length if so put char in the new Array
            // then check if "i" is >= list2.length that means
            // that we don't need anymore copy/paste value from list2
            if(i < list1.length){
                listCombined[j] = list1[i];
                if(i >= list2.length){
                    j--; // j-- is because if we came in this IF that means that we won't copy list2 char
                         // so we don't want j+=2; from for loop rather we want only j++;
                }
            }
            // Like above but in reverse order we look if "i">=list1.length if so we won't copy anymore list1
            if(i < list2.length){
                if(i >= list1.length){
                    listCombined[j] = list2[i];
                    j--; // the same thing like above
                }else{
                    listCombined[j+1] = list2[i];
                }
            }
        }
        System.out.println(Arrays.toString(listCombined));
    }
}
