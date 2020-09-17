package com.ejemplo.dominio;

/**
 *
 * @author Nacho
 */
public class Biblioteca {

    //Atributos:
    private Publicacion estanteria[];/* arreglo o vector declarado como atributo, como
                               variable, de la clase Biblioteca. Acá, entonces,
                               tenemos una relación de asociación, xq Biblioteca
                               tiene como atributo un arreglo de objetos de otra clase,
                               en este caso, la clase Libro.*/
    private int ultimo; //para buscar la posición en el arreglo del ultimo libro agregado

    //Constructor: por defecto:
    public Biblioteca() {
        estanteria = new Publicacion[20];
        ultimo = 0;
    }

    //Constructor: por parámetros
    public Biblioteca(int cant) {
        estanteria = new Publicacion[cant];
        /*esto es un arreglo de referencias, a "cant" libros
        NO es aún un arreglo de objetos.
         */
    }

    //getter: el setter no estaría piola que esté
    public Publicacion[] getEstanteria() {
        /*Se devuelve un arreglo, un vector, de la clase Libro;
                                     El return no devuelve cosas por pantalla, devuelve un valor,
                                     del tipo que se le haya especificado. En este caso,
                                     va a devolver el valor estanteria, que es un arreglo.
         */
        return estanteria;
    }

    public boolean agregarPublicacion(Publicacion publicacion) {
        boolean aux = false;
//        for (int i = 0; i < estanteria.length; i++) {
//            if (estanteria[i] == null) {
//                estanteria[i] = unLibro;
//                aux = true; //avisar que se pudo agregar el libro a la estantería
//                break;
//                /*si no se corta el ciclo for, el objeto unLibro se va a 
//                        guardar en todos los espacios que tengan valor null
//                 */
//            }
//        }
        //Método alternativo, usando el atributo como contador
        if (ultimo < estanteria.length) { //si no está llena la estantería:
            estanteria[ultimo] = publicacion;
            /*se accesa directamente al arreglo, es un "acceso directo"
                                                vamos derecho a la posición, usando el valor ultimoLibro
                                                Usar un ciclo for, es un "acceso secuencial"*/
            aux = true;
            ultimo++; //se actualiza la posición para el proximo ingreso
        }
        return aux; //permite informar si efectivamente se pudo agregar el libro

    }

    public String mostrarListado() {
        String aux = "Estantería:\n[";
        for (int i = 0; i < estanteria.length; i++) {
            if (estanteria[i] != null) {
                aux = aux + estanteria[i].getTitulo() + "\t|"; //se agrega al aux el titulo de cada
                //libro. Va a haber un libro en cada espacio del vector que no sea null
            } else {
                aux = aux + "Lugar vacío\t|";
            }
        }
        aux = aux + "]";

        return aux;
    }

    public String buscarPublicacion(String unTitulo) {
        String aux = "Publicación no se encuentra en la biblioteca";
        for (int i = 0; i < estanteria.length; i++) {
            if (estanteria[i] != null) {
                if (estanteria[i].getTitulo().equals(unTitulo)) {/*Para comparar cadenas no se usa ==
                                                                sino el método .equals()*/
                    aux = estanteria[i].toString();
                    break;
                }
            }

        }
        return aux;
    }

    public int contarLibros(int nPaginas) {
        int aux = 0;
        for (int i = 0; i < estanteria.length; i++) {
            if (estanteria[i] != null) {
                if (estanteria[i] instanceof Libro && estanteria[i].getPaginas() >= nPaginas) {
                    // instanceof se usa para saber a que objeto apunta una referencia
                    aux++;
                }
            }
        }
        return aux;
    }
}
