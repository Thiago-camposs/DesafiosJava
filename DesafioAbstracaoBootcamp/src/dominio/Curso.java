package dominio;

public class Curso extends Conteudo {

    @Override
    public double calcularXp() {
        return XP_PADRAO*cargaHoraria;
    }

    private int cargaHoraria;
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "titulo:"+getTitulo()+" Descricao:" + getDescricao() +" Carga Horaria:"+cargaHoraria;
    }

}
