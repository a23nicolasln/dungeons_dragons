package dd.core;
import java.util.Random;

public class troll extends personaje {
    private static int contador = 1;
    public troll() {
        super("troll" + contador);
        setSalud(1000);

        Random rand = new Random();
        String[] values = { "AtaqueEspada", "AtaqueArco", "AtaqueCuchillo" };
        int randomIndex = rand.nextInt(3);
        setAtaque(values[randomIndex]);
        contador++;
    }

    @Override
    public String[] ataca(personaje enemigo) {
        String[] valoresAtaque= new String [2];
        valoresAtaque[1] = "-" + String.valueOf(getTipoAtaque().ataca(enemigo));
        if (valoresAtaque[1].equals("-0")) {
            valoresAtaque[1] = "falla";
        }
        return valoresAtaque;
    }
}
