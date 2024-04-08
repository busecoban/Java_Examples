import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class thy_1 {

    public static List<Integer> recoverDeadPods(int n, List<List<Integer>> connections, List<List<Integer>> queries) {
        List<Boolean> podStatus = new ArrayList<>(Collections.nCopies(n, false));

 
        for (List<Integer> connection : connections) {
            int pod1 = connection.get(0);
            int pod2 = connection.get(1);
            podStatus.set(pod1 - 1, true);
            podStatus.set(pod2 - 1, true);
        }

        List<Integer> deadPods = new ArrayList<>();
        for (List<Integer> query : queries) {
            int pod = query.get(0);
            if (!podStatus.get(pod - 1)) { // Check if pod is dead
                deadPods.add(pod);
            }
        }

        return deadPods;
    }
}