public class LengthOfLongestSubstring003 {
    public int lengthOfLongestSubstring(String s) {
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
    }
}
