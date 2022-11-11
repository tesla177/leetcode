package suanfa;

/**
 * @author liu
 * @TIME 2022/11/1 20:45
 */
public class code1662 {
    public static void main(String[] args) {
        String[] word1 = {"ab","c","def"};
        String[] word2 = {"a","bc","de","fg"};
        int p1 = 0,p2 = 0,i = 0,j = 0;
        while(p1 < word1.length && p2 < word2.length){
            if(word1[p1].charAt(i) != word2[p2].charAt(j)){
                System.out.println(false);
                break;
            }
            i++;
            if(i==word1[p1].length()){
                p1++;
                i=0;
            }
            j++;
            if(j==word2[p2].length()){
                p2++;
                j=0;
            }
        }
        if(p1==word1.length&&p2==word2.length){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }


}
