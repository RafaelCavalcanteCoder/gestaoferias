package gestao.ferias.com.pm.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Ferias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long policialId;  // Relacionamento com o Policial
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String tipoFeriado; // "Completo", "Quinzena", etc.

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getPolicialId() {
        return policialId;
    }
    public void setPolicialId(Long policialId) {
        this.policialId = policialId;
    }
    public LocalDate getDataInicio() {
        return dataInicio;
    }
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
    public LocalDate getDataFim() {
        return dataFim;
    }
    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }
    public String getTipoFeriado() {
        return tipoFeriado;
    }
    public void setTipoFeriado(String tipoFeriado) {
        this.tipoFeriado = tipoFeriado;
    }
    
    // Getters and Setters
}
