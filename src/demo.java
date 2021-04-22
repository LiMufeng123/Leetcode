import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int arr[] = {950, 885, 702, 101, 312, 652, 555, 936, 842, 33, 634, 851, 174, 210, 287, 672, 994, 614, 732, 919, 504, 778, 340, 694, 880, 110, 777, 836, 365, 375, 536, 547, 887, 272, 995, 121, 225, 112, 740, 567, 898, 390, 579, 505, 351, 937, 825, 323, 874, 138, 512, 671, 297, 179, 277, 304};
        Arrays.sort(arr);
        boolean bool = true;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]==arr[i+1])
                bool = false;
        }
        System.out.println(bool);
        System.out.println(arr.length);

    }

}
