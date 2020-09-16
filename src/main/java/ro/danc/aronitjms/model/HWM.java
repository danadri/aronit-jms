package ro.danc.aronitjms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HWM implements Serializable {

    static final long serialVersionUID = -8939215142713559073L;
    private UUID id;
    private String message;
}
