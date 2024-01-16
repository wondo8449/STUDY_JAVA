package override;

public class AirForce extends Unit {

	public AirForce(String name) {
		super(name);
	}
	@Override
	public void attack() {
		super.attack();
		System.out.println(super.getName() + ">>이륙");
		System.out.println(super.getName() + ">>공중공격 실행");
	}
	
	public void bombing() {
		System.out.println(super.getName() + ">>폭격");
	}
}
