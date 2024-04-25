package Act_Evaluable;

public class Calendario {

	private int año;
	private int mes;
	private int dia;
	/**
	 * Constructor calendario  si la fecha es correcta se inicializan sus valores
	 * fecha es correcta
	 * Si la fecha no es correcta, se inicializa a 1/1/1
	 */
	public Calendario(int año, int mes, int dia) {
		if (fechaCorrecta(año, mes, dia)) { // 
			this.año = año;
			this.mes = mes;
			this.dia = dia;
		} else { 
			this.año = 1;
			this.mes = 1;
			this.dia = 1;
		}
	}

	/**
	 * metodos de incremento de año, mes y día.
	 * Todos funcionan de la misma manera, con un IF else.
	 */
	public void incrementarDia() {
		dia++;
		if (!fechaCorrecta(año, mes, dia)) {
			dia = 1;
			mes++;
			if (!fechaCorrecta(año, mes, dia)) {
				mes = 1;
				año++;
			}
		}
	}

	public void incrementarMes() {
		mes++;
		if (!fechaCorrecta(año, mes, dia) && mes >= 1 && mes <= 12) {
			dia = 1;
			mes++;
		} else {
			mes = 1;
			año++;
		}
	}

	public void incrementarAño(int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			año++;
			if (año == 0) {
				año++;
			}
		}
	}

	public boolean iguales(Calendario otraFecha) {
		boolean igual = (año == otraFecha.año && mes == otraFecha.mes && dia == otraFecha.dia);
		return igual;
	}

	/**
	 * Método privado (solo se puede usar dentro de la clase) que comprueba si una
	 * fecha es correcta
	 */
	private boolean fechaCorrecta(int año, int mes, int dia) {
		boolean fechaCorrecta;
		int diasMaxMes = switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12 -> {
			yield 31;
		}
		case 2 -> {
			yield 28;
		}
		case 4, 6, 9, 11 -> {
			yield 30;
		}
		default -> {
			yield -1;
		}
		};
		/**
		 * Primer IF El unico año que no existe es el 0.
		 * Segundo IF comprobamos si el dia es correcto.
		 */
		if (año == 0) {  
			fechaCorrecta = false;
		} else { 
			if (1 <= dia && dia <= diasMaxMes) {
				fechaCorrecta = true;
			} else {
				fechaCorrecta = false;
			}
		}
		return fechaCorrecta;
	}

	public int getAño() {
		return año;
	}

	public int getMes() {
		return mes;
	}

	public int getDia() {
		return dia;
	}
}
