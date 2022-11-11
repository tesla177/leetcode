package suanfa;

/**
 * @author liu
 * @TIME 2022/11/8 10:16
 */
public class code1684 {
    public static void main(String[] args) {
        String allowed = "abc";
        String[] words = {"a","b","c","ab","ac","bc","abc"};
        int count = 0;
        int res = 1;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if(!allowed.contains(words[i].charAt(j)+"")){
                    res = 0;
                    break;
                }
            }
            count+=res;
            res = 1;
        }
        System.out.println(count);
    }
}
