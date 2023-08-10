package adventureGame.locations;

import adventureGame.obstacle.Snake;
import adventureGame.player.Player;

public class Mine extends BattleLoc {
    public Mine(Player player){
        super(player, "Maden", new Snake(), "Madenden ne düşerse.", 5);
    }
}
