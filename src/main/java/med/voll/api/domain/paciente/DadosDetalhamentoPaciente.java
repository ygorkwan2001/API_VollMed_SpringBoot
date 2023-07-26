package med.voll.api.domain.paciente;

import med.voll.api.domain.endereco.Endereco;


public record DadosDetalhamentoPaciente(String nome, String telefone, String email,String cpf, Endereco endereco) {
    public  DadosDetalhamentoPaciente(Paciente paciente){
        this(paciente.getNome(),paciente.getTelefone(),paciente.getEmail(),paciente.getCpf(),paciente.getEndereco());
    }
}
