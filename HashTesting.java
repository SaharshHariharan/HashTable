public class HashTesting {
	
	public static void main (String args []) {
		
		MyHashTable hashtable = new MyHashTable (2);
		
		EmployeeInfo someEmployee = new EmployeeInfo (19, "Jerry", "Smith", 0, 2, 0.21);
		hashtable.addEmployee(someEmployee);
		
		EmployeeInfo someEmployee2 = new EmployeeInfo (28, "Morty", "Smith", 0, 2, 0.51);
		hashtable.addEmployee(someEmployee2);
		
		EmployeeInfo someEmployee3 = new EmployeeInfo (16, "Rick", "Sanchez", 0, 2, 0.36);
		hashtable.addEmployee(someEmployee3);
		
		EmployeeInfo someEmployee4 = new EmployeeInfo (9, "Summer", "Smith", 1, 2, 0.47);
		hashtable.addEmployee(someEmployee4);
		
		EmployeeInfo someEmployee5 = new EmployeeInfo (17, "Beth", "Smith", 1, 2, 0.17);
		hashtable.addEmployee(someEmployee5);
		
		hashtable.displayContents();
		hashtable.removeEmployee(19);
		hashtable.removeEmployee(28);
		System.out.println("\nAfter Removal: ");
		hashtable.displayContents(); 
		//hashtable.searchByEmployeeNumber(17);
		System.out.println("\nPosition of Beth: " + hashtable.searchByEmployeeNumber(17));

	}

}
