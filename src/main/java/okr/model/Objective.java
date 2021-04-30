package okr.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Objective {
    private Integer id;
    private Integer parentId;
    private String description;
    private Double progress;
}
