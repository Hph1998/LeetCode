public class TwoSum001 {
    public static int[] twoSum(int[] nums, int target) {
        int result[]={0,0};   //��ʼ��
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j) {   //������ͬһ��Ԫ�ز���ʹ������
                    if (nums[i] + nums[j] == target) {
                        result[0] = i;
                        result[1] = j;
                        break;  //ֻ���Ӧһ����
                    }
                }
            }
            if(result[1]!=0){
                break; //�޷���������ѭ�����Ӹ��жϡ�
            }
        }
        return result;
    }

}
