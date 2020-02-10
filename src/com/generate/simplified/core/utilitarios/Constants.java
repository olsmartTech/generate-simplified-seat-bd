/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generate.simplified.core.utilitarios;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;

public class Constants {

    /**
     * CONSTANTS PARA EL TM_AREA REGISTRAL
     */
    public static final String ID_AREA_INMUEBLE = "21000";
    public static final String ID_AREA_PERSONA_JURIDICA = "22000";
    public static final String ID_AREA_PERSONA_NATURAL = "23000";
    public static final String ID_AREA_MUEBLE = "24000";
    public static final int NUM_MAXIMO_CIFRAS = 10;

    public static final String MODO_ACCESO_FORM_VENTAS = "_ACCESO_FORM_VENTAS";
    public static final String MODO_ACCESO_FORM_REG_CLI = "_ACCESO_FORM_REG_CLIETE";

    public static final String MODO_ACCESO_FORM_FACTURA = "_ACCESO_FORM_FACTURA";
    public static final String MODO_ACCESO_FORM_REG_PROV = "_ACCESO_FORM_REG_PROVEEDOR";
    public static final String MODO_ACCESO_PANEL_EXTERNO = "_ACEESO_EXTERNAL";
    public static final String MODO_ACCESO_PANEL_INTERNO = "_ACEESO_INTERNAL";
    public static final String CAJA_ANTERIOR_ABIERTA = "CAJA_ANTERIOR_ABIERTA";
    public static final String CAJA_SIN_APERTURA = "CAJA_SIN_APERTURA";
    public static final String CAJA_ACTUAL_ABIERTA = "CAJA_ACTUAL_APERTURADA";
    public static final String CAJA_ACTUAL_CERRADA = "CAJA_ACTUAL_CERRADA";

    public static final String KEY_ENCRIPT_ACCESS = "adminstrador1234";
    public static final String KEY_DECRIPT_ACCESS = "RandomInitVector";
    
    public static final String MODE_ONLYONE = "_ONLYONE";
    public static final String MODE_ALLROW = "_ALLROW";
    /**
     * CONSTANS PARA SERVICIOS
     */
    /**
     * *********** RESERVA DENOMINACION ***********
     */
    public static final String COD_SERVICIO_RESERVA_DENOMINACION = "197";
    public static final String SERVICIO_RESERVA_DENOMINACION = "170";
    public static final String PAGO_ANONIMO = "04";
    public static final String DES_PAGO_ANONIMO = "Sin pago";
    public static final String PAGO_USUARIO = "03";
    public static final String DES_PAGO_USUARIO = "A cuenta de saldo";
    public static final String PAGO_VISA = "06"; // gchang 14/01/2015 debe ser 06
    public static final String DES_PAGO_VISA = "Pago Tarjeta"; // gchang 14/01/2015 debe ser Pago Tarjeta

    public static final String FORM_PAGO_TARJETA_CREDITO = "TARJETA_CREDITO";
    public static final String FORM_PAGO_TARJETA_DEBITO = "TARJETA_DEBITO";
    public static final String FORM_PAGO_EFECTIVO = "TARJETA_EFECTIVO";
    public static final String FORM_PAGO_AL_CREDITO = "CREDITO";
    public static final String FORM_NOTA_DE_CREDITO = "NOTA_DE_CREDITO";

    public static final String VALIDAR_CAJA_CHICA_OPTION_OPEN = "VALIDAR_CAJA";
    public static final String VALIDAR_CAJA_CHICA_OPTION_FECHA = "RECUPERAR_CAJA_FECHA";
    
    public static final String FORM_PAGO_TOTAL_INGRESO = "FORM_PAGO_TOTAL_INGRESO";
    public static final String CODIGO_TIPO_PAGO_DENOMINACION = "01";
    public static final String DESC_TIPO_PAGO_DENOMINACION = "PRESENTACION";
    public static final String RESPUESTA_DE_CAJA = "NO_HAY_CAJA_INICIAL_REGISTRADA";
    public static final String RESPUESTA_DE_SOBRANTE = "NO_HAY_MONTO_REGISTRADA";

    public static final String NAME_TEXT_BUTTON_GO_OUT = "[ GO OUT ]";
    public static final String NAME_TEXT_BUTTON_SETTING_CTA_SALES = "Config. Ctas. Ventas";
    public static final String NAME_TEXT_BUTTON_SETTING_CTA_BUY = "Config. Ctas. Compras";
    
    public static final Integer TIPY_PLAN_BASIC_CANT_USER = 1;
    public static final Integer TIPY_PLAN_BASIC_CANT_STORE = 1;
    public static final Integer TIPY_PLAN_BASIC_CANT_LOCALIDAD = 1;
    public static final Integer TIPY_PLAN_BASIC_CANT_CCOSTO = 1;

    public static final Integer TIPY_PLAN_PREMIUN_CANT_USER = 2;
    public static final Integer TIPY_PLAN_PREMIUN_CANT_STORE = 2;
    public static final Integer TIPY_PLAN_PREMIUN_CANT_LOCALIDAD = 2;
    public static final Integer TIPY_PLAN_PREMIUN_CANT_CCOSTO = 2;

    public static final Integer TIPY_PLAN_PRO_CANT_USER = 3;
    public static final Integer TIPY_PLAN_PRO_CANT_STORE = 3;
    public static final Integer TIPY_PLAN_PRO_CANT_LOCALIDAD = 3;
    public static final Integer TIPY_PLAN_PRO_CANT_CCOSTO = 3;

    public static final Integer TIPY_PLAN_RECARGA_CANT_USER = 10;
    public static final Integer TIPY_PLAN_RECARGA_CANT_STORE = 10;
    public static final Integer TIPY_PLAN_RECARGA_CANT_LOCALIDAD = 10;
    public static final Integer TIPY_PLAN_RECARGA_CANT_CCOSTO = 10;

    public static final Integer TIPY_PLAN_TOTAL_CANT_USER = 20;
    public static final Integer TIPY_PLAN_TOTAL_CANT_STORE = 20;
    public static final Integer TIPY_PLAN_TOTAL_CANT_LOCALIDAD = 20;
    public static final Integer TIPY_PLAN_TOTAL_CANT_CCOSTO = 20;

    public static final Integer TIPY_PLAN_TRANSACCION_CANT_USER = 20;
    public static final Integer TIPY_PLAN_TRANSACCION_CANT_STORE = 20;
    public static final Integer TIPY_PLAN_TRANSACCION_CANT_LOCALIDAD = 20;
    public static final Integer TIPY_PLAN_TRANSACCION_CANT_CCOSTO = 20;

    //public static final Integer TIPY_LINE_MAX_USER = 3;
    //public static final Integer TIPY_LINE_MAX_STORE = 1;
    public static final String TIPY_TABLA_PLAN_BASIC_USER = "CANT_USUARIOS";
    public static final String TIPY_TABLA_PLAN_BASIC_STORE = "CANT_STORE";
    public static final String TIPY_TABLA_PLAN_BASIC_LOCALIDAD = "CANT_LOCALIDAD";
    public static final String TIPY_TABLA_PLAN_BASIC_CENTRO_COSTO = "CANT_CCOSTO";

