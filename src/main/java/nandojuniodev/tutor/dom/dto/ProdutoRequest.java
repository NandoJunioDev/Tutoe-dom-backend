package nandojuniodev.tutor.dom.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;

public record ProdutoRequest(String codigoDeBarras,

                            @NotBlank String nome,

                            @NotNull @Positive BigDecimal precoAtual,
                            @NotBlank @NotNull String grupo,
                             String marcaDoProduto,
                             String fotoUrl

) {
}
