package domain;

import jakarta.persistence.*;

@Entity
@Table(name = "TB_ACAO", uniqueConstraints = {
        @UniqueConstraint(name = "UK_NM_TP_ACAO", columnNames = "NM_TP_ACAO")
})
public class TipoDeAcao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_TP_ACAO")
    @SequenceGenerator(name = "SQ_TP_ACAO", sequenceName = "SQ_TP_ACAO")
    @Column(name = "ID_TP_ACAO")
    private long id;

    @Column(name = "NM_TP_ACAO")
    private String nome;

    public TipoDeAcao() {
    }

    public TipoDeAcao(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public TipoDeAcao setId(long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public TipoDeAcao setNome(String nome) {
        this.nome = nome;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TipoDeAcao{");
        sb.append("id=").append(id);
        sb.append(", nome='").append(nome).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