    public static final String FLAG_ORIGEN_BOL = "GEN_BOL";
    public static final String FLAG_ORIGEN_OTHER = "NOT_GEN_BOL";
    
    public static final String TIPY_TABLA_PLAN_PREMIUN_USER = "CANT_USUARIOS";
    public static final String TIPY_TABLA_PLAN_PREMIUN_STORE = "CANT_STORE";
    public static final String TIPY_TABLA_PLAN_PREMIUN_LOCALIDAD = "CANT_LOCALIDAD";
    public static final String TIPY_TABLA_PLAN_PREMIUN_CENTRO_COSTO = "CANT_CCOSTO";

    public static final String TIPY_TABLA_PLAN_PRO_USER = "CANT_USUARIOS";
    public static final String TIPY_TABLA_PLAN_PRO_STORE = "CANT_STORE";
    public static final String TIPY_TABLA_PLAN_PRO_LOCALIDAD = "CANT_LOCALIDAD";
    public static final String TIPY_TABLA_PLAN_PRO_CENTRO_COSTO = "CANT_CCOSTO";

    public static final String TIPY_TABLA_PLAN_RECARGA_USER = "CANT_USUARIOS";
    public static final String TIPY_TABLA_PLAN_RECARGA_STORE = "CANT_STORE";
    public static final String TIPY_TABLA_PLAN_RECARGA_LOCALIDAD = "CANT_LOCALIDAD";
    public static final String TIPY_TABLA_PLAN_RECARGA_CENTRO_COSTO = "CANT_CCOSTO";

    public static final String TIPY_TABLA_PLAN_TOTAL_USER = "CANT_USUARIOS";
    public static final String TIPY_TABLA_PLAN_TOTAL_STORE = "CANT_STORE";
    public static final String TIPY_TABLA_PLAN_TOTAL_LOCALIDAD = "CANT_LOCALIDAD";
    public static final String TIPY_TABLA_PLAN_TOTAL_CENTRO_COSTO = "CANT_CCOSTO";
    
    public static final String TIPY_TABLA_PLAN_TRANSACCION_USER = "CANT_USUARIOS";
    public static final String TIPY_TABLA_PLAN_TRANSACCION_STORE = "CANT_STORE";
    public static final String TIPY_TABLA_PLAN_TRANSACCION_LOCALIDAD = "CANT_LOCALIDAD";
    public static final String TIPY_TABLA_PLAN_TRANSACCION_CENTRO_COSTO = "CANT_CCOSTO";

    public static final String PATH_XML_GENERADO = "C:/SFS_v1.2/sunat_archivos/sfs/RPTA/R";
    public static final String PATH_FILE_MAIL = "C:/SFS_v1.2/sunat_archivos/sfs/RPTA/R";
    public static final String PATH_FILE_PDF = "C:/SFS_v1.2/sunat_archivos/sfs/RPTA/";

    public static final String RUTA_FICHERO_MAIL = "NO EXITE FICHERO ZIP";
    public static final String RUTA_XML = "NO EXITE FICHERO XML";
    public static final String RUTA_PDF = "NO EXISTE EL ARCHIVO PDF";
    public static final String CUENTA_CORREO_ELECTRONICO_REMITENTE = "orlandlope@gmail.com";
    public static final String CLAVE_CORREO_ELECTRONICO_REMITENTE = "bcnnblbtyjcaphcy";

    public static final String STATE_XML_GENERADOx = "GENERADO";
    public static final String STATE_PDF_GENERADOx = "GENERADO";
    public static final String STATE_XML_GENERADO = "G";
    public static final String STATE_PDF_GENERADO = "G";

    public static final String FLAG_VIEW_BUTTON_OUT_OK = "OK";
    public static final String FLAG_VIEW_BUTTON_OUT_NOT = "NOT";
    public static final String BUS_X_FECHAS = "POR_FECHAS";
    public static final String BUS_X_USUEARIO_CONOCIDO = "POR_USUARIO";
    public static final String BUS_X_USUEARIO_DESC = "ANONIMO";
    public static final String BUS_POR_FECHAS = "POR_FECHAS";
    public static final String BUS_POR_USUARIO = "POR_USUARIO";
    public static final String MODULO_PEDIDOS = "PEDIDOS";
    public static final String MODULO_COMPRAS = "COMPRAS";
    public static final String MODULO_CONTROL_CALIDAD = "CONTROL_CALIDAD";
    public static final String MODULO_COMPRAS_MODIFICAR = "Compras_Modif";
    public static final String MODULO_VENTAS = "VENTAS";
    public static final String MODULO_VENTAS_RESTAURANT = "VENTAS_RESTAURANT";
    public static final String MODULO_VENTAS_FERRETERO = "SALES_FERRETERO";
    public static final String MODULO_VENTAS_MODIFICAR = "venta_modif";
    public static final String MODULO_MODIFICAR = "MODIFICAR";

    public static final String MODULO_VIATICOS = "VIATICOS";
    public static final String MOTIVO_ANULACION = "Anulacion";
    public static final String MOTIVO_DEVOLUCION = "Devolucion";
    public static final String MOTIVO_DESCUENTO = "Descuento";
    public static final String MODO_PANTALLA_NORMAL = "N";
    public static final String MODO_PANTALLA_TOUCH = "T";
    public static final String PANEL_FLOTANTE_SI = "S";
    public static final String PANEL_FLOTANTE_NO = "N";
    public static final String PANEL_USAGIN_NOT = "N";
    public static final String PANEL_USAGIN_YES = "S";
    public static final Integer DEFAULT_NUMBER_DAY_CREDIT = 10;
    public static final Integer DEFAULT_NUMBER_DAY_CREDIT_START = 0;
    
    public static final String FLAG_DATE_YES = "YES";
    public static final String FLAG_DATE_NOT = "NOT";
    
    public static final String FLAG_ORIGEN_PANE_VENTAS = "VENTAS";
    public static final String FLAG_ORIGEN_PANE_CARRITO_COMPRAS = "CARRITOCOMPRAS";
    /*PASOS*/
    public static final String TIENE_LISTA_PRECIO_NO = "NO";
    public static final String TIENE_ALMACEN_REGISTRADO_NO = "NO";
    public static final String TIENE_ALMACEN_ASIGNADO_NO = "NO";
    public static final String RPT_VERIFICACION_INI = "SI";
    public static final String RPT_VERIFICACION_NO = "NO";

    /*MODO DE PANTALLA*/
    public static final String SCREEN_MODE_SMALL = "VISTA_SMALL";

    /*PASOS*/
    public static final String STEP_NAME1 = "PASO1";
    public static final String STEP_NAME2 = "PASO2";
    public static final String STEP_NAME3 = "PASO3";
    public static final String STEP_NAME4 = "PASO4";
    /*End Pasos*/
    //CATEGORIA A
    public static final String STEP_1_A = "STEP_1_A";
    public static final String STEP_2_A = "STEP_2_A";
    public static final String STEP_3_A = "STEP_3_A";
    //CATEGORIA B    
    public static final String STEP_1_B = "STEP_1_B";
    public static final String STEP_2_B = "STEP_2_B";
    public static final String STEP_3_B = "STEP_3_B";
    //CATEGORIA C
    public static final String STEP_1_C = "STEP_1_C";
    public static final String STEP_2_C = "STEP_2_C";
    //CATEGORIA C
    public static final String STEP_1_D = "STEP_1_D";
    //public static final String STEP_2_D = "STEP_2_C";        

