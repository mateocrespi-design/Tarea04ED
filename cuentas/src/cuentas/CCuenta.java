package cuentas;

/**
 * @author Mateo Crespí
 */
public class CCuenta {

	/**
	 * Nombre del titular
	 */
    private String nombre;
    /**
     * Número de cuenta
     */
    private String cuenta;
    /**
     * Cantidad de saldo
     */
    private double saldo;
    /**
     * Porcentaje de interés
     */
    private double tipoInterés;

    

    /**
     * Ver nombre del propietario de la cuenta
     * @return Ver nombre del propietario actual
     */
    public String getNombre() {
		return nombre;
	}

    /**
     * Indicar nombre de la cuenta
     * @param nombre INdicar nombre de la cuenta
     */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Número de cuenta actual
	 * @return Conseguir cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Establecer número de cuenta
	 * @param cuenta Establecer número de cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Conocer el saldo actual
	 * @return Conocer el saldo actual
	 */
	public double getSaldo() {
		return saldo;
	}
	/**
	 * Cambio del saldo actual
	 * @param saldo Cambio del saldo actual
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Getter del interes actual
	 * @return Conocer le Interés actual
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}
	/**
	 * Setter cambio de interes
	 * @param tipoInterés Cambio tipo de interés
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	public CCuenta()
    {
    }
	
	/**
	 * Constructor de la cuenta.
	 * @param nom Nombre del Titular.
	 * @param cue Numero de cuenta.
	 * @param sal Saldo actual de la cuenta.
	 * @param tipo Tipo de inter´ñes
	 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Devuelve el estado actual de la cuenta
     * @return Estado de la cuenta
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * ingresar saldo en la cuenta
     * @param cantidad Ingreso del saldo
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Substraer dinero de la cuenta
     * @param cantidad Dinero que se substrae de la cuenta.
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
