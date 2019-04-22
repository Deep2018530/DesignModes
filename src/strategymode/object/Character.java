package strategymode.object;

import strategymode.behaviour.DanceBehavior;
import strategymode.behaviour.WeaponBehavior;

/**
 * 角色
 * 
 * @author DeepSleeping
 *
 */
public abstract class Character {

	WeaponBehavior wb;
	DanceBehavior db;

	public void setDb(DanceBehavior db) {
		this.db = db;
	}

	public void setWb(WeaponBehavior wb) {
		this.wb = wb;
	}

	/**
	 *战斗
	 */
	public void fight() {
		wb.useWeapon();
	}

	/**
	 * 跳舞
	 */
	public void dance() {
		db.dance();
	}
}
