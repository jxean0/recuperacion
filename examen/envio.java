public class envio {
    private String codigo;
    private String destinatario;
    private double costoBase;

    public envio(String codigo, String destinatario, double costoBase) {
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.costoBase = costoBase;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDestinatario() {
        return destinatario;
    }
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    public double getCostoBase() {
        return costoBase;
    }
    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    public String obtenerDetalles(){
        String resultado = "Codigo: " + codigo + " destinatario: " + destinatario + " costoBase: " + costoBase;
        return resultado;

    }
}
