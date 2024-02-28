package dd.core;

public class rey extends personaje {
    public rey(String nombre) {
        super(nombre);
        setSalud(2000);
    }

    @Override
    public String[] ataca(personaje enemigo) {
        String[] valoresAtaque= new String [3];
        for (int i = 0; i < 3; i++) {
            valoresAtaque[i] = "-" + String.valueOf(getTipoAtaque().ataca(enemigo));
            if (valoresAtaque[i].equals("-0")) {
                valoresAtaque[i] = "falla";
            }
        }
        return valoresAtaque;
    }
}
