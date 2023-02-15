package tightcoupling;

public class mobile {
String mobile;
int ram;
String colour;
Double price;
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
Sim sim;
public Sim getSim() {
	return sim;
}
public void setSim(Sim sim) {
	this.sim = sim;
}
@Override
public String toString() {
	return "mobile [mobile=" + mobile + ", ram=" + ram + ", colour=" + colour + ", price=" + price + ", sim=" + sim
			+ "]";
}

}

