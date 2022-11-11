package suanfa;

/**
 * @author liu
 * @TIME 2022/10/27 18:59
 */
public class code1822 {
    public static void main(String[] args) {
        String[] queries = {"word","note","ants","wood"};
        String[] dictionary = {"wood","joke","moat"};
        Integer len1 = queries.length;
        Integer len2 = dictionary.length;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int idx =0;
        for(int i = 0;i<len1;i++){
            for(int j = 0;j<len2;j++){
                int c = 0;
                if(queries[i].length()!=dictionary[j].length()){
                    c = 3;
                } else {
                    int len3 = queries[i].length();
                    for(int k =0;k<len3;k++){
                        if(queries[i].charAt(k)!=dictionary[j].charAt(k)){
                            c++;
                        }
                    }
                }
                if(c<3){
                    sb.append("\""+queries[i]+"\" "+",");
                    break;
                }
            }
        }

        sb.append("]");
        System.out.println(sb);







    }
}
