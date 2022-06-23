//logic
// 1. Sort array
// 2.Take pq(max heap) to store the durations
// 3. Iterate over the courses, try to minimize the endtime while maximize the courses
// 4. return Courses-completed=pq.size()

//for any iteration, check if taking up current course would get completed in the designated time
// a: if yes, then add new course time  and update currentTime
// b: if it exceeds the deadline, swap it with the biggest duration from the ones taken up 
// ** also checks is this swap helpful? the duration we are inserting should not larger than the peek


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