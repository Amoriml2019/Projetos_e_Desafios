package com.amorim.agendamento_horarios.infrastructute.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "agendamento")

public class Agendamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String servico;
    private LocalDateTime dataHoraAgendamento;
    private String cliente;
    private String profissional;
    private String telefoneCliente;
    private LocalDateTime dataInsercao = LocalDateTime.now();

    public LocalDateTime getDataHoraAgendamento() {
        return null;
    }
}