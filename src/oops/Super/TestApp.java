package oops.Super;

public class TestApp
{
	public static void main(String[] args)
	{
		TwVehicle tw = new TwVehicle();
		tw.getSpec();
		tw.getTwInfo();

		System.out.println();

		LmvVehicle lmv = new LmvVehicle();
		lmv.getSpec();
		lmv.getLmvInfo();

		System.out.println();

		HmvVehicle hmv = new HmvVehicle();
		hmv.getSpec();
		hmv.getHmvInfo();
	}
}
