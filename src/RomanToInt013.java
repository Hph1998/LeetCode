public class RomanToInt013 {

    public int romanToInt(String s) {

        //�������ֺ�����֮��Ĺ���
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int res = 0;//���
        int index = 0;//����

        while (s.length() != 0){
            int temp = s.indexOf(romans[index]);//�ַ�����ͷ��Ӧ����������λ��
            if(temp == 0){//�����ǿ�ͷ
                res = res + nums[index];
                s = s.substring(romans[index].length());//�����ַ���ֱ��Ϊ0����ѭ��
                if(index == 12){//��index==12���ַ�������ֻ��IIIIII���������ѭ��
                    res = res + s.length();
                    break;
                }
            }else{
                index++;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        RomanToInt013 romanToInt013 = new RomanToInt013();
        System.out.println(romanToInt013.romanToInt("MCMXCIV"));

    }

}
