import daw.com.Pantalla;
import daw.com.Teclado;

	public class Rectangulo {

		private int base;
		private int altura;
		private Punto centro;
		private int color;
		
		public Rectangulo(int base, int altura, Punto centro, int color) { // Devuelve los datos introducidos por el usuario
			
			this.base = base;
			this.altura = altura;
			this.centro = centro;
			this.color = color;
		}
		
		
		public Rectangulo() { // Devuelve los valores 0
			
			this.base = 0;
			this.altura = 0;
			this.centro = new Punto ();
			this.color = 0;
		}
		
		public Rectangulo (Rectangulo clonado) { // Clonación del objeto rectángulo
			this.base = clonado.base;
			this.altura = clonado.altura;
			this.color = clonado.color;
			this.centro = new Punto(clonado.centro);
		}
		
		public int getBase() { // Coge la base introducida por el usuario
			return base;
		}

		public void setBase(int base) { // Asigna la base introducida al valor base
			this.base = base;
		}

		public int getAltura() { // Coge la altura introducida por el usuario
			return altura;
		}

		public void setAltura(int altura) { // Asigna la altura introducida al valor base
			this.altura = altura;
		}
		
		public Punto getCentro() {
			return centro;
		}

		public void setCentro(Punto centro) {
			this.centro = centro;
		}

		public int getColor() {
			return color;
		}

		public void setColor(int color) {
			this.color = color;
		}
		
		
		public void mostrarDatos()
		{
			centro.mostrarDatos();
			Pantalla.escribirString("Base: " + base);
			Pantalla.escribirSaltoLinea();
			Pantalla.escribirString("Altura: " + altura);
			Pantalla.escribirSaltoLinea();
			Pantalla.escribirString("Color: " + color);
		}
		
		public void cambiarDatos()
		{
			centro.leerDatos();
			setBase (Teclado.leerInt("Base: "));
			setAltura (Teclado.leerInt("Altura: "));
			setColor (Teclado.leerInt("color: "));
			
			Pantalla.escribirSaltoLinea();

			centro.mostrarDatos();
			Pantalla.escribirString("Base: " + base);
			Pantalla.escribirSaltoLinea();
			Pantalla.escribirString("Altura: " + altura);
			Pantalla.escribirSaltoLinea();
			Pantalla.escribirString("Color: " + color);
		}
		
	}

