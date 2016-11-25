import java.util.HashMap;
import java.util.Map;

/**
 * Created by tdrs on 1/10/16.
 */
public class RuleThirty implements Rule{

    @Override
    public String applyRule(String each) {
        Map<String, String> ruleThirtyAutomaton = new HashMap<>();
        ruleThirtyAutomaton.put("000", "0");
        ruleThirtyAutomaton.put("001", "1");
        ruleThirtyAutomaton.put("010", "1");
        ruleThirtyAutomaton.put("011", "1");
        ruleThirtyAutomaton.put("100", "1");
        ruleThirtyAutomaton.put("101", "0");
        ruleThirtyAutomaton.put("110", "0");
        ruleThirtyAutomaton.put("111", "0");
        return ruleThirtyAutomaton.get(each);
    }

}
