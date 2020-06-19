package xws.tim16.rentacar.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ModelDTO {
    private Long id;
    private String name;
    private MarkDTO mark;
}
