import java.util.HashSet;

public class Solution {
    public int solution(int[] A) {

        HashSet<Integer> pairs = new HashSet<Integer>();
        int sol = -1;

        for (int i = 0; i < A.length; i++) {
            if (pairs.add(A[i])) {

            }
            else{
                pairs.remove(A[i]);
            }
        }


        return pairs.iterator().next();

    }

}
