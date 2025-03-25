
package gestao.ferias.com.pm.model;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Policial {
    
    @ Id
    private Long id;
    private String nome;
    private String graduacao;
    private String dataUltimaPromocao;
    private int classificacaoConcurso;
    private String dataIngresso;

    // Getters e Settersmvn clean installmvn clean install
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

    public String getDataUltimaPromocao() {
        return dataUltimaPromocao;
    }

    public void setDataUltimaPromocao(String dataUltimaPromocao) {
        this.dataUltimaPromocao = dataUltimaPromocao;
    }

    public int getClassificacaoConcurso() {
        return classificacaoConcurso;
    }

    public void setClassificacaoConcurso(int classificacaoConcurso) {
        this.classificacaoConcurso = classificacaoConcurso;
    }

    public String getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(String dataIngresso) {
        this.dataIngresso = dataIngresso;
    }
}

