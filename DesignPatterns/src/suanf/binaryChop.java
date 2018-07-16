package suanf;

import java.util.Arrays;

/**
 * 二分查找法
 * chouchan
 */
public class binaryChop {
    public static int binarySerarch(int[] nums,int target){
        int low=0,high= nums.length-1;
        while (low<=high){
            System.out.println(low+"---"+high);
            int mid=low+(high-low)/2;
            if (nums[mid] < target) { low = mid + 1;System.out.println("a"); }
            if (nums[mid] >= target) { high = mid - 1;System.out.println("b"); }

        }
        return low;
    }
    public static   void main(String args[])throws Exception{
        //题目是从[5,7,2,8,4,9,1,3,6] 快速查找到X在数据种的位置：
        int[] nums=new int[]{5,7,2,8,4,9,1,3,6};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int x=binarySerarch(nums,8);
        System.out.println(x);
    }
}
