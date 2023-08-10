package adventureGame.locations;

import adventureGame.obstacle.Vampire;
import adventureGame.player.Player;

public class Forest extends BattleLoc {
    public Forest(Player player) {
        super(player, "Orman", new Vampire(), "Firewood", 3);
    }
}
