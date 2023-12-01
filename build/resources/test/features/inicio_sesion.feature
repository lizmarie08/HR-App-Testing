# language: es

Característica: Funcionalidad de Inicio de Sesión y Gestión de Cuentas en una Aplicación de recursos humanos

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

  @escenario03
  Escenario: Olvidé mi Contraseña
    Dado Sergey está en la página de inicio de sesión
    Cuando ingresa el nombre de usuario "lizmarie@sjdhf.com" y la contraseña "sjsdsskk"
    Y hace clic en el enlace Olvidé mi Contraseña
    Y ingresa el nombre de usuario "admin"
    Entonces debería recibir un correo electrónico de recuperación de contraseña
