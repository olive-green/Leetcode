class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
//         Arrays.sort()
//         ArrayList<Integer> list=new ArrayList<>();
//         int i=0,j=0;
//         int flag=-1;
//         while(i<n && j<m){
//             if(nums1[i]==nums2[j] && flag!=nums2[j]){
//                 list.add(nums1[i]);
//                 flag=nums1[i];
//                 i++;j++;
//             }
//             else if(n<m)
//                 j++;
//             else
//                 i++;
            
//         }
//         int[] ans=new int[list.size()];
//         for(int k=0;k<list.size();k++){
//             ans[k]=list.get(k);
//         }
//         return ans;
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> intersect=new HashSet<>();
        for(int i=0;i<n;i++)
            set1.add(nums1[i]);
        for(int i=0;i<m;i++)
        {
            if(set1.contains(nums2[i]))
                intersect.add(nums2[i]);
        }
        
        //copy set to array
        int[] ans=new int[intersect.size()];
        int k=0;
        for(int num:intersect){
            ans[k++]=num;
        }
        return ans;
    }
    
}