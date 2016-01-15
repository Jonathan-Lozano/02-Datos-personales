/**
 * 
 * @author Jonathan Lozano
 *
 */
public class Alumno {

	private String nombre;
	private String apellidos;
	private String edad;
	private String telefono;
	private String direccion;
	private String sexo;
	private String mail;
	private String carrera;
	private String matricula;
	private String cuatrimestre;

	/**
	 * Constructor vacio
	 */
	public Alumno() {
	}

	/**
	 * 
	 * Constructor con los siguientes parametros
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param edad
	 * @param telefono
	 * @param direccion
	 * @param sexo
	 * @param mail
	 * @param carrera
	 * @param matricula
	 * @param cuatrimestre
	 * 
	 *            Datos de alumno en formato String
	 */
	public Alumno(String nombre, String apellidos, String edad, String telefono, String direccion, String sexo,
			String mail, String carrera, String matricula, String cuatrimestre) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.telefono = telefono;
		this.direccion = direccion;
		this.sexo = sexo;
		this.mail = mail;
		this.carrera = carrera;
		this.matricula = matricula;
		this.cuatrimestre = cuatrimestre;
	}

	/**
	 * 
	 * @return devuelve el nombre del alumno en formato String
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 *            Recibe el nombre del alumno
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * 
	 * @return Devuelve la edad del alumno en formato string
	 */
	public String getEdad() {
		return edad;
	}

	/**
	 * 
	 * @param edad
	 *            Recibe la edad del alumno
	 */
	public void setEdad(String edad) {
		this.edad = edad;
	}

	/**
	 * 
	 * @return Devuelve el telefono del alumno
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * 
	 * @param telefono
	 *            Recibe el telefono del alumno
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * 
	 * @return Devuelve los apellidos del alumno
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * 
	 * @param apellidos
	 *            Recibe los apellidos del alumno
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * 
	 * @return Devuelve la direccion del alumno
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * 
	 * @param direccion
	 *            Recibe la direccion del alumno
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * 
	 * @return Devuelve el sexo del alumno
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * 
	 * @param sexo
	 *            Recibe el sexo del alumno
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * 
	 * @return Devuelve el mail del alumno
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * 
	 * @param mail
	 *            Recibe el mail del alumno
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * 
	 * @return Devuelve la carrera del alumno
	 */
	public String getCarrera() {
		return carrera;
	}

	/**
	 * 
	 * @param carrera
	 *            Recibe la carrera del alumno
	 */
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	/**
	 * 
	 * @return Devuelve la matricula del alumno
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * 
	 * @param matricula
	 *            Revibe la matricula del alumno
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * 
	 * @return Devuelve el cuatrimestre del alumno
	 */
	public String getCuatrimestre() {
		return cuatrimestre;
	}

	/**
	 * 
	 * @param cuatrimestre
	 *            Recibe el cuatrimestre del cuatrimestre
	 */
	public void setCuatrimestre(String cuatrimestre) {
		this.cuatrimestre = cuatrimestre;
	}
}