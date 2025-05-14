package homework_4_task3;

public class Lamp implements Dimmable, Switchable {

	protected boolean on;
	protected int brightness;
	
	
	@Override
	public void turnOn() {
		on = true;
	}
	
	@Override
	public void turnOff() {
		on = false;
	}
	
	@Override
	public boolean isOn() {
		return on;
	}
	
	@Override
	public void setBrightness(int level) {
		if (level < 0 || level > 100) {
			System.out.println("not possible");
		} else {
		brightness = level;
		}
	}
	
	@Override
	public int getBrightness() {
		return brightness;
	}
	
	@Override 
	public void dimToHalf() {
		brightness = brightness/2;
	}
	
}
