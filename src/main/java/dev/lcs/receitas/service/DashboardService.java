package dev.lcs.receitas.service;

import dev.lcs.receitas.dto.responses.DashboardResponse;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class DashboardService {
    public DashboardResponse getDashboard() {
        long qtdReceitas = randomBetween(40, 120);
        long qtdFavoritos = randomBetween(qtdReceitas / 10, qtdReceitas);
        long qtdIngredientes = randomBetween(qtdReceitas * 3, qtdReceitas * 6);
        long qtdUsuarios = randomBetween(10, qtdReceitas / 2);
        String ultimaAtualizacao = "16/12/2025 às 22:38";

        return new DashboardResponse(qtdReceitas, qtdFavoritos, qtdIngredientes, qtdUsuarios, ultimaAtualizacao);
    }

    private long randomBetween(long min, long max) {
        return ThreadLocalRandom.current().nextLong(min, max + 1);
    }
}
