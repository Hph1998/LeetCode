public class LongestCommonPrefix014 {

    public String longestCommonPrefix(String[] strs) {

        if(strs.length==0){//��ֱ�ӷ��ؿ�
            return "";
        }
        if(strs.length==1){//ֻ��һ��Ԫ��ֱ�ӷ��ص�ǰԪ��
            return strs[0];
        }

        String res = strs[0];//�����ʼ�ݼ�
        int len = res.length();
        for(int i = 0; i<len; i++){//��һ��ѭ���ǵ�һ��Ԫ�س����𽥼�1
            int k = 1;//���ƥ�����Ԫ�صĸ���
            for(int j = 1;j<strs.length; j++){//�ڶ���ѭ���Ǵӵڶ���Ԫ�����ƥ��
                if(strs[j].indexOf(res)==0){//���ڹ���ǰ׺k+1
                    k++;
                }else{
                    break;//ֻҪ��һ��������ֱ�������ڶ���ѭ��
                }
                if(k==strs.length){//ƥ�����Ԫ�ظ����鳤����Ƚ���
                    return res;
                }
            }
            res = res.substring(0,len-i-1);
        }

        return "";
    }

    public static void main(String[] args) {

        LongestCommonPrefix014 longestCommonPrefix014 = new LongestCommonPrefix014();
        System.out.println(longestCommonPrefix014.longestCommonPrefix(new String[] {"c","cc","ccc"}));

    }

}
