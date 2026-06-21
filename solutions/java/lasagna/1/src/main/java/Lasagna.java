public class Lasagna {
    // Tiempo esperado en el horno
    public int expectedMinutesInOven() {
        return 40;
    }

    // Tiempo restante en el horno
    public int remainingMinutesInOven(int actualMinutesInOven) {
        return expectedMinutesInOven() - actualMinutesInOven;
    }

    // Tiempo de preparación por capa
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    // Tiempo total (preparación + cocción)
    public int totalTimeInMinutes(int layers, int actualMinutesInOven) {
        return preparationTimeInMinutes(layers) + actualMinutesInOven;
    }
}

