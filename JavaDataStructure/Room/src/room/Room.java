
package room;

public abstract class Room {
int maxOccupants;
boolean locked;
   
public Room(int maxOccupants)
{
    this.maxOccupants = maxOccupants;
    }
abstract void lock(boolean lock);
abstract String isLocked();
abstract int doorCount();
}

