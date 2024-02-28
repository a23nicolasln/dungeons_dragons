package dd.main;

import java.util.Random;

import dd.core.personaje;

public class controlBatalla {

    //Comprueba si el equipo sigue en pie y devuelve un booleano en consecuencia
    public static boolean equipoSigueEnPie(personaje[] equipo) {

        for (int i = 0; i < equipo.length; i++) {
            if (equipo[i] != null) {
                return false;
            }
        }
        return true;
    }

    //Inicializa el ataque de los humanos hacia los trolls
    public static void atacanHumanos(personaje[] humanos, personaje[] trolls) {
        Random rand = new Random();

        for (int c = 0; c < humanos.length; c++) {

            if (humanos[c] == null) {
                break;
            }

            int troll = rand.nextInt(trolls.length);
            while (trolls[troll] == null) {
                troll = rand.nextInt(trolls.length);
            }

            String[] dañoAtaques = humanos[c].ataca(trolls[troll]);
            for (int i = 0; i < dañoAtaques.length; i++) {
                System.out.println(humanos[c].getNombre().toString() + " ataca a "
                        + trolls[troll].getNombre().toString() + " (" + dañoAtaques[i] + ")");
            }

            if (!trolls[troll].suigueVivo()) {
                System.out.println();
                System.out.println("[El " + trolls[troll].getNombre().toString() + " a fallecido, salud = " + trolls[troll].getSalud()+"]");
                trolls[troll] = null;
            }
            System.out.println();

            if (equipoSigueEnPie(trolls)) {
                System.out.println("Enhorabuena habeis ganado");
                if (humanos[0] != null) {
                    System.out.println(humanos[0].getNombre().toString() + ": [" + humanos[0].getSalud() + "]");
                } else {
                    System.out.println("rey: [muerto]");
                }
                if (humanos[1] != null) {
                    System.out.println(humanos[1].getNombre().toString() + ": [" + humanos[1].getSalud() + "]");
                } else {
                    System.out.println("caballero1: [muerto]");
                }
                if (humanos[2] != null) {
                    System.out.println(humanos[2].getNombre().toString() + ": [" + humanos[2].getSalud() + "]");
                } else {
                    System.out.println("caballero2: [muerto]");
                }
                System.exit(0);
            }
        }
    }

    //Inicializa el ataque de los trolls hacia los humanos
    public static void atacanTrolls(personaje[] trolls, personaje[] humanos) {
        Random rand = new Random();

        for (int c = 0; c < trolls.length; c++) {
            int humano = rand.nextInt(humanos.length);
            while (humanos[humano] == null) {
                humano = rand.nextInt(humanos.length);
            }

            if (trolls[c] == null) {
                break;
            }

            String[] dañoAtaques = trolls[c].ataca(humanos[humano]);
            System.out.println(trolls[c].getNombre().toString() + " ataca a " + humanos[humano].getNombre().toString()
                    + " (" + dañoAtaques[1] + ")");

            if (!humanos[humano].suigueVivo()) {
                System.out.println();
                System.out.println("[El " + humanos[humano].getNombre().toString() + " a fallecido, salud = " + humanos[humano].getSalud()+"]");
                humanos[humano] = null;
            }
            System.out.println();

            if (equipoSigueEnPie(humanos)) {
                System.out.println("Lo siento habeis perdido");
                for (int i = 0; i < trolls.length; i++) {
                    if (trolls[i] != null) {
                        System.out.println(trolls[i].getNombre().toString() + ": [" + trolls[i].getSalud() + "]");
                    }else{System.out.println("Troll"+ (i+1) + ": [muerto]");}
                }
                System.exit(0);
            }
        }
    }
}
