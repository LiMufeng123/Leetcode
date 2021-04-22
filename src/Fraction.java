import java.util.Arrays;
import java.util.logging.SocketHandler;

public class Fraction {
        public int[] fraction(int[] cont) {
            int len = cont.length;
            int []res = new int[]{0, 1};
            for(int i=len-1; i>=0; i--){
                int tmp = cont[i]*res[1]+res[0];//新分母
                res[0] = res[1];
                res[1] = tmp;

            }
            return new int[]{res[1],res[0]};

        }

    public static void main(String[] args) {
        Fraction f = new Fraction();
        int []cnt = new int[]{3,2,1};
        int []res = f.fraction(cnt);
        for(var i:res){
            System.out.println(i);
        }


    }
    }

