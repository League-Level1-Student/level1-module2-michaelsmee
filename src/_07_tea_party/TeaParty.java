package _07_tea_party;

import javax.swing.JOptionPane;

public class TeaParty {
String welcome;
String name;
boolean isWomen;
boolean isKnighted;
	   public String welcome(String name, boolean isWoman, boolean isKnighted) {
	if( isKnighted&&!isWoman ) {
	JOptionPane.showMessageDialog(null, "Hello Sir" + name);	
		
		return "Hello Sir " + name;
	}
	
	else if(! isKnighted&& !isWoman) {
		return "Hello Mr. " + name;
	}
	
	
		
	else if( isWoman&&!isKnighted ) {
	JOptionPane.showMessageDialog(null, "Hello Ms."+name);	
	
		   return "Hello Ms. "+name;
	} 
	else {
		return "Hello Lady" + name;
	}
}   
		   




 
		   
		   
		   





	   }



