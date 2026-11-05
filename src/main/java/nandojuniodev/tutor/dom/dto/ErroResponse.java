package nandojuniodev.tutor.dom.dto;

import java.time.LocalDateTime;

public record ErroResponse(Integer status, String mensagem, LocalDateTime momento) {
}
