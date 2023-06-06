/*
 CONTRATO LABORAL OBRA LABOR INGEURBANISMO SAS
 */
package contratolaboralv1;

/**
 * HALORAN E. BARNEY IGLESIAS
 */
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.pdf.PdfPTable;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.ImageIcon;

//metodo constructor - PRIMER PASO
public class ContratoLaboralv1 {

    // crear variables o datos
    //String rutaImagen;
    String fecha;
    String numeroContrato;
    String nombreEmpleador;
    String nitEmpleador;
    String nombreRl;
    String direccionEmpleador;
    String nombreTrabajador;
    String cedulaTrabajador;
    String ciudadTrabajador;
    String direccionTrabajador;
    String telefonoTrabajador;
    String lugarNacimiento;
    String fechaNacimiento;
    String cargo;
    String obra;
    String salario;
    String periodoPago;
    String inicioLabores;
    String finalizacionLabores;
    String emergencia;


    Document documento;
    FileOutputStream archivo;//crea el pdf
    Paragraph titulo1;

    public String getFecha() {
        return fecha;
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public String getNombreEmpleador() {
        return nombreEmpleador;
    }

    public String getNitEmpleador() {
        return nitEmpleador;
    }

    public String getNombreRl() {
        return nombreRl;
    }

    public String getDireccionEmpleador() {
        return direccionEmpleador;
    }

    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public String getCedulaTrabajador() {
        return cedulaTrabajador;
    }

    public String getCiudadTrabajador() {
        return ciudadTrabajador;
    }

    public String getDireccionTrabajador() {
        return direccionTrabajador;
    }

    public String getTelefonoTrabajador() {
        return telefonoTrabajador;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCargo() {
        return cargo;
    }

    public String getObra() {
        return obra;
    }

    public String getSalario() {
        return salario;
    }

    public String getPeriodoPago() {
        return periodoPago;
    }

    public String getInicioLabores() {
        return inicioLabores;
    }

    public String getFinalizacionLabores() {
        return finalizacionLabores;
    }

    public String getEmergencia() {
        return emergencia;
    }

    //aqui la plantila me pide estos datos, es decir crear obteto con los datos.
    public ContratoLaboralv1(String fecha, String numeroContrato, String nombreEmpleador, String nitEmpleador, String nombreRl, String direccionEmpleador, String nombreTrabajador, String cedulaTrabajador, String ciudadTrabajador, String direccionTrabajador, String telefonoTrabajador, String lugarNacimiento, String fechaNacimiento, String cargo, String obra, String salario, String periodoPago, String inicioLabores, String finalizacionLabores, String emergencia) {
        //this.rutaImagen = rutaImagen;
        this.fecha = fecha;
        this.numeroContrato = numeroContrato;
        this.nombreEmpleador = nombreEmpleador;
        this.nitEmpleador = nitEmpleador;
        this.nombreRl = nombreRl;
        this.direccionEmpleador = direccionEmpleador;
        this.nombreTrabajador = nombreTrabajador;
        this.cedulaTrabajador = cedulaTrabajador;
        this.ciudadTrabajador = ciudadTrabajador;
        this.direccionTrabajador = direccionTrabajador;
        this.telefonoTrabajador = telefonoTrabajador;
        this.lugarNacimiento = lugarNacimiento;
        this.fechaNacimiento = fechaNacimiento;
        this.cargo = cargo;
        this.obra = obra;
        this.salario = salario;
        this.periodoPago = periodoPago;
        this.inicioLabores = inicioLabores;
        this.finalizacionLabores = finalizacionLabores;
        this.emergencia = emergencia;

        documento = new Document();
        titulo1 = new Paragraph("CONTRATO INDIVIDUAL DE TRABAJO POR DURACIÓN DE LA OBRA O LABOR CONTRATADA");

    }

    //este metodo es el que crea el pdf con los datos
    public void crearContratoLaboralv1() throws IOException {
        try {
            //Creación del escrito
            archivo = new FileOutputStream(nombreTrabajador + ".pdf");
            PdfWriter writer = PdfWriter.getInstance(documento, archivo);

            //Abrir el documento
            documento.open();
            //String imagePath = "path/to/your/image.png";
            //Image image = Image.getInstance(imagePath);
            //Rectangle pageSize = documento.getPageSize();
            //float x = pageSize.getLeft() + 10;
            //float y = pageSize.getTop() - image.getScaledHeight() - 10;
            //image.setAbsolutePosition(x, y);
            //documento.add(image);
            //TITULO.
            titulo1.setAlignment(1);

            //Image image = null;
            //try{
            //    image = Image.getInstance(rutaImagen);//carga imagen
            //    image.scaleAbsolute(100,100);//cambia tamaño
            //    image.setAbsolutePosition(415,700);//posicion imagen
            //} catch (Exception e) {
            //}
            //documento.add(image); //agrega imagen al documento
            //Grabar contentByte
            //PdfContentByte cb = writer.getDirectContent();
            //Graphics g = cb.createGraphicsShapes(PageSize.LETTER.getWidth(), PageSize.LETTER.getHeight());
            //Font font1 = new Font("Arial", Font.BOLD,11);
            //g.setFont(font1);
            //ImageIcon img1 = new ImageIcon(getClass().getResource("imagenes/Ingeurbanismo.jpg"));
            //g.drawImage(img1.getImage(), 5,5,7,5, null);
            documento.add(titulo1);

            documento.add(Chunk.NEWLINE);

            //Agragar Tabla
            PdfPTable table = new PdfPTable(2);

            table.addCell(new Paragraph("Fecha: \n" + fecha));
            table.addCell(new Paragraph("Numero de Contrato: \n" + numeroContrato));
            table.addCell(new Paragraph("Empleador: \n" + nombreEmpleador));
            table.addCell(new Paragraph("Nit: \n" + nitEmpleador));
            table.addCell(new Paragraph("Representante legal: \n" + nombreRl));
            table.addCell(new Paragraph("Dirección Empleador: \n" + direccionEmpleador));
            table.addCell(new Paragraph("Nombre del Trabajador: \n" + nombreTrabajador));
            table.addCell(new Paragraph("Identificación del Trabajador: \n" + cedulaTrabajador));
            table.addCell(new Paragraph("Ciudad donde Reside: \n" + ciudadTrabajador));
            table.addCell(new Paragraph("Dirección del Trabajador: \n" + direccionTrabajador));
            table.addCell(new Paragraph("Numero Telefonico o Movil del Trabajador: \n" + telefonoTrabajador));
            table.addCell(new Paragraph("Lugar de Nacimiento: \n" + lugarNacimiento));
            table.addCell(new Paragraph("Fecha de nacimiento del Trabajador: \n" + fechaNacimiento));
            table.addCell(new Paragraph("Cargo o labor a desempeñar: \n" + cargo));
            table.addCell(new Paragraph("Obra o Areá destinada: \n" + obra));
            table.addCell(new Paragraph("Salario: \n" + salario));
            table.addCell(new Paragraph("Periodo de pago: \n" + periodoPago));
            table.addCell(new Paragraph("Inicio de labores: \n" + inicioLabores));
            table.addCell(new Paragraph("Finalización de labores: \n" + finalizacionLabores));
            table.addCell(new Paragraph("Contacto de Emergencia: \n" + emergencia));
            documento.add(table);

            documento.add(Chunk.NEWLINE);

            Paragraph texto = new Paragraph("Entre el EMPLEADOR y el EMPLEADO, de las condiciones ya dichas, identificados como aparece al pie de sus firmas, se ha celebrado el presente contrato "
                    + "individual de trabajo por duración de la obra o labor contratada, regido además por las siguientes cláusulas:.\n"
                    + "\n"
                    + "PRIMERA: El trabajador se compromete a colocar al servicio del empleador toda su capacidad normal de trabajo, en forma exclusiva y personal, en el desempeño de las funciones que"
                    + "se le asignen, y especialmente las relacionadas con el cargo y en las labores anexas y complementarias del mismo, de conformidad con las leyes, los reglamentos, las órdenes y "
                    + "las instrucciones generales o particulares que se le impartan, observando en su desempeño la buena fe, el cuidado y diligencia necesarios, durante el tiempo que para su "
                    + "especialidad de trabajo lo requiera la ejecución de la obra ya mencionada, la cual terminada automáticamente dará por terminado el presente contrato..\n"
                    + "\n"
                    + "SEGUNDA: DURACIÓN DEL CONTRATO. El presente contrato se celebra por el tiempo que dure la realización de la obra o labor contratada, de acuerdo con las condiciones generales que"
                    + " se señalan al inicio del presente contrato.\n"
                    + "\n"
                    + "TERCERA: PERÍODO DE PRUEBA. - El presente contrato queda sujeto a un período de prueba equivalente a la quinta parte de duración del presente contrato, sin que sea superior a dos"
                    + " 2 (dos) meses contados a partir de la fecha de la iniciación de la relación laboral, plazo durante el cual cualquiera de las partes podrá darlo por terminado unilateralmente sin"
                    + "previo aviso y sin lugar al pago de indemnización. Si vencido el período de prueba EL EMPLEADO continuare prestando sus servicios con la aceptación expresa o tácita de EL "
                    + "EMPLEADOR, la duración del contrato será por el tiempo que dure la realización de la obra o labor contratada, mientras subsistan las causas que le dieron origen y la materia "
                    + "del trabajo.\n"
                    + "\n"
                    + "CUARTA: EL EMPLEADO laborará durante las horas diarias que como jornada ordinaria le señale EL EMPLEADOR de acuerdo con el Reglamento Interno de Trabajo, sin exceder de cuarenta "
                    + "y ocho (48) horas a la semana, en cualquiera de los turnos u horarios correspondientes a su oficio y además durante el tiempo extraordinario que LA EMPRESA le exija de acuerdo "
                    + "con la Ley.  La labor en tiempo suplementario, siempre que le haya sido previamente autorizado por LA EMPRESA, le será cubierta a la tarifa legal.\n"
                    + "Por el acuerdo expreso o tácito de las partes, podrá repartirse las horas de la jornada ordinaria en la forma prevista en el Art. 164 del C.S.T., modificado por el Artículo 23 de "
                    + "la Ley 50/90, teniendo en cuenta que los tiempos de descanso entre las secciones de la jornada no se computan dentro de la misma, según el Artículo 167 ibídem.\n"
                    + "\n"
                    + "QUINTA: EL EMPLEADOR reconocerá al empleado los viáticos accidentales y los gastos de representación.\n"
                    + "\n"
                    + "SEXTA EL EMPLEADO prestará sus servicios durante todos los días laborables de cada semana y descansará el domingo; pero si por razón de su oficio debe trabajar habitualmente en "
                    + "domingos, tomará un día de descanso compensatorio por cada semana completa de labor, en uno cualquiera de los días laborables de la semana siguiente.  \n"
                    + "\n"
                    + "SEPTIMA: OBLIGACIONES DE EL EMPLEADO- EL EMPLEADO se obliga a:\n"
                    + "1.	A no atender durante las horas de trabajo ocupaciones o asuntos diferentes a los que le encomiende EL EMPLEADOR.\n"
                    + "2.     Abstenerse de cualquier actitud en los compromisos comerciales, personales o en las relaciones sociales, que pueda afectar en forma nociva la reputación del empleador.\n"
                    + "3.	No solicitar préstamos especiales o ayuda económica a los clientes del empleador aprovechándose de su cargo u oficio o aceptarles donaciones de cualquier clase sin la previa autorización escrita del empleador.\n"
                    + "4.	No retirar de las instalaciones donde funcione la empresa elementos, máquinas y útiles de propiedad del empleador sin su autorización escrita.\n"
                    + "5.	No presentar cuentas de gastos ficticias o reportar como cumplidas visitas o tareas no efectuadas.\n"
                    + "6.	No autorizar o ejecutar sin ser de su competencia, operaciones que afecten los intereses del empleador o negociar bienes y/o mercancías del empleador en provecho propio.\n"
                    + "7.	No retener dinero o hacer efectivos cheques recibidos para el empleador.\n"
                    + "8.	Utilizar adecuadamente los implementos de seguridad que EL EMPLEADOR tenga establecidos como tal.\n"
                    + "9.	A trabajar todo el tiempo que sea necesario para cumplir cabalmente sus deberes.\n"
                    + "10. A prestar sus servicios en cualquier otro empleo, cargo u oficio a donde lo promueva EL EMPLEADOR, ya sea en la sede inicial del trabajo o en cualquier otra, donde desarrolle su objeto social; dentro de su poder subordinante, siempre que se respeten las condiciones laborales EL EMPLEADO y no se le causen perjuicios. Todo ello sin que se afecte el honor, la dignidad y los derechos mínimos de EL EMPLEADO.\n"
                    + "11. A guardar confidencialidad, es decir, estricta reserva, sobre todo lo que llegue a su conocimiento por razón de la vinculación laboral y sobre la información a la cual tenga acceso por el desempeño de sus funciones, so pena de incumplir las obligaciones derivadas del presente contrato de trabajo, sin perjuicio de que en su contra se adelanten las acciones legales respectivas e independientemente de la decisión que adopte EL EMPLEADOR frente a su vinculación laboral.\n"
                    + "12. A no ofrecer sus servicios o experiencia profesional a título personal, o los servicios o experiencia profesional de sus amigos, parientes o sociedades con las cuales tenga alguna vinculación, en competencia con los servicios o productos que presta o fabrique EL EMPLEADOR.\n"
                    + "13. A no prestar directa ni indirectamente servicios laborales a otros empleadores, ni a trabajar por cuenta propia en el mismo oficio, durante la vigencia de este contrato. \n"
                    + "14. A no utilizar los recursos humanos, físicos, financieros e información en general de EL EMPLEADOR para beneficio propio o de terceros.\n"
                    + "15. A no hacer negocio con los productos que por ocasión de su vinculación laboral usted adquiera a un precio más favorable que en el comercio.\n"
                    + "16. Planear, organizar, dirigir, coordinar, controlar y supervisar el trabajo de cada uno de sus subalternos con el fin de que se realicen las labores de dentro de las normas de EL EMPLEADOR.\n"
                    + "17. Aplicar las políticas, los reglamentos, las normas y procedimientos de EL EMPLEADOR.\n"
                    + "18. Mantener la disciplina y comunicación dentro del grupo puesto bajo sus órdenes.\n"
                    + "19. Abstenerse de solicitar en préstamo dinero a sus subalternos.\n"
                    + "20. Asistir a las capacitaciones a las que sea enviado por EL EMPLEADOR.\n"
                    + "21. Sólo instalar software que cuenten con la debida licencia de uso en los computadores de la empresa o en uno de su propiedad que se encuentre dentro de las instalaciones de EL EMPLEADOR.\n"
                    + "22. No instalar software en los computadores de EL EMPLEADOR así cuenten con la licencia otorgada por el fabricante en los términos de ley, sin autorización expresa.\n"
                    + "23. Sólo utilizar la red de Internet dispuesta por EL EMPLEADOR para los fines propios del desempeño de su cargo, incluida la utilización de la cuenta de correo electrónico dispuesta por EL EMPLEADOR para el ejercicio de sus funciones.\n"
                    + "24. No dar a conocer a personas no autorizadas la clave personal de acceso a los sistemas de cómputo de EL EMPLEADOR, ni utilizar las claves de acceso de otros empleados.\n"
                    + "25. No ingresar equipos de cómputo a las instalaciones de EL EMPLEADOR sin autorización expresa.\n"
                    + "\n"
                    + "PARÁGRAFO. - Las faltas anteriormente indicadas no son taxativas dentro de los motivos de despido con justa causa, pues también tendrán aplicación para tal fin las que se desprendan de las normas legales.\n"
                    + "\n"
                    + "NOVENA: Los dineros que el trabajador reciba ocasionalmente o en forma habitual, o por mera liberalidad, por concepto de primas, alimentación, viáticos, bonificación por las tareas, participación de utilidades no constituirán salario, ni se computarán como factor salarial de acuerdo a los artículos 15 y 16 de la Ley 50/90, ya que se entiende que dichos pagos son un medio para facilitar la prestación del servicio y para desempeñar a cabalidad las funciones.\n"
                    + "\n"
                    + "PARÁGRAFO PRIMERO.- Las partes acuerdan que ninguno de los pagos enumerados en el artículo 128 del C. S. T., subrogado por el artículo 15 de la Ley 50/90, tiene carácter de salario, incluidos aquellos pagos que se hagan por concepto de alimentación, vestuario y/o gasolina y demás con base en \"vales canasta\" para compra de productos en supermercados u otros establecimientos, aquellas que ocasionalmente y por mera liberalidad reciba el EMPLEADO de EL EMPLEADOR como bonificaciones, gratificaciones ocasionales, y el general todo aquello que reciba en dinero o en especie, que no sea para su beneficio, ni para enriquecer su patrimonio, sino para desempeñar a cabalidad sus funciones tales como gastos de representación, ropa de trabajo, dotación, transporte, elementos de trabajo, alimentación que le vende EL EMPLEADOR a bajo precio, los servicios y auxilios que reciban sus familiares tales como servicios médicos, auxilios para drogas, becas, auxilio de fondo quirúrgico, auxilio de escolaridad, y en general, cualquier servicio o beneficio que reciba él o sus familiares. También convienen expresamente las partes que de conformidad con la misma norma, no constituyen factor salarial para efectos de liquidación de prestaciones sociales, reconocimiento de indemnizaciones, ni para ningún otro efecto, los gastos de transporte, gastos de viaje y las sumas destinadas a manutención y alojamiento cuando EL EMPLEADO deba desplazarse de su sede habitual de trabajo, los gastos sufragados con tarjetas de crédito empresariales, acciones, cuotas de sostenimiento y consumos de clubes sociales, gastos de relaciones públicas, las primas de los seguros de vida, accidentes, cirugía y hospitalización, etc. canceladas por EL EMPLEADOR en beneficio de los EMPLEADOS, auxilios para compra de anteojos o lentes de contacto y cambio de lentes, por nacimiento de hijos, por fallecimiento de familiares, regalo de bodas, gastos funerarios de los EMPLEADOS  la alimentación, habitación y vestuario reconocidas en dinero o en especie, ni los demás beneficios o auxilios habituales u ocasionales que en forma extralegal llegue a conceder EL EMPLEADOR a sus empleados incluidas las bonificaciones por incremento en las operaciones. Así mismo, también se deja expresa constancia de que el cargo que desempeñará EL EMPLEADO no genera viáticos permanentes que puedan constituir salario.\n"
                    + "\n"
                    + "PARÁGRAFO SEGUNDO.- Igualmente las partes dejan expresa constancia que los pagos de acciones de clubes, los gastos telefonía celular o de cualquier otro medio de comunicación, los gastos de transporte, los gastos de viaje y las sumas destinadas a manutención y alojamiento de EL EMPLEADO cuando deba desplazarse de su sede habitual de trabajo, y que sean cancelados por EL EMPLEADOR no constituirán salario toda vez que los mismos no tienen por efecto remunerar la prestación del servicio sino disponer los medios necesarios para que este pueda prestarse.\n"
                    + "\n"
                    + "DÉCIMA: EL EMPLEADO autoriza expresamente a EL EMPLEADOR para que, al finalizar este contrato por cualquier causa, deduzca y compense de las sumas que le correspondan por concepto de salarios, prestaciones e indemnizaciones de carácter laboral, las cantidades y saldos pendientes a su cargo y a favor de ella, por razón de préstamos personales o de vivienda, valor de facturas por suministro de drogas, víveres o mercancías que haya recibido a crédito, o por cualquiera otra causa.\n"
                    + "\n"
                    + "DÉCIMA PRIMERA: Hace parte de este contrato el manual de funciones y procesos establecidos para el cargo.\n"
                    + "\n"
                    + "DÉCIMA SEGUNDA: El trabajador (a) declara expresamente que fue notificado y acepta que la dirección y número telefónico suministrados por el (ella) en el presente contrato de trabajo es su domicilio y residencia principal y que allí se le puede enviar cualquier correspondencia que fuere necesaria, que en caso de traslado de dirección informará por escrito dentro de los cinco (5) primeros días hábiles a la fecha en que se produzca su traslado. \n"
                    + "\n"
                    + "DÉCIMA TERCERA: El presente contrato reemplaza en su integridad y deja sin efecto cualquiera otro contrato verbal o escrito celebrado entre las partes con anterioridad.  Las modificaciones que se acuerden al presente contrato se anotarán a continuación de su texto.\n"
                    + "\n"
                    + "DÉCIMA CUARTA: Las modificaciones al presente contrato podrán elaborarse en una hoja anexa a este documento, la cual hará parte del mismo y donde deberán consignarse los nombres y firmas de las partes contratantes, su documento de identidad y fecha en que se efectué la modificación.\n"
                    + "\n"
                    + "DÉCIMA QUINTA: Este contrato ha sido redactado estrictamente de acuerdo con la Ley y la Jurisprudencia y será interpretado de buena fe y en consonancia con el C.S.T., cuyo objeto, definido en su Artículo 1º, es lograr en las relaciones entre EL EMPLEADOR y LOS EMPLEADOS dentro de un espíritu de coordinación económica y equilibrio social.\n"
                    + "\n"
                    + "El presente contrato ha sido discutido libremente por las partes, las cuales aprueban todas las estipulaciones que lo conforman y en consecuencia para constancia se firma en dos o más ejemplares del mismo tenor y valor, ante testigos, un ejemplar de los cuales recibe EL EMPLEADO en este acto.\n"
                    + "\n"
                    + "FIRMA DEL EMPLEADOR                        FIRMA Y CEDULA DEL TRABAJADOR\n"
                    + "\n"
                    + "_______________________________         ______________________________"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "ANEXO 1 AL CONTRATO DE TRABAJO\n"
                    + "\n"
                    + "PARA: NUEVO TRABAJADOR\n"
                    + "ASUNTO: REQUISITOS PARA SU VINCULACIÓN AL SISTEMA DE SEGURIDAD SOCIAL COTIZANTE Y BENEFICIARIOS (ARP, EPS, AFP, CCF)\n"
                    + "\n"
                    + "1.	3 fotocopias ampliadas legibles de la cedula de ciudadanía \n"
                    + "2.	Certificado de afiliación EPS a la que pertenece\n"
                    + "3.	Certificado de Fondo de pensión al que pertenece\n"
                    + "PAPELERIA BENEFICIARIOS\n"
                    + "4.	3 fotocopias de la cedula del cónyuge o compañero (a) permanente\n"
                    + "5.	2 certificados de matrimonio registrado ante notaria o declaración extra juicio (si no existe matrimonio legal, con una vigencia no mayor a tres (3) meses).\n"
                    + "6.	2 registros civiles de cada uno de los hijos: estos registros deben tener NUIP y para mayores de 10 años se debe enviar también la tarjeta de identidad, sino la sacan en la región enviar certificado donde conste esto.\n"
                    + "7.	1 certificado de estudio original para cada uno de los hijos mayores de 12 años\n"
                    + "8.	Cuando los hijos son mayores de 18 años es necesario: 2 certificados de estudio originales, 2 registros civiles, 2 fotocopias de la cédula (solo para EPS).  Recuerde que por ley los hijos mayores de 18 años no reciben cuota monetaria de la caja de compensación.\n"
                    + "9.	Para afiliar padres mayores de 60 años: registro civil de nacimiento del Trabajador, fotocopias de cedula de los padres, certificado de supervivencia y certificado de dependencia económica ante notaria.\n"
                    + "10.	 Si es soltero puede afiliar a los padres a la EPS y Caja de compensación es necesario: Registro civil de nacimiento del trabajador, fotocopias de la cedula de los padres y certificado extra juicio de dependencia económica y supervivencia ante notaria.\n"
                    + "Certifico que fui notificado de estos requisitos, por lo tanto, es mi responsabilidad presentar dicha documentación y en caso de no hacerlo, mi empleador queda exonerado de cualquier reclamación.\n"
                    + "\n"
                    + "FIRMA Y CEDULA DEL TRABAJADOR\n"
                    + "\n"
                    + "_________________________________"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "ANEXO 2 AL CONTRATO DE TRABAJO\n"
                    + "INDUCCIÓN Y SALUD OCUPACIONAL\n"
                    + "\n"
                    + "El trabajador declara expresamente que asistió a la charla de inducción y Salud Ocupacional donde se le explican: el reglamento interno de trabajo, el reglamento de higiene y seguridad industrial, matriz de riesgos laborales de la empresa, las normas, procedimientos y cuidados inherentes a su cargo.\n"
                    + "\n"
                    + "De igual manera declara que recibió por parte de la empresa los elementos de protección personal requeridos para desarrollar su cargo y que recibió la capacitación respectiva acerca de su uso. Declara que está obligado a utilizarlos y que cualquier accidente de trabajo que ocurra por no utilizarlos correrá por su cuenta y a riesgo propio, en tanto la empresa quedará exonerada y no tendrá ninguna responsabilidad.\n"
                    + "\n"
                    + "FIRMA Y CEDULA DEL TRABAJADOR\n"
                    + "\n"
                    + "_________________________________");

            texto.setAlignment(Element.ALIGN_JUSTIFIED);
            documento.add(texto);

            documento.add(Chunk.NEWLINE);

            documento.close();
            System.out.println("Archivo creado correctamente");

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (DocumentException e) {
            System.err.println(e.getMessage());
        }
    }

}

//ERRORES: Cannot invoke "java.io.OutputStream.write(byte[], int, int)" because "this.out" is null
//ERRORES: "com.lowagie.text.Element.type()" because "<parameter1>" is null
