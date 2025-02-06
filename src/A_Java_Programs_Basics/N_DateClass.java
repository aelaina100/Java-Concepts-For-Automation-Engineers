package A_Java_Programs_Basics;
import java.text.SimpleDateFormat;
import java.util.Date;  //Important: Util package "jave.util" contains the date class & the 'collections' framework.

public class N_DateClass {
	public static void main(String[] args) {
		
		// I want to to display today's date in the format of mm/dd/yyyy
		Date d= new Date(); // contains current date, in and by itself.
		System.out.println(d.toString());  // output is today's date:    Sat Feb 11 19:39:26 EST 2023   
		// So to format:
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy/MM/dd"); // or even only MM or yyyy or dd
        System.out.println(sdf.format(d)); 
       // sdf.format(d).
	
	}}
        
        
        