    public static final String ORIGEN_WITHOUT_CAJA_CHICA = "WITHOUT_CAJA_CHICA";
    public static final String ORIGEN_WITH_CAJA_CHICA = "WITH_CAJA_CHICA";
    public static final String TYPE_MOVIMIENTO_CAJA_EGRESO = "EGRESO";
    public static final String TYPE_MOVIMIENTO_CAJA_INGRESO = "INGRESO";
    
    public static final String TIPY_PRODUCTO_FULL_TEMPORAL = "F";
    public static final String TIPY_PRODUCTO_UNIT_TEMPORAL = "T";
    public static final String TIPY_PRODUCTO_WITH_MENU_ENTRIES = "MENU_WITH_ENTRIES";
    public static final String TIPY_PRODUCTO_WITHOUT_MENU_ENTRIES = "MENU_WITHOUT_ENTRIES";
    public static final String TIPY_PRODUCTO_WITHOUT_MENU_ENTRIES_DEFAULT = "NOTHING";
    public static final String TIPY_PRODUCTO_WITHOUT_MENU_ENTRIES_NEW = "NOTHING";
    
    public static final String RETAIL_PRODUCTO_SALES = "SALES RETAIL";
    public static final String WHOLE_SALES = "WHOLE SALES";

    //POR EL MOMENTO SE CONFIGURAN 9 PASOS 
    public static final int NUMERO_DE_STEP = 9;
    public static final int COD_RUBRO_BUSINESS = 4;
    public static final int COD_CONDICION_PROVEEDOR_DEFAULT = 1;
    
    public static final String ENVIO_CODIGO_DE_SOLICITANTE = "SOLICITANTE";//PENDIENTE
    public static final String ENVIO_CODIGO_CONFIRMACION_ADMIN = "ADMIN";//PENDIENTE
    
    public static final String ENVIO_CODE_SOLICITUD_CRITERIO = "SOLICITUD";//PENDIENTE
    public static final String ENVIO_CODE_CONFIRMACION_CRETERIO = "CODE_CONFIRMACION";//PENDIENTE    
    
    public static final String SOLICITUD_NO_APERTURADA = "NOTHING";//PENDIENTE
    
    public static final String STATE_OF_THE_PERIOD_OPEN = "1";//PENDIENTE
    public static final String STATE_OF_THE_PERIOD_CLOSED = "0";//PENDIENTE
    public static final String STADO_PERIODO_APERTURA = "OPEN";//PENDIENTE
    public static final String STADO_PERIODO_CLOSED = "CLOSED";//PENDIENTE
    public static final String SOLICITUD_CODE_CONFIRMACION_OCULTAR = "###################";//PENDIENTE
    public static final String SOLICITUD_CODE_GENERADO_OCULTAR = "XXXXXXXXXXXXXXXXXX";//PENDIENTE
    
    public static final String CONSOLA_SETTING_PRICE_SERVICE_OPEN = "COSOLE_PRICE_SETTING_OPEN";//PENDIENTE
    public static final String CONSOLA_SETTING_PRICE_SERVICE_CLOSED = "COSOLE_PRICE_SETTING_CLOSED";//PENDIENTE
    
    public static final String CADUCIDADA_PERIODO_OPEN = "EXPIRATION_CADUCIDAD_OPEN";//PENDIENTE
    public static final String CADUCIDADA_PERIODO_CLOSED = "EXPIRATION_CADUCIDAD_CLOSED";//PENDIENTE
    
    public static final String LICENSE_NOTHING_CREATED_OPEN = "LICENSE_NOTHING_OPEN";//PENDIENTE
    public static final String LICENSE_NOTHING_CREATED_CLOSED = "LICENSE_REGISTRADA";//PENDIENTE
    
    public static final String STATE_LICENSE_TEAM_NOTHING = "NOTHING";//PENDIENTE
    public static final String STATE_LICENSE_TEAM_REGISTERED_OK = "LICENSE_IF_GENERATED";//PENDIENTE
    
    public static final String ACCESS_CONSOLA_SETTING_PRICE_SERVICE_OPEN = "ACCESS_CONSOLE_OPEN";//PENDIENTE
    public static final String ACCESS_CONSOLA_SETTING_PRICE_SERVICE_CLOSE = "ACCESS_CONSOLE_CLOSED";//PENDIENTE
    public static final String USE_CONSOLE_ACCESS_TABLE = "USE_TABLE_HISTORY";//PENDIENTE
    public static final String USE_CONSOLE_ACCESS_TABLE_NOTHING = "NOTHING";//PENDIENTE
    
    public static final String STADO_PAGO_SERVICIO_PENDIENTE = "P";//PENDIENTE
    public static final String STADO_PAGO_SERVICIO_CANCELADO = "C";//CANCELADOE
    public static final String AFILIACION_EMPRESA_EXTERNA = "AFIL_EXTERNA";
    public static final String TYPE_PLAN_BASIC = "PLAN_BASIC";
    public static final String TYPE_PLAN_PREMIUN = "PLAN_PREMIUN";
    public static final String TYPE_PLAN_PRO = "PLAN_PRO";
    public static final String TYPE_PLAN_DEMO = "PLAN_DEMO";
    public static final String TYPE_PLAN_RECARGA = "PLAN_RECARGA";
    public static final String TYPE_PLAN_TOTAL = "PLAN_TOTAL";
    public static final String TYPE_PLAN_TRANSACCION = "PLAN_TRANSACCION";
    
    public static final String FLAG_TERM_OF_PERIOD_CLOSED = "TERM_OF_PERIOD";
    public static final String FLAG_TERM_OF_PERIOD_CONTINUE = "CONTINUE_OPERATING";
    
    public static final String FLAG_FECHA_SEGUIR_OPERANDO = "SEGUIR_OPERANDO";
    //public static final String FLAG_FECHA_COBRO_2 = "HACER_CORTE";
    public static final String FLAG_FECHA_APLICAR_CORTE = "HACER_CORTE";
    
    public static final String TYPE_MENU_LEFT = "MENU_LEFT";
    public static final String TYPE_MENU_TOTAL = "TOTAL";
    
    public static final String AFILIACION_EMPRESA_INTERNA = "AFIL_INTERNA";
    public static final String USUARIO_TIENE_ALMACEN = "USER_NO_TIENE_ASOCIADO_ALMACEN";
    public static final String USER_DATA_ARE_INCORRECT = "ACCESS_DENIED";
    public static final String USER_DATA_ARE_GRANTED = "ACCESS_GRANTED";
    public static final String USER_TIENE_ASOCIADO_ALMACEN = "USER_TIENE_ASOCIADO_ALMACEN";
    public static final String USER_NO_TIENE_CENTOR_COSTO = "NO_TIENE_CC";
    public static final String USER_SI_TIENE_CENTOR_COSTO = "SI_TIENE_CC";
    public static final String USER_STATUS_ACCOUNT_DISCOUNTED = "0";
    public static final String USER_STATUS_ACCOUNT_ACTIVATED = "1";
    //public static final String RUTA__ARCHIVO_DATA0_TEM = "/data0/tempo";
    public static final String RUTA__ARCHIVO_MAC_PC = "/mac/mac.txt";
    
