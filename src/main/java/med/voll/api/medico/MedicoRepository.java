package med.voll.api.medico;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

    List<Medico> findByEspecialidade(String especialidade);

    List<Medico> findByNome(String nome);

    Page<Medico> findAllByAtivoTrue(Pageable paginacao);
}
