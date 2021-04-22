import java.util.Arrays;

public class CheckInclusion {
    public static void main(String[] args) {
        String s1 = "ab" ;
        String s2 = "eidbaooo";
        boolean res = checkInclusion(s1,s2);
        System.out.println(res);
    }

    public static boolean checkInclusion(String s1, String s2) {
        /**
         * s1是子串,s2是总串
         *
         */
        int len1 = s1.length();
        int len2 = s2.length();
        String s0 = "";
        char[] chars = s1.toCharArray();
        Arrays.sort(chars);
        s1 = new String(chars);
        //System.out.println(s1);

        if(len1-len2>0)   return false;
        for(int i=0; i<=len2-len1; i++){
             s0 = s2.substring(i,i+len1);
            char[] chars1 = s0.toCharArray();
            Arrays.sort(chars1);
            s0 = new String(chars1);
            //System.out.println(s0);
            if(s0.equals(s1))
                return true;
            }
             return false;

        }


    }

