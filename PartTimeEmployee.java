
public class PartTimeEmployee extends EmployeeInfo {
	
	private double hourlyWage;
	private double hoursPerweek;
	private double weeksPerYear;
	
	public PartTimeEmployee(int n, String fn, String ln, int sx, int wl, double dR, double hW, double hpw, double wpy) {
		super(n, fn,  ln,  sx,  wl, dR);
		hourlyWage = hW;
		hoursPerweek = hpw;
		weeksPerYear = wpy;
	}
	
	public double getHourlyWage() {
		return hourlyWage;
	}
	
	public double getHoursPerWeek() {
		return hoursPerweek;
	}
	
	public double getWeeksPerYear() {
		return weeksPerYear;
	}
	
	public void setHourlyWage (double r) {
		hourlyWage = r;
	}
	
	public void setHoursPerWeek (double r) {
		hoursPerweek = r;
	}
	
	public void setWeeksPerYear (double r) {
		weeksPerYear = r;
	}
	
	public double calcSalary() {
		return hoursPerweek * weeksPerYear * hourlyWage;
	}
	
	public double calcAnnualNetIncome() {
		return calcSalary()*deductRate;
	}

} 
