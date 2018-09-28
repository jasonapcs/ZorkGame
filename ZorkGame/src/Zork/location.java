package Zork;

public abstract class location {
	
	public abstract String move(Directions d);
	public abstract String look();
	public items[] Items;
	public creature[] Creatures;
	public String locName;
	public long x;
	public long y;
	public long z;
	
	
	
	/*
	 *                       y       z
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
