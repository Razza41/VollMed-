package api.voll.med.api.medico;

import api.voll.med.api.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, int crm, Especialidade especialidade, DadosEndereco endereco) {
}
