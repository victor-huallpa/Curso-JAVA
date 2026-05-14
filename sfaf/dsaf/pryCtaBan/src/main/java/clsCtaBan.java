public class clsCtaBan {
    private String cci;
    private String alias;
    private double saldo;
    private String moneda;
    private String tipo;

    public clsCtaBan() { //C Nativo
        this.cci = gencci;
        this.alias = "";
        this.saldo = 0.0;
        this.moneda = "";
        this.tipo = "tipo";
    }

    public clsCtaBan(String moneda, String tipo) {//C Parametrizado
        this.moneda = moneda;
        this.tipo = tipo;
    }

    public void setCci(String cci) {
        this.cci = cci;
    }

    public void setAlias(String alias) {
        if(alias!=null){
            this.alias = alias;
        }

    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setMoneda(String moneda) {
        if(moneda!=null){
            this.moneda = moneda;
        }

    }

    public void setTipo(String tipo) {
        if(tipo!=null){
            this.tipo = tipo;
        }
    }

    public String gencci(){
        return"001-123-111222333444-01";
    }
    public void mostDatos(){
        System.out.println("=====CUENTA CREADA=====");
        System.out.println("CCI: " + cci);
        System.out.println("Alias: "+ alias);
        System.out.println("Saldo: " + saldo);
        System.out.println("Moneda: " + moneda);
        System.out.println("Tipo: " + tipo);

    }

    public void depos(double monto){
        if(monto>0){
            saldo +=monto;
        }
    }

    public boolean saldoDisp(double monto){
        return saldo>monto;
    }
    public void ectraer (double monto){
        if (saldoDisp(monto)){
            saldo -= monto;
        }
    }
}

