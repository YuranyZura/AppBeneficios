
package Beneficio;

public class cls_persona {
    private String str_nombre;
    private String str_id;
    private int int_puntaje;
    private boolean bln_estado;

    public cls_persona(String str_nombre, String str_id, int int_puntaje, boolean bln_estado) {
        this.str_nombre = str_nombre;
        this.str_id = str_id;
        this.int_puntaje = int_puntaje;
        this.bln_estado = bln_estado;
    }

    public String getStr_nombre() {
        return str_nombre;
    }

    public String getStr_id() {
        return str_id;
    }

    public int getInt_puntaje() {
        return int_puntaje;
    }

    public boolean getStr_estado(boolean par) {
        return bln_estado;
    }

    public void setStr_nombre(String str_nombre) {
        this.str_nombre = str_nombre;
    }

    public void setInt_puntaje(int int_puntaje) {
        this.int_puntaje = int_puntaje;
    }

    public void setStr_estado(boolean str_estado) {
        this.bln_estado = str_estado;
    }
    
}
