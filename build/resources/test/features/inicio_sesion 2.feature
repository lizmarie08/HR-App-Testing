# language: es

Característica: Funcionalidad de Inicio de Sesión y Gestión de Cuentas en una Aplicación de Tablero Kanban

  @escenario01
  Escenario: Iniciar Sesión con Credenciales Válidas
    Dado sergey está en la página de inicio de sesión
    Cuando ingresa el nombre de usuario "Admin" y la contraseña "admin123"
    Entonces debería estar en su panel de control

  @escenario02
  Escenario: Iniciar Sesión con Credenciales Incorrectas
    Dado Sergey está en la página de inicio de sesión
    Cuando ingresa el nombre de usuario "lizmarie@sjdhf.com" y la contraseña "sjsdsskk"
    Entonces debería ver un mensaje de error que dice "Invalid credentials"

#  @escenario03
#  Escenario: Mostrar Contraseña
#    Dado Sergey está en la página de inicio de sesión
#    Cuando ingresa el nombre de usuario "lizmarie@sjdhf.com" y la contraseña "sjsdsskk"
#    Y hace clic en el enlace "Show Password"
#    Entonces debería ver su contraseña en texto claro
#
#  @escenario04
#  Escenario: Olvidé mi Contraseña
#    Dado Sergey está en la página de inicio de sesión
#    Cuando ingresa el nombre de usuario "cbarahona@calengs.com" y la contraseña "testenvpass"
#    Y hace clic en el enlace Olvidé mi Contraseña
#    #Entonces debería recibir un correo electrónico de recuperación de contraseña
#
#  @escenario05
#  Esquema del escenario: Crear una Cuenta Nueva
#    Dado Sergey está en la página de registro
#    Cuando completa el formulario de registro con su nombre "<nombre>", apellido "<apellido>", correo electrónico "<correoElectronico>" y contraseña "<contrasena>"
#    Y hace clic en el botón "Registrarse"
#    #Entonces debería estar en su panel de control
#    Ejemplos:
#      | nombre        | apellido      | correoElectronico   | contrasena |
#      | NombreEjemplo1 | ApellidoEjemplo1 | correo1@example.com | Pass1     |
#      | NombreEjemplo2 | ApellidoEjemplo2 | correo2@example.com | Pass2     |
#
