package vo;

public class NameDTO {
	private String name; 
	private int ranking;
	private int population;
	private String gender;
	
	public NameDTO() {;}
	
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	
	@Override
	public String toString() {
		String str = name + "\t" + ranking + "\t" + population + "\t" + gender + "\n";
		return str;
	}
}
