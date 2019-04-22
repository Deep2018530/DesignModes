package strategymode.behaviour;

/**
 * 快乐地跳舞
 * 
 * @author DeepSleeping
 *
 */
public class DanceHappy implements DanceBehavior {

	@Override
	public void dance() {
		System.out.println("快乐地跳舞！");
	}

}
