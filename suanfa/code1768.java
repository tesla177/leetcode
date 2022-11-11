package suanfa;

/**
 * @author liu
 * @TIME 2022/10/2315:45
 */
public class code1768 {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        StringBuilder  res = new StringBuilder();
        int i = 0,j = 0;
        int len1 = word1.length(), len2 = word2.length();
        while(i!=len1 ||j!=len2){
            if(i < len1){
                res.append(word1.charAt(i));
                i++;
            }
            if(j <len2){
                res.append(word2.charAt(j));
                j++;
            }
        }

        System.out.println(res);





    }
}
