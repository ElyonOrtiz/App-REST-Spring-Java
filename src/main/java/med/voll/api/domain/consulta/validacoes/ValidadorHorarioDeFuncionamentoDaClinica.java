package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoDeConsulta;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;

@Component
public class ValidadorHorarioDeFuncionamentoDaClinica implements ValidadorAgendamentoDeConsultas {

    public void validar(DadosAgendamentoDeConsulta dados) {
        var dataConsulta = dados.data();
        var domingo = dataConsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        if (domingo) {
            throw new ValidacaoException("Consulta na semana de domingo não permitida");
        }
        var horaConsulta = dataConsulta.getHour();
        if (horaConsulta < 7 || horaConsulta > 18) {
            throw new ValidacaoException("Consulta fora do horário de funcionamento da clinica");
        }
    }
}