package algo;
import java.util.*;

public class SunsetView {
    public ArrayList<Integer> sunsetViews(int[] buildings, String direction) {
        // Write your code here.
        ArrayList<Integer> output = new ArrayList<>();
        if(buildings.length == 0) return output;
        if(direction.equals("WEST")){
            int m = buildings[0];
            output.add(0);
            for(int i = 1;i<buildings.length;i++){
                if(buildings[i] > m){
                    m = buildings[i];
                    output.add(i);
                }
            }
        }
        if(direction.equals("EAST")){
            int m = buildings[buildings.length-1];
            output.add(buildings.length-1);
            for(int i = buildings.length-2; i >= 0; i--){
                if(buildings[i] > m){
                    m = buildings[i];
                    output.add(i);
                }
            }
        }
        Collections.sort(output);
        return output;
    }

    public static void main(String args[]) {
        t2();
    }

    private static void t1(){
        List<Integer> list = new SunsetView().sunsetViews(new int[]{3,5,4,4,3,1,3,2},"WEST");
        for(int i : list){
            System.out.print(i + "  ");
        }
    }

    private static void t2(){
        List<Integer> list = new SunsetView().sunsetViews(new int[]{3,5,4,4,3,1,3,2},"EAST");
        for(int i : list){
            System.out.print(i + "  ");
        }
    }
}
