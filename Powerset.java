import java.util.ArrayList;
import java.util.List;

public class Powerset {
    static  List<List<Integer>> powerset(List<Integer> list){
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
    for (Integer element : list) {
        List<List<Integer>> subSets = new ArrayList<>();
        for (List<Integer> subSet : result) {
            List<Integer> newSubset = new ArrayList<>(subSet);
            newSubset.add(element);
            subSets.add(newSubset);
        }
        result.addAll(subSets);
        }
    return result;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4);
        System.out.println(powerset(list));

    }
}
