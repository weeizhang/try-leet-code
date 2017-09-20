import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> previous = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        if (rowIndex == 0) {
            result.add(1);
            return result;
        }
        for (int i = 0; i <= rowIndex; i++) {
            result.clear();
            result.add(1);
            for (int j = 1; j < i; j++) {
                result.add(previous.get(j - 1) + previous.get(j));
            }
            result.add(1);
            previous = copy(result);
        }
        return result;
    }

    private List<Integer> copy(List<Integer> list) {
        List<Integer> copy = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            copy.add(list.get(i));
        }
        return copy;
    }
}
