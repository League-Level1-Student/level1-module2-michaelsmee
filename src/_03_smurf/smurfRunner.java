package _03_smurf;

public class smurfRunner {

	public static void main(String[] args) {
		
		Smurf handy = new Smurf("handy");
		handy.eat();
		System.out.println(handy.getName());
		System.out.println(handy.getHatColor());
		System.out.println(handy.isGirlOrBoy());
		
		Smurf poppy = new Smurf("poppy");
		poppy.eat();
		System.out.println(poppy.getName());
		System.out.println(poppy.getHatColor());
		System.out.println(poppy.isGirlOrBoy());
		
		Smurf smurfette = new Smurf("smurfette");
		smurfette.eat();
		System.out.println(smurfette.getName());
		System.out.println(smurfette.getHatColor());
		System.out.println(smurfette.isGirlOrBoy());
	
	
	}
	
	

	
}
