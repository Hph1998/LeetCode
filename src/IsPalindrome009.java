public class IsPalindrome009 {
    public boolean isPalindrome(int x) {

        if(x<0){//��ʾ���Ǹ�����ֱ��false
            return false;
        }

        int temp = x;
        int[] resA = new int[10];//���ʮ��ǧ��
        int res = 0;
        int i = 0;//���x�Ǽ�λ��

        while(temp>0){//��λ����λ�������飬�Դ�����
            resA[i]=temp%10;
            temp=temp/10;
            i++;
        }

        for(int j = 0;j<i;j++){
            res = res*10+resA[j];
        }
        if(res==x){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        IsPalindrome009 isPalindrome009 = new IsPalindrome009();
        System.out.println(isPalindrome009.isPalindrome(101));
    }
}
