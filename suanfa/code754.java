package suanfa;

/**
 * @author liu
 * @TIME 2022/11/4 14:05
 */
public class code754 {
    public static void main(String[] args) {
        int target = 4,i=0;
        while(target>0){
            i++;
            target-=i;
        }
        int res = target%2==0 ? i:i+1+i%2;
        System.out.println(res);


    }


}
