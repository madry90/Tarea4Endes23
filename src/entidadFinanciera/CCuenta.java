/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;

/**
 * Clase CCuenta. 
 * Clase usada como plantilla para crear objetos CCuenta.
 * @author JCARLOSAF
 */
public class CCuenta {

    /**
     * Nombre de la persona titular
     */
    private String nombre;
    /**
     * Identificador de la cuenta
     */
    private String cuenta;
    /**
     * Saldo de la cuenta
     */
    private double saldo;
    /**
     * Tipo de interes de la cuenta
     */
    private double tipoInterés;
    /**
     * String mensaje de error constante
     */
    private String ERRORCANTIDADNEGATIVA="No se puede ingresar una cantidad negativa";

    /**
     * Constructor vacio
     */
    public CCuenta()
    {
    }
    /**
     * Constructor inicializador de objetos
     * @param nom nombre del titular
     * @param cue identificador de la cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de interes de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Metodo que retorna el estado actual de la cuenta, mostrando el saldo
     * @return saldo
     */
    public double estado(){
        return this.getSaldo();
    }
    /**
     * Metodo ingresar.
     * Recibe una cantidad como paramentro y actualiza el saldo sumando esa
     * cantidad
     * @param cantidad cuantia a ingresar
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    /**
     * Metodo retirar
     * Recibe una cantidad como parametro y actualiza el saldo restando esa
     * cantidad
     * @param cantidad cuantia a extraer
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
    //Encapsulación de los atributos CCuenta: Setter y Getter. 

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * @return the ERRORCANTIDADNEGATIVA
     */
    public String getERRORCANTIDADNEGATIVA() {
        return ERRORCANTIDADNEGATIVA;
    }

    /**
     * @param ERRORCANTIDADNEGATIVA the ERRORCANTIDADNEGATIVA to set
     */
    public void setERRORCANTIDADNEGATIVA(String ERRORCANTIDADNEGATIVA) {
        this.ERRORCANTIDADNEGATIVA = ERRORCANTIDADNEGATIVA;
    }
    
}


    
   