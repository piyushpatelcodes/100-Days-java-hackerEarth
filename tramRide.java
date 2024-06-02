import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         int start = Integer.parseInt(br.readLine().trim());
         int finish = Integer.parseInt(br.readLine().trim());
         String[] arr_Ticket_cost = br.readLine().split(" ");
         int[] Ticket_cost = new int[N];
         for(int i_Ticket_cost = 0; i_Ticket_cost < arr_Ticket_cost.length; i_Ticket_cost++)
         {
         	Ticket_cost[i_Ticket_cost] = Integer.parseInt(arr_Ticket_cost[i_Ticket_cost]);
         }

         long out_ = solve(N, start, finish, Ticket_cost);
         System.out.println(out_);

         wr.close();
         br.close();
    }

  //MAIN Code SOLUTION
  
    static long solve(int N, int start, int finish, int[] Ticket_cost){
       // time = O(N),   space = O(1)
        long result = 0;
        int startindex = start-1;
        int finishindex = finish-1;
        if(startindex == finishindex){
            return 0;
        }

        long clockwiseCost = 0;
        int i = startindex;
        while (i != finishindex) {
            clockwiseCost += Ticket_cost[i];
            i = (i + 1) % N;
        }

        long antiClockwiseCost = 0;
        i = startindex;
        while (i != finishindex) {
            i = (i - 1 + N) % N;
            antiClockwiseCost += Ticket_cost[i];
        }


        return Math.min(clockwiseCost, antiClockwiseCost);
    
    }
}
