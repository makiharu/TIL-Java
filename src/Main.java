import java.util.*;
//import java.util.Scanner;
public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        var H = sc.nextInt();
        var W = sc.nextInt();
        var arr = new String[H][W];

        for(var i=0; i < H; i ++) {
            arr[i] = sc.next().split("");
        }
        var y = sc.nextInt();
        var x = sc.nextInt();

        // y軸の変化
        for(var i=-1; i<2; i++) {
            if(arr[y+i][x].equals("#")) {
                arr[y+i][x]=".";
            } else {
                arr[y+i][x]="#";
            }
        }

        // x軸の変化
        for(var i=-1; i<2; i++) {
            if(arr[y][x+i].equals("#")) {
                arr[y][x+i]=".";
            } else {
                arr[y][x+i]="#";
            }
        }

        if(arr[y][x].equals("#")) {
            arr[y][x] = ".";
        } else {
            arr[y][x] = "#";
        }

        for(var i=0; i < H;i++) {
            for(var j=0; j < W; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}