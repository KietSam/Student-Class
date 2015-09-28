public class Student {
	private String name;
	private int score;
	private int[] classes;
	public Student(String name, int classes) {
		this.name = name;
		this.classes = new int[classes];
	}
	public void setScore (int classes, int score){
		this.classes[classes] = score;
	}
	public String toString() {
		for (int x = 0; x < classes.length; x++){
			score += classes[x];
		}
		return "Student " + name + " (avg: " + score/classes.length + ")";
	}
	public int getHighScore(){
		for (int x = 0; x < this.classes.length; x++){
			if (x == 0){
				score = classes[x];
			}
			if (classes[x] > score){
				score = classes[x];
			}
		}
		return score;
	}
	public String getName (){
		return name;
	}
	public int getAverage (){
		for (int x = 0; x < classes.length; x++){
			score += classes[x];
		}
		return score/classes.length;
	}
}