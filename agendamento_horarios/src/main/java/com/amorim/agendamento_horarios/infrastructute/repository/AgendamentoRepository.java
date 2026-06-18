package com.amorim.agendamento_horarios.infrastructute.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.amorim.agendamento_horarios.infrastructute.entity.Agendamento;

import java.time.LocalDateTime;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {

    Agendamento findByServicoAndDataHoraAgendamentoBetween(String servico, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFinal);


    @Transactional
    void deleteByDataHoraAgendamentoAndCliente(LocalDateTime dataHoraAgendamento, String cliente);

    Agendamento findByDataHoraAgendamentoAndCliente(LocalDateTime dataHoraAgendamento, LocalDateTime dataHoraFinal);
    Agendamento findByDataHoraAgendamentoAndCliente(LocalDateTime dataHoraAgendamento, String cliente);
}

