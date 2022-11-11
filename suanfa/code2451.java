package suanfa;

/**
 * @author liu
 * @TIME 2022/11/3 19:54
 */
public class code2451 {
    public static void main(String[] args) {
        String[] word = {"adc","wzy","abc"};
        int[] difference=new int[word.length];
        for(int i=0;i<word.length;i++) {
            int sum=0;
            char[] letter=word[i].toCharArray();
            for(int j=1,k=26;j<letter.length;j++,k++){
                sum+=(letter[j]-letter[j-1])*k;
            }
            difference[i]=sum;
        }
        for(int i=1;i<difference.length-1;i++)
            if(difference[i-1]!=difference[i] && difference[i]!=difference[i+1])
                System.out.println(word[i]);
        if(difference[0]!=difference[1]) System.out.println(word[0]);
        else if(difference[difference.length-1]!=difference[0]) System.out.println(word[difference.length - 1]);
        else System.out.println("");


    }

}
