package adventureGame.locations;

import adventureGame.obstacle.Bear;
import adventureGame.player.Player;

public class River extends BattleLoc {
    public River(Player player) {
        super(player, "Nehir", new Bear(), "Water", 2);
    }
}
