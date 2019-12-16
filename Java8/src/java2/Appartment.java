package java2;

public class Appartment {
	private int lift;
	private int TwoWheelerParking;
	private int FourWheelerParking;
	private int Security;
	private int SwimmingPool;
	private int Gym;
	private int Club;
	private int Theater;

	@Override
	public String toString() {
		return "Appartment [lift=" + lift + ", TwoWheelerParking=" + TwoWheelerParking + ", FourWheelerParking="
				+ FourWheelerParking + ", Security=" + Security + ", SwimmingPool=" + SwimmingPool + ", Gym=" + Gym
				+ ", Club=" + Club + ", Theater=" + Theater + "]";
	}

	public int getLift() {
		return lift;
	}

	public void setLift(int lift) {
		this.lift = lift;
	}

	public int getTwoWheelerParking() {
		return TwoWheelerParking;
	}

	public void setTwoWheelerParking(int twoWheelerParking) {
		TwoWheelerParking = twoWheelerParking;
	}

	public int getFourWheelerParking() {
		return FourWheelerParking;
	}

	public void setFourWheelerParking(int fourWheelerParking) {
		FourWheelerParking = fourWheelerParking;
	}

	public int getSecurity() {
		return Security;
	}

	public void setSecurity(int security) {
		Security = security;
	}

	public int getSwimmingPool() {
		return SwimmingPool;
	}

	public void setSwimmingPool(int swimmingPool) {
		SwimmingPool = swimmingPool;
	}

	public int getGym() {
		return Gym;
	}

	public void setGym(int gym) {
		Gym = gym;
	}

	public int getClub() {
		return Club;
	}

	public void setClub(int club) {
		Club = club;
	}

	public Appartment(int theater) {
		super();
		Theater = theater;
	}

	public Appartment() {
		super();
		// TODO Auto-generated constructor stub
	}

}
