package adventureGame.locations;

import adventureGame.obstacle.Zombie;
import adventureGame.player.Player;

public class Cave extends BattleLoc {
    public Cave(Player player) {
        super(player, "Mağara", new Zombie(), "Food", 3);
    }
}
