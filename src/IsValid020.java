public class IsValid020 {

    public boolean isValid(String s) {
        char[] c = s.toCharArray();//��ת����
        String res = "";
        for (char value : c) {//����
            if (value == '(' || value == '[' || value == '{') {//�����żӽ���
                res = res + value;
            } else {
                if(res.isEmpty()){//resΪ�� ��value�������� ��Ȼ������
                    return false;
                }
                //�����������value����������res���һ����������
                if ((value == '}' && res.charAt(res.length() - 1) == '{') || (value == ']' && res.charAt(res.length() - 1) == '[') || (value == ')' && res.charAt(res.length() - 1) == '(')) {
                    res = res.substring(0, res.length() - 1);//ȥ��res��������
                } else {//ֻҪ����������������� ��Ȼ������
                    return false;
                }
            }
        }

        return res.isEmpty();//���resΪ������ ��֮
    }

    public static void main(String[] args) {

        IsValid020 isValid020 = new IsValid020();
        System.out.println(isValid020.isValid("[])"));

    }

}
