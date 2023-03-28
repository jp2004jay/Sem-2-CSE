class Time
{
	int hours;
	int minutes;
	int seconds;
	
	public Time(int hours, int minutes, int seconds){
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public void addTime(Time t1){
		this.seconds  += t1.seconds;
		if(this.seconds>=60){
			this.minutes+=1;
			this.seconds-=60;
		}
		
		this.minutes += t1.minutes;
		if(this.minutes>=60){
			this.hours+=1;
			this.minutes-=60;
		}
		
		this.hours += t1.hours;
	}
}

public class TestTime
{
	public static void main(String[] args){
		Time t1 = new Time(2, 45, 60);
		Time t2 = new Time(3, 40, 55);
		t1.addTime(t2);
		System.out.println(t1.hours+":"+t1.minutes+":"+t1.seconds);
	}
}