    public static final String PER_AUT_PRES = "001";
    public static final String CAMPO_IN_ESTD = "A";
    public static final String CAMPO_NU_PART = "N1";
    public static final String CAMPO_ES_PRTC = "A";
    //Font f = new Font("TAHOMA", Font.BOLD, 12);
    public static final Font TYPE_FONT=new java.awt.Font("Verdana", 1, 10);
    public static final Font TYPE_FONT_NORMAL=new java.awt.Font("Arial", Font.PLAIN, 15); 
    public static final Font TYPE_FONT_NORMAL_TITLE=new java.awt.Font("Arial", Font.BOLD, 15); 
    public static final int SIZE_FONT = 10;
    
    public static final String PERZAUTZPRES = "001";
    public static final String PAGO_WEB = "WEB";
    public static final String TIPO_PRODUCTO_MERDADERIA = "M";
    public static final String TIPO_PRODUCTO_SERVICIO = "S";
    public static final String TIPO_PRODUCTO_GASTO = "G";
    //public static final Color COLOR_TITLE_FORM =new Color(35, 155, 86);
    public static final Color COLOR_SEPARADOR_CAJA1 = new Color(139, 131, 120);
    public static final Color COLOR_TITLE_FORM = new Color(128, 128, 128);
    //public static final Color COLOR_TITLE_FORM = new Color(118, 185, 237);
    public static final Color HEADER_TABLE_SUMMARY_BACKGROUND = new Color(248, 248, 255);
    public static final Color HEADER_TABLE_SUMMARY_FONT = new Color(0, 0, 0);
    public static final Color COLOR_FORENGROUT_PANEL_CAJA = new Color(105, 105, 105);
    public static final Color COLOR_BACKGROUND_PANEL_CAJA_TITLE = new Color(100, 149, 237);
    //public static final Color COLOR_TITLE_FORM = new Color(206, 128, 237);
    public static final Color COLOR_TITLE_FUENTE = new Color(255, 255, 255);
    public static final Color COLOR_FONDO_PANEL_MANTE = new Color(207, 207, 207);
    public static final Color COLOR_FONDO_PANEL = new Color(240, 240, 240);
    public static final Color COLOR_FONDO_PANEL_BROSHURE = new Color(192, 192, 192);
    
    public static final Color COLOR_FONDO_PANEL_BODEGERO = new Color(128, 128, 128);
    public static final Color COLOR_FONDO_PANEL2 = new Color(126, 192, 238);
    public static final Color COLOR_HEAD_PANEL_ASISTENTE = new Color(238, 59, 59);
    public static final Color COLOR_BORDER_PANEL = new Color(128, 128, 128);
    public static final Color COLOR_BORDER_PANEL_BLACK = new Color(0, 0, 0);
    //public static final Color COLOR_BORDER_PANEL = new Color(118, 185, 237);
    public static final Color COLOR_BORDER_PANEL_ACCESO = new Color(105, 105, 105);
    public static final Color COLOR_BORDER_PANEL_CODBARRA = new Color(139, 137, 137);
    public static final Color COLOR_BORDER_PANEL_PRUEBA = new Color(0, 0, 255);
    public static final Color COLOR_BORDER_BOTONES_SISTEMA1 = new Color(139, 137, 137);
    public static final Color COLOR_BORDER_BOTONES_SISTEMA2 = new Color(205, 51, 51);
    public static final Color COLOR_FUENTE_HEAD_PANEL_ASISTENTE = new Color(255, 255, 255);
    public static final Color COLOR_FUENTE_HEAD_PANEL_INFO = new Color(0, 0, 255);

    public static final Color COLOR_FUENTE_PANEL_INFOR_ACCESO = new Color(60, 179, 113);

    public static final Color COLOR_FONDO_PANEL_DOCU = new Color(139, 137, 137);

    public static final Color COLOR_FONDO_BOTON_ACTION = new Color(205, 51, 51);
    public static final Color COLOR_FUENTE_COMPLETADO = new Color(60, 179, 113);
    public static final Color COLOR_FUENTE_COMPLETADO_AZUL = new Color(0, 0, 255);

    /*BACKGROUND THA PANEL PRODUCT*/
    public static final Color COLOR_BACKGROUND_PANEL_PRODUCTS_REST2 = new Color(139, 131, 120);
    public static final Color COLOR_BACKGROUND_PANEL_PRODUCTS_REST = new Color(139, 37, 0);
    public static final Color COLOR_FONTS_PANEL_PRODUCTS_REST = new Color(255, 250, 250);
    /*END BACKGROUND PRODUCTS*/
    public static final String OPERATION_DELETE = "DELETE";
    public static final String OPERATION_ADD = "ADD";
    public static final String OPERATION_NOTHING = "NOTHING";
    public static final String OPERATION_OK = "OK";
    public static final String OPERATION_LIST = "LIST";
    public static final String ORIGEN_EVET_COUNTER1 = "BLOCK";
    public static final String ORIGEN_EVET_COUNTER2 = "UNIT";
    public static final String OPERATION_LIST_NUM_ORDERS = "ORDERS";
    public static final String OPERATION_LIST_NUM_ORDERS_IN_KITCHEN = "ORDERS_IN_KITCHEN";
    public static final String OPERATION_LIST_NUM_ORDERS_IN_TEMP = "ORDERS_TEMP";
    public static final String TYPE_OPERATION_ORIGEN_REST = "RESTORANT";
    public static final String TYPE_OPERATION_ORIGEN_PRODUCTS = "PRODUCTS";
    public static final String FLAG_FILL_LIST_FULL_OK = "FULL";
    public static final String FLAG_FILL_LIST_NOT_FULL = "NOT_FULL";
    
    public static final Color COLOR_FONT_TABLES_SELECTED = new Color(255, 255, 0);

    public static final Color COLOR_FONDO_PANEL_ACCESS_TITLE = new Color(0, 100, 0);
    public static final Color COLOR_FONDO_PANEL_BODY_ACCESS = new Color(152, 251, 152);
    public static final Color COLOR_BORDER_PANEL_BODY_ACCESS = new Color(0, 100, 0);

