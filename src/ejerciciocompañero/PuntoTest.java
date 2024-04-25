package Act_Evaluable;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PuntoTest {

	

	    @Test
	    void Punto() {

	        Punto p = new Punto(2, 2);

	        assertEquals(p.getX(), 2);
	        assertEquals(p.getY(), 2);

	    }
	    @Test
		public void testX() {
			Punto p = new Punto(2, 2);
			assertEquals(p.getX(), 2);
		}
	    
	    @Test
		public void testY() {
			Punto p = new Punto(2, 2);
			assertEquals(p.getX(), 2);
		}
		
		@Test
		public void desplazaX() {
			Punto p = new Punto(2,2);
			assertEquals(p.getX(), 2);
		}
		
		@Test
		public void desplazaY () {
			Punto p = new Punto(2,2);
			assertEquals(p.getY(), 2);
		}
		
		@Test
		public void desplaza() {
			Punto p = new Punto(2,2);
			p.desplaza(2, 2);
			assertEquals(p.getX(), 4);
			assertEquals(p.getY(), 4);
		}
	    
	    @Test
	    public void testDistanciaEuclidea() {
	    	// P1(X)=2,3 P2(Y)=4,5
	        double x1 = 2; 
	        double y1 = 4; 
	        double x2 = 3; 
	        double y2 = 5;
	     
	        double diferenciaX = x2 - x1; 
	        double diferenciaY = y2 - y1; 
  
	        double diferenciaXCuadrado = Math.pow(diferenciaX, 2); 
	        double diferenciaYCuadrado = Math.pow(diferenciaY, 2); 

	        double sumaCuadrados = diferenciaXCuadrado + diferenciaYCuadrado; 
 
	        double distancia = Math.sqrt(sumaCuadrados);  
 
	        assertEquals(distancia, 2.8284271247461903, 0.000001);
	    }
	    }
	    
