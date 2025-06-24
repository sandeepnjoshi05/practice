package practice;

public class Array {
	private int[] items;
	private int count;
	
	public Array(int length) {
		items = new int [length];	
	}
	
	public void print() {
		for(int i=0; i<count; i++)
			System.out.println(items[i]);
	}

	//insert method
	public void insert(int item) {
		//array is full resize
		
		if(items.length==count) {
			//create new array (twice the size)
			int[] newItems = new int[count *2];
			
			// copy all existing items 
			for(int i=0; i<count; i++)
				newItems[i] = items[i];
			
			// set items to this new array
			
			items = newItems;
		}
		
		//add new item at the end 
		
		items[count] = item;
		count++;
	}
}
