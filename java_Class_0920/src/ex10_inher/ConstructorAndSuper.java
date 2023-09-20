package ex10_inher;

class Car{
	int gasolineGauge;
	public Car(int gas) {
		this.gasolineGauge = gas;
	}
}

class HybridCar extends Car{
	int electricGauge;
	public HybridCar(int gas, int ele) {
		super(gas);
		this.electricGauge = ele;
	}	
}

class HybridWaterCar extends HybridCar{
	int waterGauge;
	HybridWaterCar(int gas, int ele, int water){
		super(gas,ele);
		this.waterGauge = water;
	}
	public void showCurrentGauge() {
		System.out.println("잔여가솔린:" + gasolineGauge);
		System.out.println("잔여전기량:" + electricGauge);
		System.out.println("잔여워터량:" + waterGauge);
	}	
}	
public class ConstructorAndSuper{
	public static void main(String[] args) {
		HybridWaterCar car1 = new HybridWaterCar(4,2,3);
		car1.showCurrentGauge();
		
		HybridWaterCar car2 = new HybridWaterCar(9,5,7);
		car2.showCurrentGauge();
	}
}

