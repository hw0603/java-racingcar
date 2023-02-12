package racingcar.datatransfer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RoundResultResponse {
    private final List<CarDTO> roundResult = new ArrayList<>();

    public RoundResultResponse(Map<String, Integer> carsState) {
        for (Map.Entry<String, Integer> carState : carsState.entrySet()) {
            CarDTO carDTO = new CarDTO(carState.getKey(), carState.getValue());
            roundResult.add(carDTO);
        }
    }

    public List<CarDTO> getRoundResult() {
        return roundResult;
    }
}