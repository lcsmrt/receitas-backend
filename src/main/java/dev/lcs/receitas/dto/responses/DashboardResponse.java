package dev.lcs.receitas.dto.responses;

public class DashboardResponse {
    private Long qtdReceitas;
    private Long qtdFavoritos;
    private Long qtdIngredientes;
    private Long qtdUsuarios;
    private String ultimaAtualizacao;

    public DashboardResponse(Long qtdReceitas, Long qtdFavoritos, Long qtdIngredientes, Long qtdUsuarios, String ultimaAtualizacao) {
        this.qtdReceitas = qtdReceitas;
        this.qtdFavoritos = qtdFavoritos;
        this.qtdIngredientes = qtdIngredientes;
        this.qtdUsuarios = qtdUsuarios;
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public Long getQtdReceitas() {
        return qtdReceitas;
    }

    public Long getQtdFavoritos() {
        return  qtdFavoritos;
    }

    public Long getQtdIngredientes() {
        return qtdIngredientes;
    }

    public Long getQtdUsuarios() {
        return qtdUsuarios;
    }

    public String getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }
}
