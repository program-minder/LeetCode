// question number: 1920

// Problem and sollution link: https://leetcode.com/problems/build-array-from-permutation/solutions/7396451/leetcode-1920-build-array-from-permutati-oy2s/

public class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
       
        int [] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=nums[nums[i]];
        }
        return res;
    }
}
