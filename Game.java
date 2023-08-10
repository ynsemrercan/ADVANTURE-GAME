package adventureGame;

import adventureGame.locations.*;
import adventureGame.player.Player;

import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start(){
        System.out.println("Macera Oyununa Hoşgeldiniz!!!");
        System.out.print("Kareketer ismini giriniz: ");
        String playerName;
        playerName = input.nextLine();
        Player p1 = new Player(playerName);
        System.out.println("Sayın " + p1.getName() + " maceraya başlamaya hazır mısın?");
        System.out.println("Karakterler: ");
        System.out.println("=======================================================================================");
        p1.selectChar();

        Location location = null;
        while(true){
            p1.printInfo();
            System.out.println();
            System.out.println("################Bölgeler################");
            System.out.println();
            System.out.println("1- Güvenli Ev ---> Burası güvenli hiç düşman yok.");
            System.out.println("2- Eşya Dükkanı -> Silah veya zırh satın alabilirsiniz!");
            System.out.println("3- Mağara -------> Ödül <Food>, dikkatli ol burada karşına et yiyen zombiler çıkabilir!!!");
            System.out.println("4- Orman --------> Ödül <Firewood>, dikkatli ol burada karşına kan emici vampirler çıkabilir!!!");
            System.out.println("5- Nehir --------> Ödül <Water>, dikkatli ol burada karşına vahşi ayılar çıkabilir!!!");
            System.out.println("6- Maden --------> Ödül <İtem, Para veya Hiç birşey bunu bilerek madene gir>, dikkatli ol burada karşına zehirli yılanlar çıkabilir!!!");
            System.out.println("0- Çıkış Yap  ---> Oyunu sonlandır.");


            System.out.print("Lütfen gitmek istediğiniz bölgeyi seçiniz: ");
            int selectLoc;
            selectLoc = input.nextInt();
            switch(selectLoc){
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouse(p1);
                    break;
                case 2:
                    location = new ToolStore(p1);
                    break;
                case 3:
                    location = new Cave(p1);
                    break;
                case 4:
                    location = new Forest(p1);
                    break;
                case 5:
                    location = new River(p1);
                    break;
                case 6:
                    location = new Mine(p1);
                    break;
                default:
                    location = new SafeHouse(p1);
            }

            if(location == null){
                System.out.println("Oyun bitti tekrar oynaman dileğiyle <3");
                break;
            }
            if(!location.onLocation()){
                System.out.println("Oyun Bitti!!!");
                System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
                break;
            }
        }
    }


    public void checkLocation(){
        Location location = null;

    }
}
