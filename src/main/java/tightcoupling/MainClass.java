package tightcoupling;

public class MainClass {
public static void main(String [] args) {
	mobile m=new mobile();
	m.setColour("white");
	m.setMobile("OnePlus");
	m.setRam(8);
	m.setPrice(35000.0);
	m.setSim(new jio());
	System.out.println(m);
}
}
