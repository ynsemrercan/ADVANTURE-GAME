package adventureGame.locations;

import adventureGame.player.Player;

public class SafeHouse extends NormalLoc {

    public SafeHouse(Player player){
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean onLocation(){
        System.out.println("Güvenli evdesiniz, canınız yenilendi!!!");
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        return true;
    }
}
