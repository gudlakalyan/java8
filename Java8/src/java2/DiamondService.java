package java2;

public class DiamondService extends GoldService {
	int TwoWheelerParking = 1000;
	int FourWheelerParking = 1000;

	public DiamondService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DiamondService(int twoWheelerParking, int fourWheelerParking) {
		super();
		TwoWheelerParking = twoWheelerParking;
		FourWheelerParking = fourWheelerParking;
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

	@Override
	public String toString() {
		return "DiamondService [TwoWheelerParking=" + TwoWheelerParking + ", FourWheelerParking=" + FourWheelerParking
				+ "]";
	}

}
