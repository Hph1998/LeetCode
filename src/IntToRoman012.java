import java.util.HashMap;

public class IntToRoman012 {

    public String intToRoman(int num) {

        if(num>3999||num<1){//���ڷ�Χ��ֱ��return
            return null;
        }

        //�������HashMap����ȡ
        HashMap<Integer,String> hashMap = new HashMap<Integer,String>(){
            {
                put(1,"I");
                put(5,"V");
                put(10,"X");
                put(50,"L");
                put(100,"C");
                put(500,"D");
                put(1000,"M");
                put(4,"IV");
                put(9,"IX");
                put(40,"XL");
                put(90,"XC");
                put(400,"CD");
                put(900,"CM");
            }
        };

        String res = "";//���
        int i = 1;//����λ�� ��λ ʮλ ��λ������

        //�Ӹ�λ��ʼȡ
        while(num>0){
            int temp = num % 10;//��ǰλ����ֵ
            int key = temp * i;//��ʵ�ʱ�ʾ��ֵ
            int center = key;//678����5�𲽼���5�ж�
            if(hashMap.containsKey(key)){//�ڹ����ִ���ֱ������
                res = hashMap.get(key) + res;
            }else {
                for(int j=0;j<temp;j++){//�ڹ����в����ڣ������ҹ�������
                    res = hashMap.get(key/temp) + res;
                    center = center - key/temp;//678����5�������𲽼���5
                    if(hashMap.containsKey(center)){//��5�������ӣ�����forѭ��
                        res = hashMap.get(center) + res;
                        break;
                    }
                }
            }
            i = i * 10;
            num = num / 10;
        }

        return res;
    }

    public static void main(String[] args) {

        IntToRoman012 intToRoman012 = new IntToRoman012();
        System.out.println(intToRoman012.intToRoman(58));
    }
}
