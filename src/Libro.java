public class Libro {
    private String titulo;
    private String autor;
    private int categoria;
    private boolean prestado;

    public static final int TIPO_NOVELA=0;
    public static final int TIPO_POESIA=1;
    public static final int TIPO_DICCIONARIO=2;

    public Libro(String titulo,String autor,int categoria, boolean prestado){
        this.titulo=titulo;
        this.autor=autor;
        this.categoria=categoria;
        this.prestado=prestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public static void setTitulo(String titulo) {
    }

    public String getAutor() {
        return autor;
    }

    public static void setAutor(String autor) {
    }

    public int getCategoria() {
        return categoria;
    }

    public static void setCategoria(int categoria) {
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public static int getTipoNovela() {
        return TIPO_NOVELA;
    }

    public static int getTipoPoesia() {
        return TIPO_POESIA;
    }

    public static int getTipoDiccionario() {
        return TIPO_DICCIONARIO;
    }

    public String crearEtiqueta(int principio, int finalPalabra){
        String cadena1=getAutor();
        String cadena2=getTitulo();
        String subCadena1=cadena1.substring(1,3);
        String subCadena2=cadena2.substring(1,3);
        String resultado=(subCadena1+" "+subCadena2);
        return resultado;
    }
}
