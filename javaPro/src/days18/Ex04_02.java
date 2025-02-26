package days18;

import java.util.ArrayList;
import java.util.Collection;

import days16.Employee;
import days17.Car;
import days17.Engine;

public class Ex04_02 {

	public static void main(String[] args) {

		/*
		// Y_Engine -> Car 
		Y_Engine engine = new Y_Engine();
		Car tCar = new Car(engine);
		// tCar.~~~
		tCar.speedDown(100);
		tCar.speedDown(10);
		tCar.stop();
		 */

		// [Annoymous 클래스]
		//1.
		Car tCar = new Car(new Engine() {

			@Override
			public void moreFuel(int fuel) {
			}

			@Override
			public void lessFuel(int fuel) {
			}

			@Override
			public void stop() {
			}

		});

		//2.
		Employee newTemp = new Employee() {

			@Override
			public int getPay() {
				return 0;
			}
		};


		System.out.println(" end ");


	} // main

} // class 

class Y_Engine implements Engine{
	int speed;

	@Override
	public void moreFuel(int fuel) {
		speed += fuel * 0.5;
	}

	@Override
	public void lessFuel(int fuel) {
		speed -= fuel * 0.5;
	}

	@Override
	public void stop() {
		speed = 0;
	}

}
