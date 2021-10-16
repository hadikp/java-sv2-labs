package classstructureattributes;

import java.util.Scanner;

public class MusicMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Song song = new Song();
        System.out.println("Write your favorite band!");
        song.band = scanner.nextLine();
        System.out.println("Write your favorite title of music!");
        song.title = scanner.nextLine();
        System.out.println("Write your length of music!");
        song.length = scanner.nextLine();
        System.out.print(song.band + " - ");
        System.out.print(song.title + " ");
        System.out.print("(" + song.length + ")");
    }
}
