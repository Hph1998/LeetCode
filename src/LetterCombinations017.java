import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LetterCombinations017 {

    public List<String> letterCombinations(String digits) {

        LinkedList<String> res = new LinkedList<>();//���ؽ�� ע����У�����
        int len = digits.length();
        if(len==0){//ֱ���˳�
            return res;
        }
        String[] map = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};//�绰�������
        res.add("");//�������� ��Ȼres.peek()�쳣
        for(int i =0; i<digits.length();i++){
            int x = Character.getNumericValue(digits.charAt(i));
            while(res.peek().length()==i){//ֱ��ͷԪ�ر�i��
                String t = res.remove();//ȡ��ͷ
                for(char s : map[x].toCharArray())//ȡ�����Ķ�ͷ�����������ֶ�Ӧ����ĸ
                    res.add(t+s);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        LetterCombinations017 letterCombinations = new LetterCombinations017();
        System.out.println(letterCombinations.letterCombinations("23"));
    }


}
