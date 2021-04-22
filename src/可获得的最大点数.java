public class 可获得的最大点数 {
    public int maxScore(int[] cardPoints, int k) {
        int res = Integer.MAX_VALUE;//初始化为最大int值

        int len = cardPoints.length;
        if(len==1)  return cardPoints[0];
        int sum = 0;
        int count = 0;
        for(int i=0; i<len; i++){
            sum += cardPoints[i];
        }
        //维护一个n-k的数组和，求该数组的最小和
        for(int j=0; j<len-k; j++){
            count += cardPoints[j];
        }
        res = Math.min(res,count);
        for(int index=1; index<=k; index++) {
            count = count + cardPoints[len - k + index - 1] - cardPoints[index - 1];
            res = Math.min(res, count);
        }
        return sum - res;
    }

    public static void main(String[] args) {

    }
}
