package gestao.ferias.com.pm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Policial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String graduacao;
    private LocalDate dataUltimaPromocao;
    private int classificacaoConcurso;
    private LocalDate dataIngressoPM;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGraduacao() {
        return graduacao;
    }
    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }
    public LocalDate getDataUltimaPromocao() {
        return dataUltimaPromocao;
    }
    public void setDataUltimaPromocao(LocalDate dataUltimaPromocao) {
        this.dataUltimaPromocao = dataUltimaPromocao;
    }
    public int getClassificacaoConcurso() {
        return classificacaoConcurso;
    }
    public void setClassificacaoConcurso(int classificacaoConcurso) {
        this.classificacaoConcurso = classificacaoConcurso;
    }
    public LocalDate getDataIngressoPM() {
        return dataIngressoPM;
    }
    public void setDataIngressoPM(LocalDate dataIngressoPM) {
        this.dataIngressoPM = dataIngressoPM;
    }

    // Getters and Setters
}
