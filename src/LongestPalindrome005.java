public class LongestPalindrome005 {
    public static String longestPalindrome(String s) {

        int len = s.length();

        while (len > 0) {

            //�����ⷨ ���ƻ����� ���볤��Ϊ5 ��һ��ѭ��12345
            //�ڶ���ѭ��1234 2345
            //������ѭ��123 234 345 ֱ���ҵ�����return
            F:
            for (int k = 0; k < s.length() - len + 1; k++) {//���ǵ�ǰ���ȣ��Ӵ���ͬ
                int i = k,j = k+len-1;
                while(i<j) {
                    if(s.charAt(i)==s.charAt(j)){
                        i++;
                        j--;
                    } else{
                        continue F;
                    }
                }
                return s.substring(k,k+len);
            }
            len--;//������ȵĶ��Ѿ������ˣ�����һ������
        }
        return s;
    }

    public static void main(String[] args) {
        String s = longestPalindrome("cbbd");
        System.out.println(s);
    }
}
