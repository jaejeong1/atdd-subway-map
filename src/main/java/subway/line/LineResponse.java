package subway.line;

import lombok.Getter;
import subway.station.Station;

import java.util.List;

@Getter
public class LineResponse {
    private Long id;
    private String name;
    private String color;

    public LineResponse(Long id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }
}