    /*BACKGROUND SCREEN*/
    public static final Color COLOR_BACKGROUND_PANEL_TABLES_REST = new Color(255, 255, 255);
    //public static final Color COLOR_BACKGROUND_PANEL_TABLES_REST = new Color(139, 119, 10);
    public static final Color COLOR_BACKGROUND_PANEL_FERRETERO = new Color(105, 105, 105);
    public static final Color COLOR_BACKGROUND_PANEL_TABLES_REST_TITLE = new Color(28, 28, 28);
    //public static final Color COLOR_FONT_TABLES_REST = new Color(255, 250, 250);
    public static final Color COLOR_FONT_TABLES_REST = new Color(255, 250, 250);
    public static final Color COLOR_BACKGROUND_BORDER_TABLES_REST = new Color(255, 255, 255);
    /*end SCREEN*/
    //public static final Color COLOR_FONDO_PANEL_SUMMARY_SALES_ = new Color(188, 210, 238);
    public static final Color COLOR_FONDO_PANEL_SUMMARY_SALES_RV = new Color(211, 211, 211);
    public static final Color COLOR_FONDO_PANEL_SUMMARY_SALES_ = new Color(248, 248, 255);
    public static final Color COLOR_FONDO_PANEL_SUMMARY_SALES = new Color(248, 248, 255);
    public static final Color COLOR_FONDO_PANEL_SUMMARY_SALES_TITLE = new Color(28, 28, 28);
    public static final Color COLOR_FONT_PANE_SUMMARY_SALES_TITLE = new Color(255, 255, 255);
    /*FORM PRODUCTOS PARA TACTIL*/
    public static final Color COLOR_FONDO_PANEL_BUSCADOR_PRODUCTO = new Color(54, 54, 54);
    public static final Color COLOR_FUENTE_PANEL_BUSCADOR_PRODUCTO = new Color(255, 255, 255);
    public static final Color COLOR_FUENTE_PANEL_VENTAS = new Color(34, 34, 85);
    public static final Color COLOR_FONDO_BOTON_PRODUCTO = new Color(0, 0, 0);
    public static final Color COLOR_FONDO_CAJA_TEXTO_PRODUCTO = new Color(0, 0, 0);
    public static final Color COLOR_TITLE_FORM_PRODUCTO = new Color(0, 0, 0);
    public static final Color COLOR_BORDER_PANEL_PRODUCTO = new Color(0, 0, 0);
    
    /**/    
    /*COLOR PARA EL BOTON CERRAR DEL FORM TACTIL PRODUCTOS*/
    public static final Color COLOR_BOTTUN_CERRAR_PANEL_TACTIL = new Color(0, 0, 0);
    
    public static final Color BACKGROUND_BUUTON_ACCESS = new Color(255, 165, 0);
    public static final Color BACKGROUND_BUUTON_ACCESS_FONT = new Color(253, 245, 230);
    public static final Color BACKGROUND_BUUTON_ACCESS_EXITED = new Color(218, 165, 32);
    
    public static final Color BACKGRAUND_PANEL_ACCESS = new Color(128, 128, 128);
    
    public static final Color BOUGRAUND_TEXT_ACCESS_FONT = new Color(253, 245, 230);
    public static final Color BOUGRAUND_TEXT_ACCESS_GAINED = new Color(105, 105, 105);
    public static final Color BOUGRAUND_TEXT_ACCESS_LOST = new Color(0, 0, 0);
    public static final Color BOUGRAUND_TEXT_ACCESS_BORDER = new Color(248, 248, 255);
    //public static final Color BOUGRAUND_TEXT_ACCESS_BORDER = new Color(248, 248, 255);

    public static final Color COLOR_FONDO_BOTON_CARRITO = new Color(207, 207, 207);
    public static final Color COLOR_FUENTE_PANEL_CARRITO = new Color(34, 34, 34);
    public static final Color COLOR_FONDO_BUTTON_CARRITO_EFECTO = new Color(255, 165, 0);
    public static final Color COLOR_BORDE_BOTON_CATALOGO = new Color(139, 134, 130);
    public static final Color COLOR_FONDO_BOTON_CATALOGO = new Color(255, 228, 196);
    public static final Color COLOR_BORDE_BOTON_CATALOGO_OUT = new Color(65, 105, 225);

    public static final Color COLOR_FONDO_BOTON_BROWSE = new Color(139, 134, 130);
    public static final Color COLOR_FONDO_BOTON_BROWSE_ = new Color(255, 255, 0);

    public static final Color COLOR_FONDO_BOTON_CATALOGO_UNIT = new Color(255, 222, 173);
    /*COLOR FONT*/
    public static final Color COLOR_FONT_BOTON_TABLE_REST_PROCESS = new Color(0, 0, 255);
    public static final Color COLOR_FONT_BOTON_TABLE_REST_ATTENDED = new Color(255, 130, 71);
    public static final Color COLOR_FONT_BOTON_TABLE_REST_FREE = new Color(255, 181, 197);

    /*TABLES*/
    public static final Color COLOR_FONDO_BOTON_TABLE_REST_PROCESS = new Color(255, 181, 197);
    public static final Color COLOR_FONDO_BOTON_TABLE_REST_BUSY = new Color(255, 0, 0);
    public static final Color COLOR_FONDO_BOTON_TABLE_REST = new Color(139, 134, 130);
    public static final Color COLOR_FONDO_BOTON_TABLE_REST_FREE = new Color(46, 139, 87);
    public static final Color COLOR_FONT_BOTON_TABLE_REST = new Color(139, 134, 130);

    public static final String TABLE_REST_STATE_BUSY = "O";//OCUPADO
    public static final String TABLE_REST_STATE_FREE = "L";//FREE
    public static final String TABLE_REST_STATE_DISPACHER = "D";//PROCESSOS
    public static final String TABLE_REST_STATE_PROCESS = "P";//PROCESSOS
    public static final String TABLE_REST_STATE_FINALIZADAS_EN_PAGO = "F','A";//PAGADAS
    public static final String TABLE_REST_STATE_FINALIZADAS_EN_EXITO = "F";//PAGADAS
    public static final String TABLE_REST_STATE_FINALIZADA_EN_ANULADA = "A";//PAGADAS
    public static final String TABLE_REST_STATE_ATTENDED = "A";//ATTENDED
    public static final String TABLE_REST_FLAG_JOIN_TABLE = "JOIN_TABLES";//PROCESSOS
    public static final String TABLE_REST_ONLY_ONE_TABLE = "ONLY_ONE_TABLE";//PROCESSOS
    public static final String TABLE_REST_STATE_UPDATE = "UPDATE";//PROCESSOS
    public static final String TABLE_REST_STATE_INSERT = "INSERT";//PROCESSOS
    public static final String TYPE_BUSINESS_REST = "REST";//PROCESSOS
    public static final String TYPE_BUSINESS_NOTHING = "NOTHING";//PROCESSOS
    public static final String TYPE_BUSINESS_FERRETERIA = "FERRETERIA";//PROCESSOS
    public static final String TABLE_REST_DELYVERY = "DELIVERY";//PROCESSOS
    public static final String TABLE_REST_DELYVERY_PEDIDOS = "PEDIDOS";//PROCESSOS
    public static final String TABLE_REST_NORMALY = "NORMALY";//PROCESSOS
    public static final String TIPYE_OPERATION_PURCHASES = "PURCHASES";//PROCESSOS
    public static final String TIPYE_OPERATION_SALES = "SALES";//PROCESSOS
    public static final String FLAG_DIVIDIR_TOTAL_SI = "SI";//PROCESSOS
    public static final String FLAG_DIVIDIR_TOTAL_NO = "NO";//PROCESSOS
    
