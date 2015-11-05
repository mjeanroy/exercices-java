package exercice2;

public class Duration {
	private long total;
	private int count;
	
	public Duration(long total){
		this.total = total;
		this.count = 1;
	}
	
	public void addDuration(Long a){
		this.total += a;
		count++;
	}
	
	public long avg(){
		return this.total/this.count;
	}
}
