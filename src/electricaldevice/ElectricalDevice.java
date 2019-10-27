/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electricaldevice;

/**
 *
 * @author Admin
 */
public class ElectricalDevice {
	protected String manufacture;
	protected int price;
	protected String id;
	protected boolean swither;

	public ElectricalDevice(String manufacture, int price, String id, boolean swither) {
		this.manufacture = manufacture;
		this.price = price;
		this.id = id;
		this.swither = swither;

	}

	public String getmanufacture() {
		return manufacture;

	}

	public int getprice() {
		return price;
	}

	public String getid() {
		return id;
	}

	public boolean getswither() {
		return swither;
	}

	public void setmanufacture(String x) {
		manufacture = x;

	}

	public void setprice(int x) {
		price = x;
	}

	public void setid(String x) {
		id = x;
	}

	public void setswither(boolean x) {
		swither = x;
	}

	public String toString() {
		return manufacture + id + ", giá:" + price + ", " + swither;
	}

	public void turnOn() {
		swither = true;
	}

	public void turnoff() {
		swither = false;
	}

    void turnOff() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
