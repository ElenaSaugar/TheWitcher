package Thewicher;

/**
 * Clase que representa un brujo con 3 atributos, name,health y hasSoul.
 * Esta clase se usara para un videojuego RPG.
 * 
 * @author Elena
 * 
 * @version 1.0
 *
 */

public class TheWitcher {
/**
 * especificamos que es el atributo
 * atributo name que es nombre del brujo
 */
	private String name;
	//vida de brujo
	private int health;
	//si el brujo tiene o no alma
	private boolean hasSoul;
	
	/**
	 * Getter para obtener el nombre del brujo
	 * @return devuelve el nombre del brujo
	 */
	public String getName() {
		return name;
	}

	/**
	 * setter para introducir el nombre del brujo
	 * @param name nombre del brujo
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * getter para obtener la cantidad de vida del brujo
	 * @return devuelve el numero de vidas que le quedan al brujo
	 */
	public int getHealth() {
		return health;
	}

	/**
	 * setter para establecer la vida del brujo
	 * @param health cantidad de vida del brujo
	 */
	
	public void setHealth(int health) {
		this.health = health;
	}

	/**
	 * funcion para saber si el brujo tiene alma
	 * @return devuelve si el brujo tiene alma o no
	 */
	public boolean isHasSoul() {
		return hasSoul;
	}

	/**
	 * setter para establecer el alma del brujo.
	 * @param hasSoul valor bolleano, si el brujo tiene o no alma.
	 */
	public void setHasSoul(boolean hasSoul) {
		this.hasSoul = hasSoul;
	}

	
	/**
	 * Nos dice si el brujo esta o no muerto:
	 * <ul>
	 * <li>si no tiene vida </li>
	 * <li>si tiene vida pero no tiene alma </li>
	 * </ul>
	 * @return si esta o no muerto.
	 */
	public boolean isDeath() {
		if (health==0) {
			return true;
		} else if (!hasSoul) {
			return true;
			
		}else {
			return false;
		}
	}
	
}
