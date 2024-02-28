
### Tras finalizarr el proyecto, responde de forma concisa (máximo 1 párrafo) y clara a las siguientes preguntas que te darán indicios de  tu grado de entendimiento del patrón Strategy

- ¿Cuáles son las estrategias?

    Tenemos tres diferentes estrategias : La espada, El arco y el cuchillo

- ¿Está el código de las diferentes ataques  mezclado?¿El código del ataque con espada es independiente del código del ataque con arco?  .Relaciona esto con algún principio SOLID.

    No, el codigo esta separado en diferentes clases, sino esto violaria el principio OCP el cual dice quw el código debera estar organizado de forma que sea posible agregar nuevas estrategias sin modificar el código existente.

- ¿Para que vale la interface Ataque?

    Para poner unas pautas que deven seguir todas las extensiones de esta

- ¿Qué clase o clases se encarga del papel de contexto?

    Las subclases de personaje, ya que estas almacenan la salud, la estrategia y el nombre

- ¿En que se parece y  en que se diferencia el  contexto de tu proyecto al contexto del Patrón teórico del boletín?

    El contexto del proyecto es similar al del patrón Boletín en que ambos almacenan información y la utilizan para tomar decisiones. Sin embargo, el contexto del proyecto también tiene la responsabilidad de seleccionar la estrategia adecuada, lo que no es parte del patrón Boletín.

- ¿Quién es el Cliente?

    El cliente seria la empresa que nos pidio este codigo

- ¿Como cambia el cliente de  estrategia?

    En main ,en la creacion de personajes tendra que insertar el tipo de ataque que quiere con un String

- ¿Para cambiar de estrategia, tiene que conocer el cliente detalles de implementación de la estrategia?

    Tiene que saber que existen  tres estrategias y que las eliges para cada personage con el string "AtaqueEspada", "AtaqueArco", "AtaqueCuchillo"

- ¿Si creamos un nuevo tipo de ataque para un nuevo cliente, por ejemplo App2,  es necesario modificar el cliente antiguo? Relaciona esto con algún principio SOLID.

    No,el principio OCP el cual dice que el código debera estar organizado de forma que sea posible agregar nuevas estrategias sin modificar el código existente.

