import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var H = sc.nextInt();
        var W = sc.nextInt();
        var S = new String[H][W];
        var move = new int[]{-1, 1};

        // 二次元配列作成
        for(var i=0; i < H; i++) {
            S[i] = sc.next().split("");
        }
        var y = sc.nextInt();
        var x = sc.nextInt();

        for(var i=0; i < move.length; i++) {
            // y軸の範囲
            if(0<=y-move[i] && y+move[i]<H) {
                if(S[y-move[i]][x].equals("#")) {
                    S[y-move[i]][x] = ".";
                } else {
                    S[y-move[i]][x] = "#";
                }
            }
            // x軸の範囲
            if(0<=x-move[i] && x+move[i] < W) {
                if(S[y][x-move[i]].equals("#")) {
                    S[y][x-move[i]] = ".";
                } else {
                    S[y][x-move[i]] = "#";
                }
            }
        }

        if(S[y][x].equals("#")) {
            S[y][x] = ".";
        } else {
            S[y][x] = "#";
        }

        // 二次元配列出力
        for(var i=0; i < H; i++) {
            for(var j=0;j < W; j++) {
                System.out.print(S[i][j]);
            }
            System.out.println("");
        }
    }
}