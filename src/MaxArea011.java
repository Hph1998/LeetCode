import java.util.HashMap;

public class MaxArea011 {

    public int maxArea(int[] height) {
        //�������Ǳ��� �ܺö���ע���Ҷ���֪����ôд��
        int len = height.length;
        int maxArea = 0;
        for(int i =0; i<len-1;i++){
            for(int j = i+1;j<len;j++){
                int area = (j-i)*Math.min(height[i],height[j]);
                if(area>maxArea){
                    maxArea = area;
                }
            }
        }
        return maxArea;

    }

    public static void main(String[] args) {
        MaxArea011 maxArea011 = new MaxArea011();
        int[] height = new int[]{1,8,6,2,9,4,8,3,7};
        System.out.println(maxArea011.maxArea(height));;
    }


}
