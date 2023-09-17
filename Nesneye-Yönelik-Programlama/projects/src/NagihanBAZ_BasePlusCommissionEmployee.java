
public class NagihanBAZ_171805024_BasePlusCommissionEmployee {
	   private String firstName;
	   private String lastName;
	   private String socialSecurityNumber;
	   private double grossSales; 
	   private double commissionRate; 
	   private double baseSalary; 

	  
	   public NagihanBAZ_171805024_BasePlusCommissionEmployee(String firstName, String lastName, 
	      String socialSecurityNumber, double grossSales, 
	      double commissionRate, double baseSalary)
	   {
	    
	      if (grossSales < 0.0) 
	         throw new IllegalArgumentException(
	            "Gross sales must be >= 0.0");

	      if (commissionRate <= 0.0 || commissionRate >= 1.0)
	         throw new IllegalArgumentException(
	            "Commission rate must be > 0.0 and < 1.0");

	      if (baseSalary < 0.0)                      
	         throw new IllegalArgumentException(    
	            "Base salary must be >= 0.0");       

	      this.firstName = firstName;
	      this.lastName = lastName;
	      this.socialSecurityNumber = socialSecurityNumber;
	      this.grossSales = grossSales;
	      this.commissionRate = commissionRate;
	      this.baseSalary = baseSalary;
	   }
	   public String getFirstName()
	   {
	      return firstName;
	   } 

	   public String getLastName()
	   {
	      return lastName;
	   } 

	   public String getSocialSecurityNumber()
	   {
	      return socialSecurityNumber;
	   } 

	   public void setGrossSales(double grossSales)
	   {
	      if (grossSales < 0.0) 
	         throw new IllegalArgumentException(
	            "Gross sales must be >= 0.0");

	      this.grossSales = grossSales;
	   } 

	   public double getGrossSales()
	   {
	      return grossSales;
	   } 

	   public void setCommissionRate(double commissionRate)
	   {
	      if (commissionRate <= 0.0 || commissionRate >= 1.0)
	         throw new IllegalArgumentException(
	            "Commission rate must be > 0.0 and < 1.0");

	      this.commissionRate = commissionRate;
	   } 

	   public double getCommissionRate()
	   {
	      return commissionRate;
	   }

	   public void setBaseSalary(double baseSalary)
	   {
	      if (baseSalary < 0.0)
	         throw new IllegalArgumentException(
	            "Base salary must be >= 0.0");

	      this.baseSalary = baseSalary;
	   } 

	   public double getBaseSalary()
	   {
	      return baseSalary;
	   } 

	   public double earnings()
	   {
	      return baseSalary + (commissionRate * grossSales);
	   } 
	   
	   public void printObjectInformation() 
	   {
			      System.out.printf("%n%s %s%n", "First name: ",getFirstName());
			      System.out.printf("%s %s%n", "Last name: ", getLastName());
			      System.out.printf("%s %s%n", "Social security number: ", getSocialSecurityNumber());
			      System.out.printf("%s %.2f%n", "Gross sales: ", getGrossSales());
			      System.out.printf("%s %.2f%n", "Commission rate: ",getCommissionRate());
			      System.out.printf("%s %.2f%n", "Base salary: ",getBaseSalary());
			      System.out.printf("%s %.2f%n%n", "Earnings: ",earnings());
		   

	}

}
