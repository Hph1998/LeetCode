import java.util.Arrays;

public class ThreeSumClosest016 {

    public int threeSumClosest(int[] nums, int target) {

        int min = Integer.MAX_VALUE;//��Ϊ����Сֵ�ȸ������ֵ��
        if(nums.length < 3){
            return 0;
        }
        Arrays.sort(nums);//����������ڱ����ⷨ���ƺ�Ч������
        int len = nums.length;
        for(int i = 0;i < len - 2;i++){//��һ��ֻҪ����������������jk����
            for(int j = i+1;j<len-1;j++){//�ڶ���ֻҪ�������ڶ�������k����
                for(int k = j+1;k<len;k++){//����֮��
                    if(Math.abs(nums[i]+nums[j]+nums[k]-target)<Math.abs(min)){//�ȽϾ���ֵ
                        min = nums[i]+nums[j]+nums[k]-target;//�������¸�ֵ��Сֵ
                    }
                }
            }
        }
        return min+target;//ע�ⲻ�Ƿ���min��������֮��
    }

    public static void main(String[] args) {

        ThreeSumClosest016 threeSumClosest016 = new ThreeSumClosest016();
        int[] nums = new int[]{-1,2,1,-4};
        System.out.println(threeSumClosest016.threeSumClosest(nums,1));
    }

}
