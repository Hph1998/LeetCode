public class Reverse007 {
    public int reverse(int x) {

        String s = String.valueOf(x); //����ת�ַ���
        int len = s.length();
        int zs = len;
        if(s.charAt(0)=='-'){ //�ж�����
            zs = len-1;
        }
        String temp = "";
        for(int i=0;i<zs;i++){ //����
            temp = temp + s.charAt(len-i-1);
        }
        int res = 0;
        try { //�����쳣 ����int�ķ�Χ����0
            if(zs==len-1){
                res = 0-Integer.parseInt(temp);
            }else{
                res = Integer.parseInt(temp);
            }
        }catch (Exception e){
            return 0;
        }
        return res;
    }

}
