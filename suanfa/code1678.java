package suanfa;

/**
 * @author liu
 * @TIME 2022/11/6 16:16
 */
public class code1678 {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        String res = "";
        int i = 0;
        while(i < command.length()){
            if(command.charAt(i) =='G'){
                res +="G";
                i++;
            }else if(command.charAt(i)=='('&&command.charAt(i+1)==')'){
                res+="o";
                i+=2;
            }else{
                res+="al";
                i+=4;
            }
        }
        System.out.println(res);
    }
}
