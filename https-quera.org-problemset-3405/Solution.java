import java.util.Scanner;
import java.util.ArrayList;

public class Solution
{
	public static void main(String[] args) {
		app();
	}
	
	private static void app(){
	    Scanner scanner = new Scanner(System.in);
	    int num = scanner.nextInt();
	    ArrayList<Integer> nums = new ArrayList<Integer>();
	    nums.add(num);
	    int i = 0;
	    while(nums.get(i++) != 0){
	        num = scanner.nextInt();
	        nums.add(num);
	    }
	    
	    nums = reverseArrayList(nums);
	    nums.remove(0);
	    
	    for(int j: nums)
	        System.out.println(j);
	}
	
	private static ArrayList<Integer> reverseArrayList(ArrayList<Integer> alist)
    {
        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
        for (int i = alist.size() - 1; i >= 0; i--) {
 
            revArrayList.add(alist.get(i));
        }
 
        return revArrayList;
    }
}
