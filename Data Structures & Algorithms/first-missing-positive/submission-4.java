class Solution {
    public int firstMissingPositive(int[] nums) {
        return soluNN(nums);
    }

    public int soluN2(int[] nums) {
        int n = nums.length;
        int num=1;
        while(num<=n){
            boolean find = false;
            for(int i=0;i<n;i++){
                if(num==nums[i])
                {
                    find = true;
                    break;
                }
            }
            if(!find){
                return num;
            }
            num++;
        }
        return num+1;
    }

    public int soluNN(int[] nums) {
        int n = nums.length;
        boolean[] arr = new boolean[n];
        for(int i=0;i<n;i++){
            if(nums[i]>0 && nums[i]<=n){
                arr[nums[i]-1]=true;
            }
        }
        for(int i=0;i<n;i++){
            if(!arr[i])
                return i+1;
        }
        return n+1;
    }
    


}