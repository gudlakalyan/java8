package java2;

public class PlatinumService extends DiamondService {
	private int Gym = 1000;
	private int club = 1500;

	public PlatinumService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PlatinumService(int gym, int club) {
		super();
		Gym = gym;
		this.club = club;
	}

	public int getGym() {
		return Gym;
	}

	public void setGym(int gym) {
		Gym = gym;
	}

	public int getClub() {
		return club;
	}

	public void setClub(int club) {
		this.club = club;
	}

	@Override
	public String toString() {
		return "PlatinumService [Gym=" + Gym + ", club=" + club + "]";
	}

}
