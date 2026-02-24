package api.voll.med.api.paciente;

import api.voll.med.api.endereco.DadosEndereco;

public record DadosCadastroPaciente(
        String nome,
        String email,
        String telefone,
        String cpf,
        DadosEndereco endereco) {
}
