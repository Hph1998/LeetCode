public class MyAtoi008 {

    public int myAtoi(String str) {

        str = str.trim();//������ȥ��ǰ��ո�
        int len = str.length();
        int i=0;
        int end=-1;//��ǽ���λ�� -1�ַ�������λ������+-ȫ������ 0��ʾ��λ��+-������������
                   //1Ϊ��λ��+-���ڶ�λ��������
        if(str.equals("")||str.equals("+")||str.equals("-")){//�� ���� ֻ��+-����0
            return 0;
        }
        if(str.charAt(0)=='+'||str.charAt(0)=='-'){//��λ��+-�ӵڶ�λ��ʼѭ��
            i=1;
        }
        for(;i<len;i++){
            if(!Character.isDigit(str.charAt(i))){//���������ֱ��end
                end=i;
                break;
            }
        }

        if((end==1&&!Character.isDigit(str.charAt(0)))||end==0){//end=1ʱ�п��ܵڶ�λ��С����
            return 0;
        }else {
            int res;
            try{
                if(end==-1){
                    res = Integer.parseInt(str);
                }else{
                    res = Integer.parseInt(str.substring(0,end));
                }
            }catch (Exception e){//����int��ʾ��Χ�����쳣���ж�����
                if(str.charAt(0)=='-'){
                    return Integer.MIN_VALUE;
                }else{
                    return Integer.MAX_VALUE;
                }
            }

            return res;
        }

    }

    public static void main(String[] args) {
        MyAtoi008 myAtoi008 = new MyAtoi008();
        int a = myAtoi008.myAtoi("-91283472332");
        System.out.println(a);
    }
}
