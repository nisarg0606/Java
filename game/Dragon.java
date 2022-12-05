package game;

/*
 * Attributes

	nAttackRank
This is a measure of the dragon’s strength in Attack.  The Attack Rating can vary from 36 to 70 depending upon the size of the dragon.
	nDefenseRank
This is a measure of the Dragon’s strength in defense.  The defense ranking can vary from 10 to 35 depending upon the size of the Dragon. 
	nHitPoints
This is a measure of the Dragon’s constitution; a dragon is alive in battle so long as the Dragon has hit points remaining. Hit points can range from 51 to 100.
	nInitiative
This is used as part of the determination of which dragon goes first in a fight turn.  This value can range from 0 to 60.
	nSize
This is used to record the size of the Dragon.  An enumeration called DragonSize is used to indicate the size.
 

Methods

	Dragon(DragonSize nSize)
The constructor takes in the size of the Dragon You are creating.  This value comes from the DragonSize enumeration.  Dragons can be of Size Large, Medium, and Small.  The attributes listed above are set according to the specified size and indicated in the following table.  The constructor must set the attribute in the given range using Math.Random or java.util.Random to determine the exact value.
Size/Attribute	Small	Medium	Large
Hit Points 	51-70 	71-85	86-100 
Initiative	40-60 	20-40 	0 – 10 
Attack Ranking	36-50 	51-60	61-70
Defense Ranking	10-19 	20-29 	29-35 

	getInitiative()
This method returns the initiative value for the Dragon

	getNumAttacksPerTurn()
This returns the number of times a dragon cat attack for its own turn.  The formula is quite simple,
	small dragons can attack 3 times, 
	medium dragons can attack twice, and 
	large dragons can only attack once.

	getAttack()
The just is a getter for the returning the attack rating associated with the dragon

	getDefense()
This is just a getter for returning the defense rating associated with the dragon.

	isDead()
If the dragon hit points fall to 0 or lower, than the Dragon is dead.  This method would return true in that case (when the dragon is dead).

	resurrect()
This will resurrect the dragon by setting the hit points back to the original value.

	toString()
Implement an appropriate toString method that will show the appropriate information for the dragon. 

	defend(Dragon obOther)
This is an abstract method (must be implemented in the sub-classes). This method is used to represent another dragon attacking this dragon.  Essentially you will take the attack rating for the other dragon and subtract the defense ranking for the current dragon.  The difference will be the amount of hit points of damage the other dragon causes during the attack.  You will subtract this value from the current hit points for the dragon.

	doAttack(Dragon obOther)
This is an abstract method (must be implemented in the sub – classes). This method should be used in conjunction with the defend method.

Note that different Dragon types have different modifies applied to them depending upon the dragon that is attacking (see the descriptions for the sub-class dragon types). 
You must include as part of your calculation a modifier based upon Dragon size. 
	If the current Dragon is a small dragon, attacks will miss 30% of the time. 
	If the current dragon is a medium sized dragon, attacks will miss 20% of the time.
	If the current Dragon is a large dragon, an attack will always hit.

 */
public record Dragon() {

}
