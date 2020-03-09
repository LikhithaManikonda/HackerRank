//Problem: https://www.hackerrank.com/challenges/halloween-sale/problem
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class Dollar {
    public static void main(String[] args) throws IOException{
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
     String[] values = new String[3];
     values = bufferedReader.readLine().split(" ");
     int i=0;
     int firstGameCost = Integer.parseInt(values[0]);
     int walletMoney = Integer.parseInt(values[1]);
     int differenceBetweenGames  = Integer.parseInt(values[2]);
     Integer finalCostOfGame = Integer.parseInt(values[3]);
     int totalOfArray = 0,countOfProductsBought=0;
     List<Integer> gamesList = new ArrayList<Integer>();
     gamesList.add(firstGameCost);
     int remainingWalletPrice = walletMoney - firstGameCost;
    do {
       gamesList.add(gamesList.get(i)-differenceBetweenGames);
       totalOfArray+= gamesList.get(++i);
    }while(gamesList.get(i)-differenceBetweenGames>=finalCostOfGame);//games[i]-differenceBetweenGames>=finalCostOfGame);
    remainingWalletPrice = remainingWalletPrice - totalOfArray;
    while(remainingWalletPrice>=finalCostOfGame) {
        gamesList.add(finalCostOfGame);
        remainingWalletPrice = remainingWalletPrice - finalCostOfGame;
    }
    for(Integer gl:gamesList) {
       System.out.println(gl);
       countOfProductsBought++;
    }
    System.out.println("countOfProducts Bought"+countOfProductsBought);
    }
}