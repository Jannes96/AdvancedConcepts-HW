package homework_6_task1;

public class DotProductThread extends Thread{

	private int v1;
    private int v2;
    private int dot;

    // Constructor
    public DotProductThread(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
    }	
    
 // Compute the "dot product" (here assumed as multiplication of two numbers)
    @Override
    public void run() {
        this.dot = v1 * v2;
    }

    // Getter to retrieve the result after the thread has finished
    public int getDot() {
        return dot;
    }
	
}