    public static final String TYPE_PAYMENT_CACH = "PAGO EN EFECTIVO -> 101101";//PROCESSOS
    
    public static final String INSERT_VENTA_REST_TEMP = "ADD";//PROCESSOS
    public static final String LIST_VENTA_REST_TEMP = "LIST_VENTA_TEMP";//PROCESSOS
    public static final String DELETE_VENTA_REST_TEMP = "DELETE";//PROCESSOS
    public static final String FLA_CONTROL_CTA_CONTABLE = "NOTHING";//PROCESSOS
    /**
     * CONSTANTES PARA INGRESO AL SISTEMA
     */
    public static final String IV_USER = "iv-user";
    public static final String IV_GROUPS = "iv-groups";
    public static final String USER_SESSION_ID = "user-session-id";
    public static final String IV_REMOTE_ADDRESS = "iv-remote-address";

    public static final String FLAG_SESION_INACTIVA = "0";
    public static final String SEPARADOR_PUNTO = ".";
    public static final String SEPARADOR_DOS_PUNTOS = ":";
    public static final String SEPARADOR_PUNTO_COMA = ";";
    public static final String DIRECCION_ASTERISCO = "*";

    public static final String TIPO_USUARIO_EXTERNO = "1\\d\\d\\d"; // 1xxx
    public static final String TIPO_USUARIO_PERSONA_JURIDICA = "\\d0\\d\\d"; // x0xx
    public static final String TIPO_USUARIO_PERSONA_NATURAL = "\\d1\\d\\d"; // x1xx
    public static final String TIPO_USUARIO_ADMINISTRADOR = "\\d\\d1\\d"; // xx1x
    public static final long NIVEL_ACCESO_USUARIO = 0;
    public static final long SALDO_USUARIO_INTERNO = 9999;
    public static final String NUEVO_USUARIO_AFILIADO_CON_LOGUEOS = "0";
    public static final String NUEVO_USUARIO_AFILIADO_DESDE_VENTANILLA = "1";
    public static final String CADUCIDAD_CLAVE_INTERNO = "CAD_CLAVE_INT";
    public static final String CADUCIDAD_CLAVE_EXTERNO = "CAD_CLAVE_EXT";
    public static final String TA_TABL_INDICADOR_ESTADO_ACTIVO = "A";
    public static final String PREG_SECRETA_ESTADO_ACTIVO = "1";
    public static final String EXONERADO_PAGO_SI = "1";

    public static final long PERFIL_ADMIN_GENERAL = 10;
    public static final long PERFIL_INDIVIDUAL_EXTERNO = 20;
    public static final long PERFIL_AFILIADO_EXTERNO = 30;
    public static final long PERFIL_DEFAULT = 30;
    public static final long PERFIL_INVITADO = 50;
    public static final long PERFIL_ADMIN_ORG_EXT = 40;
    public static final long PERFIL_TESORERO = 50;
    public static final long PERFIL_CAJERO = 60;
    public static final long PERFIL_ADMIN_JURISDICCION = 70;
    public static final long PERFIL_INTERNO = 80;
    public static final long PERFIL_DEVOLUCIONES = 90;
    public static final long PERFIL_CONVENIO = 100;
    public static final long PERFIL_ASISTENTE = 160;

    // Codigos de Error
    public static final String NO_ERROR = "000000";

    public static final String EC_GENERIC_ERROR = "E09999";

    public static final String EC_RESOURCES_INTEGRITY = "E09001";
    public static final String EC_CANNOT_SEND_MAIL = "E09002";
    public static final String EC_GENERIC_DB_ERROR = "E09003";
    public static final String EC_GENERIC_DB_ERROR_DATA = "E09004";
    public static final String EC_GENERIC_DB_ERROR_INTEGRIDAD = "E09005";
    public static final String EC_DB_ERROR_AUTOCOMMIT_DEBE_SER_FALSE = "E09006";

    public static final String EC_MISSING_PARAM = "E00001";
    public static final String EC_PARAM_MISSFORMED = "E00002";
    public static final String EC_NOT_EXIST_VALID_SESSION = "E00003";
    public static final String EC_SESSION_INCOMPLETE = "E00004";

    public static final String NO_PERFILCUENTA_USUARIO = "E20001";
    public static final String NO_SALDO_DE_LINEA_PREPAGO = "E20002";
    public static final String NO_REG_PE_NATU = "E20003";
    public static final String CUENTA_DESHABILITADA = "E20004";
    public static final String NO_COINCIDEN_PWDS = "E20006";
    public static final String NO_REG_PE_JURI = "E20008";
    public static final String NO_REG_CONTRATO = "E20009";
    public static final String NO_REG_CUENTA_JURIS = "E20011";
    public static final String NO_LINEA_PREPAGO_ORG = "E20012";

    public static final String EC_NO_REGISTRATOR = "E50000";
    public static final String EC_USER_NOT_ALLOWED = "E50001";
    public static final String EC_NOT_FOUND_DATA = "E50002";
    public static final String E09999_ERROR_GENERICO = "E09999";
    public static final String E08054_USUARIO_INCORRECTO = "E08054";
    public static final String E08002_ERROR_TAM = "E08002";
    public static final String E08003_PERFIL_DESCONOCIDO = "E08003";
    public static final String E08004_USUARIO_NO_VALIDADO_EN_TAM = "E08004";
    public static final String E08005_USUARIO_SIN_GRUPO = "E08005";
    public static final String E08006_ERROR_POLITICA_TOD_ACCESS_TAM = "E08006";
    public static final String E08007_TIENE_SESION_ACTIVA = "E08007";
    public static final String E08008_DIRECCION_IP_NO_TIENE_ACCESO = "E08008";
    public static final String E08009_ES_FERIADO = "E08009";
    public static final String E08010_NO_EXISTE_SESION_PD = "E08010";
    public static final int IND_HORARIO_INTERNO_CONVENIO_EXON_PAGO = 1;
    public static final int IND_HORARIO_CAJERO_TESORERO = 2;
    public static final int MIN_LONG_PASSWORD = 6;
    public static final int MAX_LONG_PASSWORD = 10;

    /**
     * ********************* PARTIDA DIRECTA
     * *************************************
     */
    public final static int SERVICIO_CONSULTAR_PARTIDA = 10;
    public static final int BUSQUEDA_DIRECTA_PARTIDA_RMC = 41;
    public static final int CONSULTA_PARTIDA = 10;
    public static final long SERVICIO_CONSULTA_PARTIDA_RPV = 90;
    public static final int CONSULTA_PARTIDA_RMC = 34;
    public static final int PARTIDAS_RPV = 90;
    public static final String CUR_EX_NATURAL = "N";
    public static final String CUR_EX_JURIDICO = "J";
    public static final String CODIGO_LIBRO_RMC = "099";
    public static final String ACCION_VISUALIZAR_PARTIDA_VERIFICA = "VERIFICA";
    public static final String ACCION_VISUALIZAR_PARTIDA_EXPIDE = "EXPIDE";
    public static final String AREA_PROPIEDAD_VEHICULAR = "24000";
    public static final int SERVICIO_CERTIFICADO_COPIA_LITERAL_RMC_BASE = 150;
    public static final int SERVICIO_CERTIFICADO_COPIA_LITERAL_RMC_POR_PAGINA = 151;
    public static final String SERVICIO_VISUALIZA_PARTIDA_RMC = "196";
    public static final int SERVICIO_DETALLE_PARTIDA_RMC = 38;
    public static final int BUSQUEDA_INDICE_PARTIDA_RMC = 33;
    public static final int BUSQUEDA_NACIONAL_INDICE_PARTIDA_SIGC = 35;
    public static final int VALOR_SIN_COBRAR = 0;
    public static final int VISUALIZA_PARTIDA_RMC = 196;
    public static final int VISUALIZACION_PARTIDA = 70;
    public static final String CODIGO_GRUPO_LIBRO_AREA_RMC = "21";
    public static final long CODIGO_GRUPO_LIBRO_AREA_VEH = 6;

