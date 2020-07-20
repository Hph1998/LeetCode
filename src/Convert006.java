import java.util.HashMap;

public class Convert006 {
    public String convert(String s, int numRows) {
        if(numRows == 1){//һ�оͲ����� ���ӹ����� ������ʱ������
            return s;
        }

        int len = s.length();
        String res = "";

        for (int i = 0; i < numRows; i++) { //��ʾ�����н��ͼ���
            for (int j = i; j < len; j += (numRows - 1) * 2) {//�ҹ��� �����߼����numRows�Ĺ�ϵ
                res = res + s.charAt(j);
                if (i > 0 && i < numRows - 1) { //���ǵ�һ�л����һ�� �м����
                    int sec = j + 2 * (numRows - i - 1); //�ҹ��� �м�б�ŵĸ�numRows��i�Ĺ�ϵ
                    if (sec < len) {
                        res = res + s.charAt(sec);
                    }
                }
            }
        }
        return res;
    }
}
