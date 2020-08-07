import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum018 {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> res = new ArrayList<>();
        if(nums.length < 4){
            return res;
        }
        Arrays.sort(nums);//����������ڱ����ⷨ���ƺ�Ч������ ���ǿ���ȥ��
        int len = nums.length;
        for(int i = 0;i < len - 3;i++){//��һ��ֻҪ���������ĸ�����jkl����
            int a = nums[i];
            for(int j = i+1;j<len-2;j++){//�ڶ���ֻҪ����������������kl����
                int b = nums[j];
                for(int k = j+1;k<len-1;k++){//������ֻҪ�������ڶ�������l����
                    int c = nums[k];
                    for(int l = k+1;l<len;l++){//���һ�㶵��֮��
                        int d = nums[l];
                        if(a+b+c+d==target){//�����������������������
                            List<Integer> temp = new ArrayList<>();
                            temp.add(a);
                            temp.add(b);
                            temp.add(c);
                            temp.add(d);
                            if(!res.contains(temp)) {//���������ݲ��ظ�
                                res.add(temp);
                            }
                        }
                    }
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {

        FourSum018 fourSum018 = new FourSum018();

        System.out.println(fourSum018.fourSum(new int[]{-3,-2,-1,0,0,1,2,3},0));

    }

}
