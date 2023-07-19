package Song_application;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Album a1=new Album("DSP PLAYLIST","DEVI SRI PRASAD");

        a1.AddsongtoAlbum("ringa ringa",4.00);
        a1.AddsongtoAlbum("who are you",3.00);
        a1.AddsongtoAlbum("seethakalam",2.50);
        a1.AddsongtoAlbum("super machhi",4.50);

        Album a2=new Album("MASS SONGS","SS.THAMAN");

        a2.AddsongtoAlbum("block buster",4.00);
        a2.AddsongtoAlbum("akanda",3.00);
        a2.AddsongtoAlbum("krack bgm",2.50);
        a2.AddsongtoAlbum("rudiram from arvinda sametha",4.50);

        ArrayList<Song> playList=new ArrayList<>();
        a1.AddSongByIndexInPlayList(2,playList);
        a1.AddSongByIndexInPlayList(4,playList);

        a2.AddSongByTitleInPlayList("krack bgm",playList);
        a2.AddSongByTitleInPlayList("block buster",playList);

        play(playList);
    }

    public static void play(ArrayList<Song>playList) {
        printmenu();
        System.out.println("Now playing");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        int currindex=0;
        System.out.println(playList.get(currindex).toString());
        boolean isOver=false;
        while(!isOver){
            switch(choice){
                case 1:
                    if(currindex==(playList.size()-1)){
                        System.out.println("you are at the last song");
                    }
                    else{
                        currindex++;
                        System.out.println(playList.get(currindex).toString());
                    }
                    break;
                case 2:
                    if(currindex==0){
                        System.out.println("your at the first song");
                    }
                    else{
                        currindex--;
                        System.out.println(playList.get(currindex).toString());
                    }
                    break;
                case 3:
                    System.out.println(playList.get(currindex).toString());
                    break;
                case 4:
                    printmenu();
                    break;
                case 5:
                    printallSongs(playList);
                    break;
                case 6:
                    break;
                case 7:
                    isOver=true;
                    break;
            }
            choice=sc.nextInt();
        }

    }
    public static void printallSongs(ArrayList<Song>playList){
         for(Song song:playList){
             System.out.println(song.toString());
         }
    }
    public static void printmenu(){
        System.out.println("Enter Your Choice");
        System.out.println("1. go to next song");
        System.out.println("2. go to previous song");
        System.out.println("3. repeat this song");
        System.out.println("4. print menu song");
        System.out.println("5. print the playList");
        System.out.println("6. delete the current song");
        System.out.println("7. close the playList");
    }
}
