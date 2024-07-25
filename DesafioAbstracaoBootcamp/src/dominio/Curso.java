package dominio;

public class Curso {
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    public String getTitulo() {
        return titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "titulo:"+titulo+" Descricao:" + descricao +" Carga Horaria:"+cargaHoraria;
    }

}
