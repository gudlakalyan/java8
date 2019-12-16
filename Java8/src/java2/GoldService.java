package java2;

public class GoldService {
	int lift = 1000;
	int Security = 500;

	public GoldService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GoldService(int lift, int security) {
		super();
		this.lift = lift;
		Security = security;
	}

	public int getLift() {
		return lift;
	}

	public void setLift(int lift) {
		this.lift = lift;
	}

	public int getSecurity() {
		return Security;
	}

	public void setSecurity(int security) {
		Security = security;
	}

	@Override
	public String toString() {
		return "GoldService [lift=" + lift + ", Security=" + Security + "]";
	}

}
