package suanfa;

/**
 * @author liu
 * @TIME 2022/10/29 0:13
 */
public class code2437 {
    public static void main(String[] args) {
        String str = "?5:??";
        char A = str.charAt(0);
        char B = str.charAt(1);
        char C = str.charAt(3);
        char D = str.charAt(4);
        int ans = 1;
        if(A=='?'&&B =='?'){
            ans =24;
        } else if(A=='?'){
            if(B<'4'){
                ans =ans *3;
            }else{
                ans = ans *2;
            }
        } else if(B=='?'){
            if(A<'2'){
                ans =ans*10;
            }else{
                ans =ans *4;
            }
        }
        if(C=='?'){
            ans =ans*6;
        }
        if(D=='?'){
            ans =ans*10;
        }

        System.out.println(ans);









    }
}
