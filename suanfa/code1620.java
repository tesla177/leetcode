package suanfa;

/**
 * @author liu
 * @TIME 2022/11/2 19:28
 */
public class code1620 {
    public static void main(String[] args) {
        int[][] towers = {{1,2,5},{2,1,7},{3,1,9}};
        int radius = 2;
        int res = -1;
        int x = -1;
        int y = -1;
        for (int i = 0; i <= 50; i++) {
            for (int j = 0; j <= 50; j++) {
                int cur = 0;
                for (int k = 0; k < towers.length; k++) {
                    double d = Math.pow(i - towers[k][0],2) + Math.pow(j - towers[k][1],2);
                    if(d <= radius*radius){
                        cur += towers[k][2]/(1+Math.sqrt(d));
                    }
                    if(cur > res){
                        res = cur;
                        x = i;
                        y = j;
                    }

                }

            }

        }
        int[] result = {x,y};
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }


    }
}
