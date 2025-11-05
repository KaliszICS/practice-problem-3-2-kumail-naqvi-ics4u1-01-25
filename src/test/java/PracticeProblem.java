public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void q1() {
	
	}
	public static int towerOfHanoi(int num) {
    if (num < 3) return -1;
    if (num == 3) return 7;
    return 2 * towerOfHanoi(num - 1) + 1; 
}

}

