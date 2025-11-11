package edu.eam.ingesoft.fundamentos.cuentabancaria.logica;

/**
 * Clase que representa una cuenta bancaria.
 * Puede ser de tipo AHORROS o CORRIENTE.
 *
 * ESTE TEMPLATE SOLO INCLUYE LO NECESARIO PARA LAS LECCIONES 1 Y 2.
 */
public class Cuenta {

    // Constantes para los tipos de cuenta
    public static final String TIPO_AHORROS = "AHORROS";
    public static final String TIPO_CORRIENTE = "CORRIENTE";

    // Atributos de la cuenta
    private String numeroCuenta;
    private String tipo;
    private double saldo;
    private int transaccionesMes;

    /**
     * Constructor de la clase Cuenta.
     * Inicializa una nueva cuenta con saldo 0 y sin transacciones.
     *
     * LECCIÓN 1: CONSTRUCTOR
     * @param tipo Tipo de cuenta: AHORROS o CORRIENTE
     * @param numeroCuenta Número identificador de la cuenta
     */
    public Cuenta(String tipo, String numeroCuenta) {
        // TODO LECCIÓN 1: Implementar el constructor
        // 1. Asignar el parámetro tipo al atributo this.tipo
        this.tipo = tipo;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
        this.transaccionesMes = 0;
        // 2. Asignar el parámetro numeroCuenta al atributo this.numeroCuenta
        // 3. Inicializar this.saldo en 0.0
        // 4. Inicializar this.transaccionesMes en 0
    }

    // ===================================================================
    // LECCIÓN 2: ENCAPSULAMIENTO - Getters y Setters
    // ===================================================================

    /**
     * TODO LECCIÓN 2: Implementar getter de numeroCuenta
     * Retorna el número de la cuenta.
     * @return numeroCuenta
     */
    public String getNumeroCuenta() {
        // TODO: Retornar el atributo numeroCuenta
        return this.numeroCuenta;
    }

    /**
     * TODO LECCIÓN 2: Implementar getter de tipo
     * Retorna el tipo de cuenta (AHORROS o CORRIENTE).
     * @return tipo
     */
    public String getTipo() {
        return this.tipo;
    }

    /**
     * TODO LECCIÓN 2: Implementar setter de tipo
     * Permite cambiar el tipo de cuenta.
     * @param tipo Nuevo tipo de cuenta
     */
    public void setTipo(String tipo) {
        // TODO: Asignar el parámetro tipo al atributo this.tipo
        this.tipo = tipo;
    }

    /**
     * TODO LECCIÓN 2: Implementar getter de saldo
     * Retorna el saldo actual de la cuenta.
     * @return saldo
     */
    public double getSaldo() {
        // TODO: Retornar el atributo saldo
        return saldo;
    }

    /**
     * IMPORTANTE: NO hay setter para saldo porque solo debe cambiar
     * mediante los métodos consignar() y retirar() para mantener control.
     */

    /**
     * TODO LECCIÓN 2: Implementar getter de transaccionesMes
     * Retorna el número de transacciones realizadas en el mes.
     * @return transaccionesMes
     */
    public int getTransaccionesMes() {
        // TODO: Retornar el atributo transaccionesMes
        return transaccionesMes;
    }

    /**
     * IMPORTANTE: NO hay setter para numeroCuenta porque el número
     * de cuenta nunca cambia una vez creada.
     */

    /**
     * IMPORTANTE: NO hay setter para transaccionesMes porque solo
     * debe cambiar internamente con cada transacción.
     */
}
