public class internacional extends envio {

    private int aduana;

    public internacional(String codigo, String destinatario, double costoBase, int aduana) {
        super(codigo,destinatario,costoBase);
        this.aduana  = aduana;
    }

    public int getDistanciakm() {
        return aduana;
    }
    public void setDistanciakm(int distanciakm) {
        this.aduana = distanciakm;
    }
    
    @Override
    public String obtenerDetalles() {
        String resultado =  super.obtenerDetalles();
        resultado += " impuesto aduana: " + aduana;
        return resultado;
    }
}
