


public class NthPrime {
	

	
	
public static void main(String[] args){
		System.out.println("Enter a real number: ");
		int x = IO.readInt();
		int n = 1;
		int next = 0;
		if (x == 0){
			IO.reportBadInput();
			System.out.println("Enter a number greater than 0: ");
			x = IO.readInt();
			for (int count = 1; count <= x;){
				n +=1;
				for (next = 2; next <= n; next++){
					if(n%next == 0){
						break;
					}
					
					
				}
				if (next == n){
					count ++;
				}
			}
			IO.outputIntAnswer(n);}
		else if(x<0){
			IO.reportBadInput();
			System.out.println("Enter a positive number: ");
			x = IO.readInt();
			for (int count = 1; count <= x;){
				n +=1;
				for (next = 2; next <= n; next++){
					if(n%next == 0){
						break;
					}
					
					
				}
				if (next == n){
					count ++;
				}
			}
			IO.outputIntAnswer(n);}
		else{
		for (int count = 1; count <= x;){
			n +=1;
			for (next = 2; next <= n; next++){
				if(n%next == 0){
					break;
				}
				
				
			}
			if (next == n){
				count ++;
			}
		}
		IO.outputIntAnswer(n);
	}
}
}