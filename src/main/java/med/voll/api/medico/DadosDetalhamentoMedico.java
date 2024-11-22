package med.voll.api.medico;

public record DadosDetalhamentoMedico(Long id, String nome, String email, String telefone, Especialidade especialidade, String crm) {
    public DadosDetalhamentoMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getTelefone(), medico.getEspecialidade(), medico.getCrm());
    }
}
