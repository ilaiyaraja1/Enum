package Days;

public class everycommendays {
	
	enum days{
		monday,tuesday,wednesday,thursday,friday,saturday,sunday
	}
	
	
	public static void weekend(days d){
		
     	if(d.equals(days.sunday)){
     				System.out.println(d+"is holyday");
     		
     			}
     	else{
     		System.out.println(d+"is working day");
     	}
}
	
	

	public static void main(String[] args) {
		
		for(days d:days.values()){
			weekend(d);
		}
	}	
}








