import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TreeSort <T extends Comparable<T>>  {

    public List<T> sort (List<T> inputList) {
        Tree<T> tree = new Tree<>();
        tree = tree.toCreateTreeFromList(inputList);
        return tree.inorder();
    }

    //TODO:Метод для построения графика где f(x) = кол-во отсортированных элементов ,а x = время затраченное на сортировку*/
}
