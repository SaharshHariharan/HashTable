//import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyHashTable {
	private int bn;
    private ArrayList <EmployeeInfo> [] buckets;
       
    public MyHashTable (int bnn) {
    	bn = bnn;
    			
    	buckets = new ArrayList [bnn];
    			
    	for(int i=0; i < bnn; i++){
            buckets [i] = new ArrayList (); 
       }
    	
    }
    
    public int calcBucket(int keyValue) {
		// Returns the bucket number as the integer keyValue modulo the number of buckets for the hash table.
		return(keyValue % buckets.length);
	}
        
    public boolean addEmployee(EmployeeInfo theEmployee) { //add employee method
    	if (theEmployee == null) {
    		return false; //returns false if the employee has no value to it
    	} 
    	
    	else {
    		int sn = calcBucket(theEmployee.getNumber()); //calculates bucket number
    		buckets [sn].add(theEmployee); //adds employee to the end of an arraylist in the bucket
			return true; //returns true
    	}
   }

	
	
	public int searchByEmployeeNumber(int employeeNum) {
		int sn = calcBucket(employeeNum);
		int position = -1;
		
		for (int i=0; i < buckets[sn].size(); i++) {
			if ( buckets[sn].get(i).getNumber() == employeeNum) {
				position = i;
			}
		}
		return position;
		// Determine the position of the employee in the ArrayList for the bucket that employee hashes to.
		// If the employee is not found, return -1.
	}

	
	
	public EmployeeInfo removeEmployee(int employeeNum) {
		int sn = calcBucket(employeeNum); //gets the bucket number
		EmployeeInfo value = null; //sets the value to -1
		
		for (int i = 0; i < buckets[sn].size(); i++) {
			if ( buckets[sn].get(i).getNumber() == employeeNum) { //if the employee number in the bucket equals the inputed employee number
				value = buckets[sn].get(i);	//values gets the employee being removed
				buckets[sn].remove(i); //the employee gets removed
			}
		}
		
		return value;
		
	}

	
	
	public void displayContents() {
		
		// Print the employee numbers for the employees stored in each bucket's ArrayList,
		// starting with bucket 0, then bucket 1, and so on.
		
		for (int i = 0; i < buckets.length; i++) {

		    // For the current bucket, print out the emp num for each item
                    // in its ArrayList.

                    System.out.println("\nExamining the ArrayList for bucket " + i);
                    int listSize = buckets[i].size();
                    if (listSize == 0) {
		        System.out.println("  Nothing in its ArrayList!");
                    }
                    else {
                        for (int j = 0; j < listSize; j++) {
                           int theEmpNum = buckets[i].get(j).getNumber();
                           System.out.println("  Employee " + theEmpNum);
                        }
                    }

                }

	} // end displayContents
    

}
