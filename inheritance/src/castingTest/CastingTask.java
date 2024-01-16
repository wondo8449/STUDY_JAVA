package castingTest;

public class CastingTask {
	
	public void check(Video video) {	
		
		if( video instanceof Animation) {
			Animation animation =(Animation)video;
			animation.subscribe();
		} else if(video instanceof Drama) {
			Drama drama = (Drama)video;
			drama.Goods();
		} else if(video instanceof Film) {
			Film film = (Film)video;
			film.Set4D();
		}
	}
	
	public static void main(String[] args) {
		CastingTask ct = new CastingTask();
		ct.check(new Drama());
		ct.check(new Animation());
		ct.check(new Film());
	}
}
