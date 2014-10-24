public class Eggs{

	public static void main(String[] args){

		int counter=7; //minimum number of eggs

		while(true){ //loop forever
			boolean egg = true;// start as true
			//keeps track of whether number matches

			for(int i=2;i<7;i++){// loop starting at 2 up to and including 6
				if(counter%i!=1){//if int in counter divided by int in loop has no remainder
					egg=false;//doesn't match, jump to counter increment
				}
			}
			if(egg==true){ // when true, break from loop
				break;
				//if this number passes all the test exit the loop
			}
			counter+=7; //increment in jumps of seven
		}
		System.out.println(counter); //print result
	}
}
