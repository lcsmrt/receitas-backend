package dev.lcs.receitas.dtos.responses;

public class DashboardResponse {
    private Long qtdReceitas;
    private Long qtdFavoritos;
    private Long qtdIngredientes;
    private Long qtdUsuarios;

    public DashboardResponse(Long qtdReceitas, Long qtdFavoritos, Long qtdIngredientes, Long qtdUsuarios) {
        this.qtdReceitas = qtdReceitas;
        this.qtdFavoritos = qtdFavoritos;
        this.qtdIngredientes = qtdIngredientes;
        this.qtdUsuarios = qtdUsuarios;
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
}