    /**
     * ************************** CLAVE ELECTRONICA REGISTRAL
     * ******************************
     */
    public static final String ENVIO_CER = "ENVIO DE CER";
    public static final String FROM_CER = "nucleoti@gmail.com";

    public static final String PERSONA_NATURAL = "N";
    public static final String PERSONA_JURIDICA = "J";

    public static final String COD_VERIFICADOR = "VE";
    public static final String COD_EMISOR = "EM";

    public static final String COPIA_LITERAL_ASIENTO_RMC = "LAR";
    public static final String COD_CERTIFICADO_COPIA_LITERAL_ASIENTO_RMC = "42";

    public static final String COPIA_LITERAL_RMC = "LR";
    public static final String COD_CERTIFICADO_COPIA_LITERAL_RMC = "41";

    public static final String COPIA_LITERAL = "L";

    public static final String ESTADO_ATEN_PENDIENTE = "P";
    public static final String ESTADO_ATEN_ATENDIDA = "C";

    public static final String CERTIFICADO_BUSQUEDA = "B";

    /**
     * *************** CONSTANTES PARA MODULO ADMINISTRACION *********
     */
    public static final String TICKED_NUMERO = "TICKED-";
    public static final String ESTADO_TICKED_VENDIDO = "V";
    public static final String TIPO_CLIENTE_EXTERNO = "E";
    public static final String USUARIO_EXTERNO = "USEREXTERNO";
    public static final String ESTADO_OPERACION_TICKED_PENDIENTE = "P";
    public static final String ESTADO_OPERACION_TICKED_EN_PROCESO = "E";
    public static final String ESTADO_CONSUMO_OPERACION = "E";
    public static final String TIPO_CLIENTE_INTERNO = "I";
    public static final String ESTADO_TICKED_CREADO = "C";
    public static final String TIPO_USR_INDIVIDUAL = "I";
    public static final String TIPO_USR_ORGANIZACION = "O";
    public static final String ESTADO_SOL_DEV_REGISTRADO = "0";
    public static final String ESTADO_INACTIVO = "0";
    public static final String ESTADO_ACTIVO = "1";
    public static final String ACCESO_DENEGADO = "0";
    public static final String INDICA_AFIRMACION = "SI";
    public static final String TIPO_DOCUMENTO_RUC = "05";
    public static final String TIPO_ORG_INTERNA = "1";
    public static final String TIPO_ORG_EXTERNA = "0";
    public static final String PREFIJO_CUENTA = "001";
    public static final long PREG_SECRETA_NO_ASIG = 0;
    public static final String RECIBIR_NOTICIAS_MAIL_ACT = "1";
    public static final String USUARIO_AFILIADO_NUEVO = "1";
    public static final String FLAG_LINEAPREPAGO_PENDIENTE = "0";
    public static final double SALDO_INICIAL_LINEAPREPAGO = 0.0;
    public static final long NIVEL_ACESSO_NIVEL_ORGA = 1;
    public static final long NIVEL_ACESSO_NIVEL_USUARIO = 0;
    public static final String TIPO_ADMINISTRADOR_EXTERNO = "1010";
    public static final String TIPO_ADMINISTRADOR_INTERNO = "0010";
    public static final String CONSULTA_ADMINISTRADOR = "__1%%";
    public static final String EXONERAR_PAGO = "1";
    public static final String NO_EXONERAR_PAGO = "0";
    public static final String SIN_PERMISOS_ESPECIALES = "0";
    public static final String CON_PERMISOS_ESPECIALES = "1";

    public static final String VALOR_ACTUAL_UIT = "UIT";
    public static final String C_ADM_PAG_CRED = "CTC";
    public static final String C_ADM_PAG_DEB = "CTD";
    public static final long AFILIACION_EXTRANET = 60;
    public static final String TIPO_PERMISO_REPORTE = "R";
    public static final String TIPO_PERMISO_SERVICIO = "S";

    /**
     * ************************* CONSTANTES PARA TIPO DE PAGO
     * **********************
     */
    public static final String PAGO_CHEQUE = "C";
    public static final String PAGO_EFECTIVO = "E";
    public static final String PAGO_LINEA_PREPAGO = "P";
    public static final String PAGO_TARJETA_DE_CREDITO = "T";
    public static final String SELECCIONA_TIPO_PAGO = "N";

    /**
     * ***************** PARA CAJERO LINEA PREPAGO ********************
     */
    public static final String COMODIN_USUARIO = "PRUEBAAFI";
    public static final String COMODIN_LINEA_PREPAGO = "1";
    public static final int COMODIN_CONTRATO_ABONAR = 1;

    public static final String ESTADO_SOL_POR_PAGAR = "P";
    public static final String ESTADO_SOL_POR_VERIFICAR = "C";
    public static final String ESTADO_SOL_POR_EXPEDIR = "V";
    public static final String ESTADO_SOL_POR_DESPACHAR = "E";
    public static final String ESTADO_SOL_DESPACHADA = "D";
    public static final String ESTADO_SOL_IMPROCEDENTE = "I";
    public static final String ESTADO_SOL_RECLAMO = "M";
    public static final String ESTADO_SOL_ENTREGADO_USUARIO = "U";
    public static final String ESTADO_SOL_LIQUIDADO = "L";
    public static final String ESTADO_SOL_CONFIRMAR = "Z";

    public static final String ID_JURISDICCION_FUERA_DEL_PERU = "00";
    public static final String ID_REGISTRO_PUBLICO_FUERA_DEL_PERU = "00";
    public static final String ID_OFICINA_FUERA_DEL_PERU = "00";
    public static final String ESTADO_SOL_CANCELADA = "X";
    //Detracciones
    public static final String FLAG_MANEJA_ANTICIPO_NO= "N";
    public static final String FLAG_MANEJA_ANTICIPO_SI= "S";
    public static final String FLAG_MANEJA_OPERATION_FREE_NO= "N";
    public static final String FLAG_MANEJA_OPERATION_FREE_SI= "S";
    //
    public static final String FLAG_DETRACCIONES_DEFAULT= "N";
    public static final String FLAG_DETRACCIONES_CREADAS= "D";
    public static final String FLAG_DETRACCIONES_PENDIENTE_OF_PAGO= "P";
    public static final String FLAG_DETRACCIONES_PAGADAS= "C"; 
    public static final String FLAG_ES_DETRACCION_SI= "S";
    public static final String FLAG_ES_DETRACCION_NO= "O";
    public static final String FLAG_OPERATION_INSERT= "INSERT";
    public static final String FLAG_OPERATION_UPDATE= "UPDATE";
      
