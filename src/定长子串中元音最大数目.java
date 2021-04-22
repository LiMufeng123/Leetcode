import java.util.HashMap;
import java.util.HashSet;

public class 定长子串中元音最大数目 {
    public int maxVowels(String s, int k) {
        /**
         * 给你字符串 s 和整数 k 。
         *
         * 请返回字符串 s 中长度为 k 的单个子字符串中可能包含的最大元音字母数。
         *
         * 英文中的 元音字母 为（a, e, i, o, u）。
         *
         *
         *
         */
        int len = s.length();
        int left = 0;
        int right = 0;
        int count = 0;//统计长度为k的小数组有多少被填充了
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        while(right<len){
            while(right-left<=k-1){
                if(set.contains(s.charAt(right))) {
                    count++;
                }
                right++;
            }
            if(right<len&&set.contains(s.charAt(right))){
                count++;
            }
            right++;
            if(set.contains(s.charAt(left))){
                count--;
            }
            left--;
        }
        return count;
    }
}
