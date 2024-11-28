package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.consulta.DadosAgendamentoDeConsulta;

public interface ValidadorAgendamentoDeConsultas {
    void validar(DadosAgendamentoDeConsulta dados);
}
