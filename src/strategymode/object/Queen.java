package strategymode.object;

import strategymode.behaviour.DanceNoWay;
import strategymode.behaviour.KnifeBehavior;

/**
 * 公主
 * @author DeepSleeping
 *
 */
public class Queen extends Character {
	
	public Queen(){
		//默认公主是用匕首的
		wb = new KnifeBehavior();
		//默认公主不会跳舞
		db = new DanceNoWay();
	}
}
