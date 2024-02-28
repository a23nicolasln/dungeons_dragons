package dd.core;

public class caballero extends personaje {
    public caballero(String nombre) {
        super(nombre);
        setSalud(1500);
    }

    @Override
    public String[] ataca(personaje enemigo) {
        String[] valoresAtaque= new String [2];
        for (int i = 0; i < 2; i++) {
            valoresAtaque[i] = "-" + String.valueOf(getTipoAtaque().ataca(enemigo));
            if (valoresAtaque[i].equals("-0")) {
                valoresAtaque[i] = "falla";
            }
        }
        return valoresAtaque;
    }
}
