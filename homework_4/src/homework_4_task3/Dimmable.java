package homework_4_task3;

public interface Dimmable {

	int MAX_BRIGHTNESS = 100;
	
	void setBrightness(int level);

	int getBrightness();
	
	void dimToHalf();
		
}
