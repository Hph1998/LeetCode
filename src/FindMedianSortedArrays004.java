import java.util.HashMap;

public class FindMedianSortedArrays004 {
    //Ҫ��ʱ�临�Ӷ�O(log(m+n)) û�ﵽ��ͨ�� ������O(m+n)
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int temp1=0;//��¼����nums1[]��λ��
        int temp2=0;//��¼����nums2[]��λ��
        HashMap hashMap = new HashMap();//����Ҳû��Ҫ�� ������ܸ㶨
        double res=0;
        for(int i = 0; i<len/2+1; i++){ //�����ŵ�һ��ͳ����
            if(temp1>=nums1.length){
                hashMap.put(i, nums2[temp2]);
                temp2++;
            }else if(temp2>=nums2.length){
                hashMap.put(i, nums1[temp1]);
                temp1++;
            }else if(nums1[temp1]<nums2[temp2]) {
                hashMap.put(i, nums1[temp1]);
                temp1++;
            }else {
                hashMap.put(i, nums2[temp2]);
                temp2++;
            }
        }
        if(len % 2 == 1){//�ж��ܸ�����ż
            res = Double.parseDouble(hashMap.get(len/2).toString());
        }else{
            res = (Double.parseDouble(hashMap.get(len/2-1).toString()) + Double.parseDouble(hashMap.get(len/2).toString()))/2.0;
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{3,4};
        //findMedianSortedArrays(nums1,nums2);
    }
}
