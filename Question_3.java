class TwoStacks{
	
	int max=10;
	int arr[]=new int[max];
	int top1=-1;
	int top2=max;
	
	void push1(int x){
		arr[++top1]=x;
		
	}
	
	void push2(int x){
		arr[--top2]=x;
	}
	
	 void display(){
		for(int i=0;i<max;i++){
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String... args){
		TwoStacks t=new TwoStacks();
		t.push1(5);
        t.push2(10);
        t.push2(15);
        t.push1(11);  
        t.push2(7);
        t.push2(40);
		
		//t.display();
		
		System.out.println("Popped element from stack1 is "+t.arr[t.top1]);
		System.out.println("Popped element from stack2 is "+t.arr[t.top2]);
	}
}