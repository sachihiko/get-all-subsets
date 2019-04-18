import java.util.HashSet;
public class Subsets {


    public static HashSet<HashSet<Integer>> getSubsets(HashSet<Integer> set){
        HashSet<HashSet<Integer>>  sets = new HashSet<>();
        getSubsets(set, sets);
        return sets;
    }

    public static void getSubsets(HashSet<Integer> set,
                                  HashSet<HashSet<Integer>> sets){
        if (!sets.contains(set))
            sets.add(set);
        else
            return;

        HashSet<Integer> temp;
        for (Integer i : set ){
            temp = new HashSet<>(set);
            temp.remove(i);
            getSubsets(temp, sets);
        }
    }



    public static void print(HashSet<HashSet<Integer>> sets){

        for (HashSet<Integer> i : sets){
            System.out.print("{ ");
            for (Integer j : i ){
                System.out.print(j + " " );
            }
            System.out.println("}");


        }


    }
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();


        for (int i = 1 ; i < 4; i ++ )
            set.add(i);


        HashSet<HashSet<Integer>> sets = getSubsets(set);

        print(sets);

    }

}
