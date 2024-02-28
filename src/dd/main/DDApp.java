package dd.main;

import dd.core.*;

import java.util.Random;

class DDApp {
    public static void main(String[] args) {
        System.out.println("Dungeons & Dragons");

        personaje[] humanos = new personaje[3];

        humanos[0] = new rey("Rey");
        humanos[1] = new caballero("Caballero1");
        humanos[2] = new caballero("Caballero2");

        humanos[0].setAtaque("AtaqueEspada");
        humanos[1].setAtaque("AtaqueArco");
        humanos[2].setAtaque("AtaqueCuchillo");

        Random rand = new Random();
        int cantidadTrolls = rand.nextInt(1,10);
        personaje[] trolls = new personaje[cantidadTrolls];
        for (int i = 0; i < cantidadTrolls; i++) {
            trolls[i] = new troll();
        }

        while (!controlBatalla.equipoSigueEnPie(trolls) && !controlBatalla.equipoSigueEnPie(humanos)) {
            controlBatalla.atacanHumanos(humanos, trolls);
            controlBatalla.atacanTrolls(trolls, humanos);
        }

    }
}