class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i:nums1){
            arr.add(i);
        }
        for(int i:nums2){
            arr.add(i);
        }
        Collections.sort(arr);
        double median=0;
        int size=arr.size();
        if(size%2==0) median=(arr.get(size/2)+arr.get((size/2)-1))/2.0;
        else if(size%2!=0) median=arr.get(size/2);
        return median;
    }
}