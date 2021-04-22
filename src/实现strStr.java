public class 实现strStr {
    public int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();
        if(len2==0) return 0;
        int index = 0;
        while(index<=len1-len2){
            boolean flag = compare(haystack,index,len2,needle);
            if(flag)    return index;
            index++;
        }
        return -1;

    }

    private boolean compare(String haystack, int index,int len2, String needle) {
        return haystack.substring(index,len2).equals(needle);
    }
}
