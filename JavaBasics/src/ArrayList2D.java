import java.util.ArrayList;

public class ArrayList2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(4);

        //initialisation --> because without initialization all items inside are NULL.
        for(int i=0; i<4;i++){
            list.add(new ArrayList<>());
        }

        for(int i=0; i<4;i++){
            for(int j =0; j<4;j++){
                list.get(i).add(j);
            }
        }

        for(int i=0; i<4;i++){
            for(int j =0; j<4;j++){
                System.out.println(list.get(i).get(j));;
            }
        }
    }
}
