import java.util.HashMap;

public class Main {

    public static boolean Find(int target, int[][] array) {
        for(int i=0;i<array.length;i++){
            for(int j =0;j<array.length;j++){
                if(array[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[][] array = new int[0][];
        System.out.println( Find(16,array));
        HashMap map=new HashMap();
        map.put("","1111");
        System.out.println(map.get(""));

    }


}
