package strategymode.behaviour;

/**
 * 使用匕首
 * 
 * @author DeepSleeping
 *
 */
public class KnifeBehavior implements WeaponBehavior {

	@Override
	public void useWeapon() {
		System.out.println("-使用匕首刺杀-");
	}

}
