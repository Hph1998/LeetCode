import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum015 {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new LinkedList<>();
        if(nums.length < 3){
            return res;
        }
        Arrays.sort(nums);
        int len = nums.length;
        for(int i = 0;i < len - 2;i++){
            int left = i+1;
            int right = len - 1;
            while(left<right){
                if((i>0&&nums[i]!=nums[i-1])||i==0){//��һ���㲻����ʲô�жϣ����Ǻ�������൱����nums[j]+nums[k]���෴�������nums[i]=nums[i-1]����ǰ���Ѿ��������������õ������б�Ҫ����һ����
                    if((nums[left]+nums[right]+nums[i])==0){
                        if(nums[left]!=nums[left-1]||(left-1==i)){//����-2��0��0��2��2�����Զ��ֻ���������
                            res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                        }
                        left++;
                        right--;
                    }
                    if((nums[left]+nums[right]+nums[i])<0){
                        left++;//˵����һ����С�ˣ�ֻ��������ߵ�
                    }
                    if((nums[left]+nums[right]+nums[i])>0){
                        right--;//˵����һ�������ˣ�ֻ�ܼ����ұߵ�
                    }

                }
                else{
                    left++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        ThreeSum015 threeSum015 = new ThreeSum015();
        int[] a = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum015.threeSum(a));
    }
}
