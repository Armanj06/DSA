class Solution {
    public void moveZeroes(int[] nums) {
        int index=0;
        //Move non-zero elements forward
        for(int num:nums){
            if(num!=0){
                nums[index]=num;
                index++;
            }
        }
        //fill remaining places with 0
        while(index<nums.length){
            nums[index]=0;
            index++;
        }
    }
}