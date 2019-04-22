package strategymode.behaviour;

/**
 * 使用宝剑
 * 
 * @author DeepSleeping
 *
 */
public class SwordBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("-使用宝剑刺杀-");
	}

}
