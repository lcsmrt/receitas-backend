package dev.lcs.receitas.services;

import dev.lcs.receitas.dtos.responses.DashboardResponse;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class DashboardService {
    public DashboardResponse getDashboard() {
        long qtdReceitas = randomBetween(40, 120);
        long qtdFavoritos = randomBetween(qtdReceitas / 10, qtdReceitas);
        long qtdIngredientes = randomBetween(qtdReceitas * 3, qtdReceitas * 6);
        long qtdUsuarios = randomBetween(10, qtdReceitas / 2);

        return new DashboardResponse(qtdReceitas, qtdFavoritos, qtdIngredientes, qtdUsuarios);
    }

    private long randomBetween(long min, long max) {
        return ThreadLocalRandom.current().nextLong(min, max + 1);
    }
}
