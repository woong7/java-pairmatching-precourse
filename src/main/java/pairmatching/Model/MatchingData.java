package pairmatching.Model;

import pairmatching.Controller.MatchingController;
import pairmatching.View.OutputView;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MatchingData {
    private Map<Mission, List<Pair>> matchingInfo;
    private OutputView outputView = new OutputView();

    public MatchingData() {
        matchingInfo = new LinkedHashMap<>();
    }

    public void put(Mission mission, List<Pair> pairs) {
        matchingInfo.put(mission, pairs);
    }

    public boolean contains(Mission mission){
        return matchingInfo.containsKey(mission);
    }
    public List<Pair> get(Mission mission){
        return matchingInfo.get(mission);
    }
    public void clearAll(){
        matchingInfo.clear();
    }
}
