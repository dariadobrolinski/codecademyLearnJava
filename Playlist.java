import java.util.ArrayList;
import java.util.Arrays;

class Playlist {
  public static void main(String[] args) {
    String[] favoriteSongs = {"Holanda - JHAYCO", "Despues de la Playa - Bad Bunny", 
    "Motion Sickness - Pheobe Bridgers", "Manchild - Sabrina Carpenter", 
    "no quiero pelear - Young Miko", "2:12 AM - Rauw Alejandro", 
    "so american - Olivia Rodrigo", "Ojitos Lindos - Bad Bunny", 
    "Say My Name - Prince of Eden", "Right Side of My Neck - Faye Webster"}; 
    
    ArrayList<String> desertIslandPlaylist = new ArrayList<>();

    desertIslandPlaylist.add(favoriteSongs[0]);
    desertIslandPlaylist.add(favoriteSongs[1]);
    desertIslandPlaylist.add(favoriteSongs[4]);
    desertIslandPlaylist.add(favoriteSongs[6]);

    desertIslandPlaylist.addAll(Arrays.asList(favoriteSongs));


    desertIslandPlaylist.remove("Motion Sickness - Pheobe Bridgers");
    desertIslandPlaylist.remove("Say My Name - Prince of Eden");
    desertIslandPlaylist.remove("no quiero pelear - Young Miko");
    desertIslandPlaylist.remove("Right Side of My Neck - Faye Webster");
    desertIslandPlaylist.remove("Manchild - Sabrina Carpenter");

    String tempA = "Otro Atradecer - Bad Bunny";
    desertIslandPlaylist.set(2, tempA);

    System.out.println(desertIslandPlaylist);
  }
}
