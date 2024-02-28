package dd.core;

import java.util.Random;

interface tipoAtaque {
    //Devuelve un int que indica el daño echo al enemigo ,si este falla devolvera 0 
    int ataca(personaje enemigo);
}

class ataqueEspada implements tipoAtaque {
    int ataque = 100;

    @Override
    public int ataca(personaje enemigo) {
        Random rand = new Random();
        if (rand.nextInt(2) == 1) {
            double dañoAtaque = ataque * rand.nextDouble(0, 1);
            int ataqueRedondeado = (int) Math.round(dañoAtaque);
            enemigo.setSalud(enemigo.getSalud() - ataqueRedondeado);
            return ataqueRedondeado;
        }
        return 0;
    }
}

class ataqueArco implements tipoAtaque {
    int ataque = 50;

    @Override
    public int ataca(personaje enemigo) {
        Random rand = new Random();
        if (rand.nextInt(2) == 1) {
            double dañoAtaque = ataque * rand.nextDouble(0, 1);
            int ataqueRedondeado = (int) Math.round(dañoAtaque);
            enemigo.setSalud(enemigo.getSalud() - ataqueRedondeado);
            return ataqueRedondeado;
        }

        return 0;
    }
}

class ataqueCuchillo implements tipoAtaque {
    int ataque = 25;

    @Override
    public int ataca(personaje enemigo) {
        Random rand = new Random();
        if (rand.nextInt(2) == 1) {
            double dañoAtaque = ataque * rand.nextDouble(0, 1);
            int ataqueRedondeado = (int) Math.round(dañoAtaque);
            enemigo.setSalud(enemigo.getSalud() - ataqueRedondeado);
            return ataqueRedondeado;
        }
        return 0;
    }
}
