package school.mjc.stage0.conditions.task1;



public class PositiveNumberDeterminer {
    public void isPositive(int numberToBeDetermined) {
    		
    	if (numberToBeDetermined > 0) {
    		System.out.print(true);
    	} else {
    		System.out.print(false);
    	}
    }
    
    public static void main(String[] args) {
    	PositiveNumberDeterminer pos = new PositiveNumberDeterminer();
    	int number = 12;
    	pos.isPositive(number);
    }
    
    
}
