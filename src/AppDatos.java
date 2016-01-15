import javax.swing.JOptionPane;

/**
 * 
 * @author Jonathan Lozano
 *
 */
public class AppDatos {

	/**
	 * 
	 * @param args
	 *            Se crea un objeto de la clase Alumno y asignan valores por
	 *            defecto al constructor para despues imprimir la informacion en
	 *            un mensaje emergente
	 */
	public static void main(String[] args) {
		Alumno al = new Alumno("Jonathan", "Lozano Hernandez", "21", "7791021966", "Fracc. Haciendas de Tizayuca",
				"masculino", "jon_2194@hotmail.com", "TIC", "2513260050", "Noveno");

		JOptionPane.showMessageDialog(null,
				String.format(
						"Hola %s tus datos son\nEdad: %s\nTelefono: %s\nDireccion: %s\nSexo: %s\nMail: %s\nCarrera: %s\nCuatrimestre: %s",
						al.getNombre(), al.getEdad(), al.getTelefono(), al.getDireccion(), al.getSexo(), al.getMail(),
						al.getCarrera(), al.getCuatrimestre()));
	}

}
