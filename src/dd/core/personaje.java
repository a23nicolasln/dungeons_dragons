package dd.core;



public abstract class personaje {
    private String nombre;
    private tipoAtaque tipoAtaque;
    private int salud;

    public personaje(String nombre) {
        this.nombre = nombre;
    }

    public void setAtaque(String tipo) {
        switch (tipo) {
            case "AtaqueEspada":
                this.tipoAtaque = new ataqueEspada();
                break;
            case "AtaqueArco":
                this.tipoAtaque = new ataqueArco();
                break;
            case "AtaqueCuchillo":
                this.tipoAtaque = new ataqueCuchillo();
                break;
            default:
                break;
        }
    }

    public tipoAtaque getTipoAtaque() {
        return tipoAtaque;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getNombre() {
        return nombre;
    }

    //Devuelve un String[] con la longitud de las vezes que a atacado 
    //y en cada puesto el numero con la cantidad del ataque en String, si se a fallado el ataque devolvera "falla"
    public String[] ataca(personaje enemigo) {
        String[] valoresAtaque= new String [0];
        tipoAtaque.ataca(enemigo);
        return valoresAtaque;
    }

    public boolean suigueVivo(){
        if (salud <= 0) {
            return false;
        }
        return true;
    }
}