    public static final String ABONO_CONCEPTO_DEPOSITO_APERTURA = "D";
    public static final String ABONO_CONCEPTO_RESERVA_DENOMINACION = "R";
    public static final String ABONO_CONCEPTO_AMPLIACION_CUENTA = "A";
    public static final String ABONO_CONCEPTO_PUBLICIDAD_CERTIFICADA = "P";
    
    public static final String FINANCIAL_ANALITYC_TYPO_COSTO_FIJO = "COSTO FIJO";
    public static final String FINANCIAL_ANALITYC_TYPO_COSTO_VARIABLE = "COSTO VARIABLE";
    public static final String FINANCIAL_ANALITYC_PROCESAMIENTO = "PROCESAMIENTO";
    public static final String FINANCIAL_ANALITYC_FINANCIAMIENTO = "FINANCIERO";
    public static final String FINANCIAL_ANALITYC_COMERCIALIZACION = "COMERCIALIZACION";
    public static final String FINANCIAL_ANALITYC_ADMINISTRATIVE = "ADMINISTRATIVO";
    public static final String FINANCIAL_ANALITYC_OUTGO_ADMIN = "GASTOS ADMINISTRATIVOS";
    public static final String FINANCIAL_ANALITYC_LINE_PRODUCTIV_CONV = "LINEA DE CAFE CONVENCIONAL";
    public static final String FINANCIAL_ANALITYC_LINE_PRODUCTIV_ORGANICO = "LINEA DE CAFE ORGANICO";
    public static final String FINANCIAL_ANALITYC_LINE_PRODUCTIV_TOSTADO = "LINEA DE TOSTADO";
    // fin
    public static final String TYPE_CONCEPT_PRODUCT = "PRODUCT";
    public static final String TYPE_CONCEPT_CONCEPT = "CONCEPT";
    
    public static final String TITLE_HEADER_HORIZONTAL = "HORIZONTAL";
    public static final String TITLE_HEADER_VERTICAL = "VERTICAL";
    
    public static final String FLAG_ORIGEN_CAJA_EXTERNA = "ORIGEN_EXTERNA";
    public static final String FLAG_ORIGEN_CAJA_INTERNA = "ORIGEN_INTERNA";
    
    public static final String CONNECTION_TYPE_BD_POSTGRES = "POSTGRES";
    public static final String CONNECTION_TYPE_BD_SQLITE = "SQLITE";
    public static final String CONNECTION_TYPE_BD_H2 = "H2";
    
    public static final String FLAG_OUTPUT_NOTHING = "NOTHING";
    public static final String FLAG_OUTPUT_NOTHING_OK = "OK";
    
    public static final String YEAR_CODE_PLUS= "06091980";
    public static final String MONTH_CODE_PLUS= "19800609";
    
    public static final String STORE_SELECTED_SALES = "SELECTED_STORE";
    public static final String STORE_NO_SELECTED_SALES = "NOTHING";    
    public static final String TIPO_MODULO_RESTORANT = "RESTOR";
    public static final String TIPO_MODULO_VENTAS_NORMALES = "SALES_NORMALITY";
    public static final String TYPE_RUBRO_SCREEN_NORMALY = "SCREEN_NORMALITY";
    public static final String TYPE_RUBRO_SCREEN_FERRETERIA = "SCREEN_FERRETERIA";
    
    
    public static final String TIPO_DOCUMENTO_LE = "01";
    public static final String TIPO_DOCUMENTO_LM = "02";
    public static final String TIPO_DOCUMENTO_CE = "03";
    public static final String TIPO_DOCUMENTO_CI = "04";
    // public static final String TIPO_DOCUMENTO_RUC="05";//YA ESTA ARRIBA
    public static final String TIPO_DOCUMENTO_PS = "08";
    public static final String TIPO_DOCUMENTO_PS2 = "24";
    public static final String TIPO_DOCUMENTO_DNI = "09";
    public static final String TIPO_DOCUMENTO_LEM = "10";
    public static final String TIPO_DOCUMENTO_CIP = "25";
    public static final String TIPO_DOCUMENTO_CM = "27";

    public static final String TIPO_PARTICIPANTE_DEUDOR = "1";
    public static final String TIPO_PARTICIPANTE_ACREEDOR = "2";
    public static final String TIPO_PARTICIPANTE_REPRESENTANTE = "3";
    public static final String TIPO_PARTICIPANTE_OTROS = "4";

    public static final String PIE_DE_PAGINA = "LAS NORMAS";
    /**
     * *********************************** CARGA LABORAL
     * ********************************public static final String
     */

    public static final String SEQ_EXT_DOCU_EMI = "SEQ_EXT_TB_DOCU_EMITIDO";

    public static final String SEQ_CERTIFICADO = "SEQ_CERTIFICADO";

    public static final String SEQ_EXT_ENTREGA_CERT = "SEQ_EXT_TB_ENTREGA_CERTFICADO";

    public static final String SEQ_CONTENT = "SEQ_CONTENT";

    /**
     * *************** Roles de los registradores *********************
     */
    public static final String EMISOR = "EM";
    public static final String VERIFICADOR = "VE";

    /**
     * ******************* Para Captcha***************************
     */
    public static final String E70004_ERROR_EN_CAPTCHA = "E70004";

    /**
     * *********Halley Rios 21.08.2014*****************************
     */
    public static final String MSG_NUMERO_FOJAS = "Por favor, ingrese el nï¿½mero de fojas.";

    /**
     * *********gchang 15/10/2014*****************************
     */
    public static final String DE_TIPO_PAGO_LIQUIDACION = "LIQUIDACION";
    public static final String DE_TIPO_PAGO_PRESENTACION = "PRESENTACION";

    public static final String DE_FR_PAGO_TARJETA = "PAGO TARJETA";
    public static final String CAJERO_WEB_PAGO_EN_LINEA = "Web-Pago en Lï¿½nea";
    public static final String TIPO_PAGO_EN_LINEA_PREPAGO = "EN LINEA PREPAGO";
    public static final String GUION_ESPACIOS = " - ";
    public static final String ESPACIO_BLANCO = " ";

    /**
     * **********gchang 16/10/2014*****
     */
    public static final String TITULO_SISTEMA_ID_RPV = "RPV";
    public static final String TITULO_SISTEMA_ID_SIR = "SIR";
    public static final String TT_PAGO_TI_SIS_RPV = "1";
    public static final String TT_PAGO_TI_SIS_SIR = "2";
    /**
     * **********gchang 12/11/2014*****
     */
    public static final String PAGO_TITULOS_LIQUIDADOS = "210"; // para buscar en tabla TM_SERVICIO 

    /*jbalboa 20150415*/
    public static final int SERVICIO_BOLETA_INFORMATIVA_RPV = 219;

}
