/**
 * Created by tdrs on 1/10/16.
 */
public class Neighborhood {
    private String[] vector;
    public String[] evolve(String initialState, Rule rule, int steps) {

        vector = new String[steps + 1];
        vector[0] = initialState;

        String workingStateString = "0" + initialState + "0";

        for(int j = 1; j < vector.length; j++){
            String nextState = "";
            for (int i = 1; i < workingStateString.length() - 1; i++) {
                String each = workingStateString.charAt(i - 1) + "" + workingStateString.charAt(i) + "" + workingStateString.charAt(i + 1) + "";
                nextState += rule.applyRule(each);

            }
            vector[j] = nextState;

            workingStateString = "0" + nextState + "0";
        }

        return vector;
    }
    @Override
    public String toString(){
        String result = "";
        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length(); j++) {
                result += vector[i].charAt(j) == '1' ? "X" : " ";
            }
            result += "\n";
        }
        return result;
    }

}
