import java.util.*;
public class Main {
    public static void main(String... args) {
        //code22-1
        Scanner sc = new Scanner(System.in);

        var H = sc.nextInt();
        var W = sc.nextInt();
        var S = new String[H][W];

        for(var i=0; i < H; i++) {
            S[i] = sc.next().split("");
        }

        var y = sc.nextInt();
        var x = sc.nextInt();

        if(S[y][x].equals(".")) {
            S[y][x] = "#";
        } else{
            S[y][x] = ".";
        }

        for(var i=0; i < H; i++) {
            for(var j=0; j < W; j++) {
                System.out.print(S[i][j]);
            }
            System.out.println();
        }


    }
}