package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoDeConsulta;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.LocalDateTime;

@Component
public class ValidadorHorarioAntecedencia implements ValidadorAgendamentoDeConsultas {
    public void validar(DadosAgendamentoDeConsulta dados) {
        var horaConsulta = dados.data();
        var agora = LocalDateTime.now();
        var diferecaEmMinutos = Duration.between(agora, horaConsulta).toMinutes();
        if (diferecaEmMinutos < 30) {
            throw new ValidacaoException("Consulta deve ser agendada com pelo menos 30 minutos de antecedência");
        }
    }
}
