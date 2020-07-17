public class LengthOfLongestSubstring003 {
    /*public int lengthOfLongestSubstring(String s) {
        int len = s.length();//�ַ������ȸ�����ѭ����
        String res = "";
        //����ѭ��һ�����ƽ�
        for(int i=0;i<len;i++){
            String temp="";
            for(int j=i;j<len;j++) {
                if(temp.contains(""+s.charAt(j))){//��ǰ�ַ����Ƿ��Ѱ���ĳ�ַ�
                    break;//�������� ����һ���ַ��ٳ���
                }else {
                    temp = temp + s.charAt(j);//������������
                }
            }
            if(temp.length()>res.length()){//˭������˭
                res=temp;
            }
        }
        return res.length();
    }*/

    public static int lengthOfLongestSubstring(String s) {
        int array[] = new int[128];

        int start = 0;
        int maxlen = 0;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            System.out.print(c);
            System.out.print(array[c]);

            if(array[c] > start){
                start =  array[c];
                System.out.print(start);
            }
            maxlen = (i-start+1) > maxlen?(i-start+1):maxlen;
            System.out.print(maxlen);
            array[c] = i+1;
            System.out.println(array[c]);
        }
        return maxlen;
    }

    public static void main(String[] args) {
        String s = "pwwkew";
        lengthOfLongestSubstring(s);
    }


}
