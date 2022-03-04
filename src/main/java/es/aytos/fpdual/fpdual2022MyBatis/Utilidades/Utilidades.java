package es.aytos.fpdual.fpdual2022MyBatis.Utilidades;

import java.util.Random;

public class Utilidades {

	private final static Integer D4 = 4;
	private final static Integer D6 = 6;
	private final static Integer D8 = 8;
	private final static Integer D10 = 10;
	private final static Integer D12 = 12;
	private final static Integer D20 = 20;
	private final static Integer D100 = 100;
	private static final int CODIGO_ANDORRA = 2;
	private static final int CODIGO_GIBRALTAR = 3;
	private static final int CODIGO_LUXEMBURGO = 4;
	private static final int CODIGO_ISLAS_BERMUDAS = 5;
	private static final int CODIGO_IRLANDA = 6;
	private static final String RESIDENCIA_EN_SPAIN = "240";
	private static final String RESIDENCIA_EN_EXTRANJERO = "100";
	public static final Integer TOPE_DIAS_MAXIMO_EN_SPAIN_PARA_NO_DECLARAR = 100;

	// Se pone static para que el usuario no la use, asi no puede introducir
	// cualquier numero, encapsulamiento, tema de instanciacios de clases
	// Te libra de poner Utilidades = New Utilidades, y con poner
	// Utilidades.funcion() ya valdría
	private static String tirar1dX(Integer x) {
		return String.valueOf(new Random().nextInt(x) + 1);
	}

	public static String tirar1d4() {
		return tirar1dX(D4);
	}

	public static String tirar1d6() {
		return tirar1dX(D6);
	}

	public static String tirar1d8() {
		return tirar1dX(D8);
	}

	public static String tirar1d10() {
		return tirar1dX(D10);
	}

	public static String tirar1d12() {
		return tirar1dX(D12);
	}

	public static String tirar1d20() {
		return tirar1dX(D20);
	}

	public static String tirar1d100() {
		return tirar1dX(D100);
	}

	public static String obtenerPaisResidencia() {
		String paisResidencia = "ESPAÑA";
		Integer pais = Integer.valueOf(tirar1d6());

		switch (pais) {
		case CODIGO_ANDORRA:
			paisResidencia = "ANDORRA";
			break;

		case CODIGO_GIBRALTAR:
			paisResidencia = "GIBRALTAR ESPAÑOL";
			break;
		case CODIGO_LUXEMBURGO:
			paisResidencia = "LUXEMBURGO";
			break;
		case CODIGO_ISLAS_BERMUDAS:
			paisResidencia = "ISLAS BERMUDAS";
			break;
		case CODIGO_IRLANDA:
			paisResidencia = "IRLANDA";
			break;

		default:
			paisResidencia = "ESPAÑA";
			break;
		}
		return paisResidencia;
	}
	
	private static boolean resideEnSpain() {

		return !"1".equals(tirar1d8());
	}
	
	public static String obtenerDiasResidencia() {
		
		if (resideEnSpain()) {
			return RESIDENCIA_EN_SPAIN;
		}
		return RESIDENCIA_EN_EXTRANJERO;
	}

	

	public static String sqlTratarTexto(String cadena) {
		return "'" + cadena + "'";
	}

	public static Integer getTopeDiasMaximoEnSpainParaNoDeclarar() {
		return TOPE_DIAS_MAXIMO_EN_SPAIN_PARA_NO_DECLARAR;
	}

	
}
