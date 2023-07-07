import java.util.*;

public class Main {
    public static void main(String... args) {
        // 【マップの扱い 3】マップの判定・縦横斜め
        var sc = new Scanner(System.in);

        var H = sc.nextInt();
        var W = sc.nextInt();
        var S = new String[H][W];

        for (var i = 0; i < H; i++) {
            S[i] = sc.next().split("");
        }

        var y = sc.nextInt();
        var x = sc.nextInt();

        // たて
        for(var i=0; i < H; i++) {
            if(S[y+i][x].equals("#")) {
                S[y+i][x] = ".";
            } else {
                S[y+i][x] = "#";
            }
        }
        // よこ
        for(var i=0; i < W; i++) {
            if(S[y][x+i].equals("#")) {
                S[y][x+i] = ".";
            } else {
                S[y][x+i] = "#";
            }
        }

        // 斜め
        for(var i=1; i< Math.min(H,W); i++) {
            if(y+i < H) {
                if(x+i < W) {
                    if(S[y+i][x+i].equals("#")) {
                        S[y+i][x+i] = ".";
                    } else {
                        S[y+i][x+i] = "#";
                    }
                }

                if(0<= x-i) {
                    if(S[y+i][x-i].equals("#")) {
                        S[y+i][x-i] = ".";
                    } else {
                        S[y+i][x-i] = "#";
                    }
                }
            }

            if(0<=y-i) {
                if(x+i < W) {
                    if(S[y+i][x+i].equals("#")) {
                        S[y+i][x+i] = ".";
                    } else {
                        S[y+i][x+i] = "#";
                    }
                }
                if(0<= x-i) {
                    if(S[y+i][x-i].equals("#")) {
                        S[y+i][x-i] = ".";
                    } else {
                        S[y+i][x-i] = "#";
                    }
                }
            }
        }


        if (S[y][x].equals(".")) {
            S[y][x] = "#";
        } else {
            S[y][x] = ".";
        }

        for (var i = 0; i < H; i++) {
            for (var j = 0; j < W; j++) {
                System.out.print(S[i][j]);
            }
            System.out.println();
        }
    }
}
