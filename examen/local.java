public class local extends envio {

    private int distanciakm;

    public local(String codigo, String destinatario, double costoBase, int distanciakm) {
        super(codigo,destinatario,costoBase);
        this.distanciakm  = distanciakm;
    }

    public int getDistanciakm() {
        return distanciakm;
    }
    public void setDistanciakm(int distanciakm) {
        this.distanciakm = distanciakm;
    }
    
    @Override
    public String obtenerDetalles() {
        String resultado =  super.obtenerDetalles();
        resultado += " distancia: " + distanciakm;
        return resultado;
    }
}