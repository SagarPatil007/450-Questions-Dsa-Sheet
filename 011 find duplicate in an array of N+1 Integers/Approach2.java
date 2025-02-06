public class Approach2 {
    public static void main(String[] args) {
        int nums[] = {1,3,4,2,2};
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        System.out.println(slow);
    }    
}
