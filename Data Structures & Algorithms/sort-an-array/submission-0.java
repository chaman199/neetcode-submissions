class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    void mergeSort(int[] nums, int i, int j){
        if(i>=j)
            return ;
        int mid = i + (j-i)/2;
        mergeSort(nums,i,mid);
        mergeSort(nums,mid+1,j);
        merge(nums,i,mid,j);
    }

    void merge(int[] arr,int i, int mid, int j){
        int lefti = i;
        int righti = mid+1;
        List<Integer> temp = new ArrayList<>();
        while(lefti <= mid && righti <= j){
            if(arr[lefti] < arr[righti]){
                temp.add(arr[lefti++]);
            }
            else {
                temp.add(arr[righti++]);
            }
        }
        while(lefti <= mid){
            temp.add(arr[lefti++]);
        }
        while(righti <= j){
            temp.add(arr[righti++]);
        }
        for(int k=i;k<=j;k++){
            arr[k] = temp.get(k-i);
        }
    }
}