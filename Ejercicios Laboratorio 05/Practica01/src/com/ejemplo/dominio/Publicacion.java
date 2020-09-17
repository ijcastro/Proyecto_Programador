package com.ejemplo.dominio;

/**
 *
 * @author Nacho
 */
public class Publicacion {
    //Atributos:
    private String titulo;
    private int paginas;
    
    //Constructor: por defecto
    public Publicacion(){
        paginas = 1;
        titulo = "Sin definir";
    }
    
    //Constructor: por parámetros
    public Publicacion(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = validarPaginas(paginas);
    }
    
    //Getters y Setters:    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    //Metodos propios:
    //Método para validar el ingreso del valor de atributo numPaginas.
    //se le da acceso private xq no se quiere que se lo modifique desde otras clases
    //y se lo usa para no repetir codigo. Si no se hiciera esto, tanto en el constructor como
    //en la declaración de setNumPaginas debería ponerse un validador; en cambio, haciendo esto, se aplica
    //el método en ambos casos y listo, solo trabaja el metodo, no dos veces el mismo validador
    private int validarPaginas(int paginas) {
        int aux = 1;
        if (paginas >= 1) {
            aux = paginas;
        }
        return aux;
    }

    @Override
    public String toString() {
        return "Publicacion{" + "titulo=" + titulo + ", paginas=" + paginas + '}';
    }
    
    
    
    
}
