package Zork;

public abstract class location {
	
	public abstract String move(Directions d);
	public abstract String look();
	public items[] Items;
	public creature[] Creatures;
	public String locName;
	public int x;
	public int y;
	public int z;
	
	
	
	/*                       y       z
	 *                       |     _-
	 *                       |   _-
	 * 	                     | _-
	 * -x --------___________|-
	 *                     _-|-----------_____________ x
	 *                   _-  |
	 * 	               _-    |
	 *               _-      |
	 *              -        |
	 *           -z         -y
	 */
}
