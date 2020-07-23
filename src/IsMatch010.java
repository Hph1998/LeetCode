public class IsMatch010 {

    public boolean isMatch(String s, String p) {

        //���ģʽ��Ϊ�գ���ֻ��ƥ��յ�ƥ�䴮��
        if (p.isEmpty()){
            return s.isEmpty();
        }
        //��¼ƥ�䴮�ĵ�һ���ַ��Ƿ�ģʽ��ƥ�䡣
        boolean firstMatch = (!s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));
        //ģʽ�����������ַ������ϲ��ҵڶ����ַ�Ϊ * ��
        if (p.length() >= 2 && p.charAt(1) == '*'){
            //���ģʽ���������ַ��������ƥ��ԭƥ�䴮
            //����ƥ�䴮ɾ����һ��ƥ����ַ�����Ա�ģʽ��ƥ�䣬���ʾ��ƥ�䡣
            return (isMatch(s, p.substring(2)) || (firstMatch && isMatch(s.substring(1), p)));
        } else {
            //���ģʽ��ֻ��һ���ַ����ߵڶ����ַ�����* ��
            //��ƥ�䴮��һ���ַ���ģʽ��ƥ�䲢�ҷֱ�ɾ����һ���ַ���ģʽ������ƥ��ƥ�䴮��
            return firstMatch && isMatch(s.substring(1), p.substring(1));
        }

    }


    public static void main(String[] args) {
        IsMatch010 isMatch010 = new IsMatch010();
        isMatch010.isMatch("aaa","a*");
    }

}
