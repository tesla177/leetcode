package suanfa;



public class code1700 {
    public static void main(String[] args) {
        StringBuilder stu = new StringBuilder();
        StringBuilder sand = new StringBuilder();
        int[] student={1,1,0,0};
        int[] sandwiches={0,1,0,1};
        int len = student.length;
        for (int i = 0; i < len; i++) {
            stu.append(student[i]);
            sand.append(sandwiches[i]);
        }
        int stuLen = stu.length();
        int sandLen = sand.length();
        while (sandLen!=0){
            char c = stu.charAt(0);
            char d = sand.charAt(0);
            if(c == d){
                stu.deleteCharAt(0);
                sand.deleteCharAt(0);
                sandLen--;
                stuLen--;
            }else{
                stu.append(c);
                stu.deleteCharAt(0);
            }
            int count = 0;
            for (int i = 0; i < stuLen; i++) {
                char e = stu.charAt(i);
                char f = sand.charAt(0);
                if(e!=f){
                    count++;
                }
            }
            if(count == sandLen){
                System.out.println(count);
                break;
            }


        }




    }




}
