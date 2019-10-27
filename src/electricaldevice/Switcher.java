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
import java.util.Vector;

public class Switcher implements Switchable {
	private Vector devices;
	private boolean state;

	public Switcher() {
		devices = new Vector();
		state = true;
	}

	public boolean getState() {
		return state;
	}

	public void setState(boolean x) {
		state = x;
	}

	public void addDevice(ElectricalDevice x) {
		devices.addElement(x);

	}

	public void removeDevice(ElectricalDevice x) {
		devices.removeElement(x);
	}

	public void turnOn() {
		state = true;
		for (int i = 0; i < devices.size(); i++)
			((ElectricalDevice) devices.elementAt(i)).turnOn();
	}

	public void turnOff() {
		state = false;
		for (int i = 0; i < devices.size(); i++)
			((ElectricalDevice) devices.elementAt(i)).turnOff();

	}

}
