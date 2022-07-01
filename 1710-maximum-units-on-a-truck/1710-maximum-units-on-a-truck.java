class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        //sort the boxes per unit wise
        // Arrays.sort(boxTypes,(a,b)-> {return a[1]<b[1]?1:-1;});
        Arrays.sort(boxTypes,(a,b)-> Integer.compare(b[1],a[1]));
        int k=0;int ans=0;
        while(truckSize>0 && k<boxTypes.length){
            
            if(truckSize>=boxTypes[k][0])
                ans+=boxTypes[k][0]*boxTypes[k][1];
            else
                ans+=truckSize*boxTypes[k][1];
            
            truckSize-=boxTypes[k][0];
            k++;
        }
        return ans;
//         for(int i=0;i<boxTypes.length;i++){
            
//         }
    }
}