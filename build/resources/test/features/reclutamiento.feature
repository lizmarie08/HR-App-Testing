# language: es

Característica: Funcionalidad de reclutamiento en una aplicacion de recursos humanos

  @escenario04
  Escenario: Agregar nueva vacante
    Dado sergey está en la página de inicio de sesión
    Cuando ingresa el nombre de usuario "Admin" y la contraseña "admin123"
    Y ingreso a la opcion de reclutamiento de vacante
    Y ingreso los datos del nuevo vacante
| Vacancy Name       | Job Title                 | Description | Hiring Manager     | Number  |
| vacante1           | GERENTE PRINCIPAL         | sdasda      | Aaliyah Haq      | 4       |
    Entonces se debe mostrar los datos completados de la vacante correctamente



  @escenario05
  Escenario: Agregar nuevo candidato
    Dado sergey está en la página de inicio de sesión
    Cuando ingresa el nombre de usuario "Admin" y la contraseña "admin123"
    Y ingreso a la opcion de reclutamiento de candidatos
    Y ingreso los datos del nuevo candidato
      | Primer Nombre | Segundo Nombre | Apellido | Email                  | Número de Contacto | Curriculum   | Fecha de Nacimiento | Nota de Prueba |
      | Juan           | Carlos         | Pérez    | juan.carlos@email.com  | 123456789         | src/test/resources/files/1LS242_Feriz_Lizmarie_Tarea1.pdf | 01/01/1990           | Esta es una nota |
    Entonces se debe mostrar los datos del candidato completados correctamente