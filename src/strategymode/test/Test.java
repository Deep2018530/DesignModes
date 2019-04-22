package strategymode.test;

import strategymode.behaviour.DanceHappy;
import strategymode.behaviour.SwordBehavior;
import strategymode.object.Character;
import strategymode.object.Knight;
import strategymode.object.Queen;

public class Test {

	public static void main(String[] args) {

		Character knight = new Knight();
		Character queen = new Queen();

		// 骑士去刺杀
		knight.fight();
		// 公主去刺杀
		queen.fight();

		// 公主换成用宝剑刺杀
		queen.setWb(new SwordBehavior());
		queen.fight();

		System.out.println("--------------------");
		queen.dance();
		// 公主学会了跳舞
		queen.setDb(new DanceHappy());
		queen.dance();
	}
}
