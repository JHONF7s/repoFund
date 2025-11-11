package edu.eam.ingesoft.fundamentos.cuentabancaria.logica;

import java.util.ArrayList;

/**
 * Clase que representa un cliente del banco.
 * Un cliente puede tener hasta 6 cuentas.
 *
 * ESTE TEMPLATE SOLO INCLUYE LO NECESARIO PARA LAS LECCIONES 3 Y 4.
 */
public class Cliente {

    // Constante para límite máximo de cuentas
    public static final int MAX_CUENTAS = 6;

    // Atributos del cliente
    private String nombre;
    private String cedula;


    // ===================================================================
    // LECCIÓN 3: ARRAYLIST - Crear
    // ===================================================================
    // TODO LECCIÓN 3: Declarar ArrayList de cuentas
    // Ya está declarado aquí abajo:
    private ArrayList<Cuenta> cuentas;

    /**
     * Constructor de la clase Cliente.
     * Inicializa el cliente con su nombre, cédula y una lista vacía de cuentas.
     *
     * @param nombre Nombre completo del cliente
     * @param cedula Cédula del cliente (identificador único)
     */
    public Cliente(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.cuentas = new ArrayList<>();

        // TODO LECCIÓN 3: Inicializar el ArrayList de cuentas
        // IMPORTANTE: Si no inicializas el ArrayList obtendrás NullPointerException
        // Inicializar: this.cuentas = new ArrayList<>();
    }

    // ===================================================================
    // LECCIÓN 4: ARRAYLIST - Agregar elementos
    // ===================================================================

    /**
     * Abre una nueva cuenta para el cliente.
     * Valida que no se exceda el límite de 6 cuentas.
     *
     * LECCIÓN 4: Aprenderás a usar add() y size()
     *
     * @param numeroCuenta Número de la nueva cuenta
     * @param tipo Tipo de cuenta: AHORROS o CORRIENTE
     * @return true si se abrió exitosamente, false si ya tiene 6 cuentas
     */
    public boolean abrirCuenta(String numeroCuenta, String tipo) {
        // TODO LECCIÓN 4: Implementar lógica de apertura de cuenta
        int numeroCuentas = cuentas.size();
        if (numeroCuentas >= 6){
            return false;
        }
        // Paso 1: Validar límite de cuentas
        // Si cuentas.size() >= 6, retornar false
        // Paso 2: Crear nueva cuenta
        Cuenta cuenta = new Cuenta(tipo, numeroCuenta);
        // Paso 3: Agregar a la lista
        // Paso 4: Retornar true (éxito)
        return cuentas.add(cuenta);
    }

    // ===================================================================
    // Getters (algunos son parte de las lecciones)
    // ===================================================================

    /**
     * Retorna el nombre del cliente.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna la cédula del cliente.
     * @return cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * TODO LECCIÓN 3: Implementar getter de cuentas
     * Retorna la lista de cuentas del cliente.
     * @return ArrayList de cuentas
     */
    public ArrayList<Cuenta> getCuentas() {
        // TODO: Retornar el atributo cuentas
        return this.cuentas;
    }

    // ===================================================================
    // IMPORTANTE: NO hay setters para nombre, cedula ni cuentas
    // - nombre y cedula no cambian una vez creado el cliente
    // - cuentas se modifica solo con abrirCuenta()
    // ===================================================================
}
