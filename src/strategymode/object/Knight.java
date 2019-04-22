package strategymode.object;

import strategymode.behaviour.SwordBehavior;

/**
 * 骑士
 * 
 * @author DeepSleeping
 *
 */
public class Knight extends Character {

	public Knight() {
		// 默认骑士是用宝剑的
		wb = new SwordBehavior();	
	}
}
