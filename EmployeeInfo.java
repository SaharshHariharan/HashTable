//this is the one
public class EmployeeInfo {

	private int empNum;
    private String firstName;
    private String lastName;
    private int sex; // encode e.g. 0 for M, 1 for F, etc.
    private int workLoc; // encode e.g. 0 for Mississauga, etc.
    protected double deductRate; // e.g. 0.21 for 21%
	    
    public EmployeeInfo (int n, String fn, String ln, int s, int wl, double rate) {
    	empNum = n;
    	firstName = fn;
    	lastName = ln;
    	sex = s;
    	workLoc = wl;
    	deductRate = rate;
    }
    
    public int getNumber () {
    	return empNum;
    }
    
    public void setNumber (int n) {
    	empNum = n;
    }
}
