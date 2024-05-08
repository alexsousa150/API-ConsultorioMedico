package medi.voll.API.medico;

import jakarta.validation.constraints.NotNull;
import medi.voll.API.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
                                     String telefone,
                                     String nome,
                                     DadosEndereco endereco) {
}
