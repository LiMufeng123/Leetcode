import java.util.HashSet;

public class 无重复最长子串 {
    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if(len==0)  return 0;
        HashSet<Character>hashSet = new HashSet<>();
        int max = -1;
        int left = 0;
        int right = 0;
        while(right<len){
            while(!hashSet.isEmpty()&&hashSet.contains(s.charAt(right))){
                hashSet.remove(s.charAt(left));

                left++;
            }
            hashSet.add(s.charAt(right));//把右指针元素加入哈希set
            max = Math.max(max,right-left+1);
            right++;
        }
            return max;
    }

    public static void main(String[] args) {
        int num = lengthOfLongestSubstring("  ");
        System.out.println(num);
    }
}
