class Solution {
    public int scheduleCourse(int[][] courses) {
        //first we sort the courses according to their ending time
        Arrays.sort(courses,(a,b)-> a[1]==b[1] ? a[0]-b[0] : a[1]-b[1]);
        PriorityQueue<Integer> maxpq= new PriorityQueue<>(Collections.reverseOrder());
        int currentTime=0;
        for(int i=0;i<courses.length;i++){
            //check if consider current course : if duration<= last day
            if(courses[i][0]<=courses[i][1]){
                //check if current course can be completed with the last day given
                if(currentTime+ courses[i][0]<=courses[i][1]){
                    maxpq.add(courses[i][0]);
                    currentTime+=courses[i][0];
                }
                else{
                    //check if we can swap with pq head
                    if(courses[i][0]<maxpq.peek()){
                        currentTime-=maxpq.poll();
                        currentTime+=courses[i][0];
                        maxpq.add(courses[i][0]);
                    }
                }
            }
            
        }
        return maxpq.size();
    }
}