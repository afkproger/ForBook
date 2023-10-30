import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeSort<Integer> sort = new TreeSort<>();
        System.out.println(sort.sort(List.of(1, 5, 1, 8, 9, 5, 3, 24, 6, 2, 5262, 62, 2, 734, 25, 126, 765, 78, 87, 3, 625, 242, 26, 373, 73, 452, 5262, 62)));
    }
}
