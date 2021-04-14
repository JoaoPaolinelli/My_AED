import java.util.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

class Solution{
    public static void main(String []argh){
        Map<String, Integer> mapaCel = new HashMap<>();
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            mapaCel.put(name, phone);
        }

        while(in.hasNext()){
            String s = in.next();
            if(mapaCel.containsKey(s)){
                System.out.println(s + "=" + mapaCel.get(s));
            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}