package strategymode.behaviour;

/**
 * 不可能跳舞
 * 
 * @author DeepSleeping
 *
 */
public class DanceNoWay implements DanceBehavior {

	@Override
	public void dance() {
		System.out.println("我怎么可能会跳舞！");
	}

}
