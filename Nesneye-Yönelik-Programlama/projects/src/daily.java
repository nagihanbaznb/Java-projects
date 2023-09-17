import java.util.*;
	import java.lang.*;
public class daily {
	

	
	
	    
	    public static double maas_hesapla(double satilan_urun){
	     double maas=0;
	        if(satilan_urun<30){
	        	
	            return maas=300+(satilan_urun*50);
	            
	        }
	        else{
	            double fazla=(satilan_urun-30)*60;
	            return maas=400+(50*30)+fazla;
	        }
	    }
	    
	    public static void main(String args[])
	    { 
	        System.out.println(maas_hesapla(35));
	    }
	}
