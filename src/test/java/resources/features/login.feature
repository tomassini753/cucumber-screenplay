#language:es
  Característica: Validar el correcto funcionamiento del login panel

    Esquema del escenario: : Login correcto de usuario
    Dado El usuario ingresa a la pagina principal de orangehrm
    Cuando El usuario ingresa un usuario <usuario> y contrasenia <contrasenia> correcta
    Entonces Se muestra la pantalla principal del usuario
    Ejemplos:
    | usuario | contrasenia |
    | Admin   | admin123    |

    Escenario: : Login incorrecto de usuario
    Dado El usuario ingresa a la pagina principal de orangehrm
    Cuando El usuario ingresa un usuario y contrasenia incorrecto
    Entonces Se muestra un mensaje indicando que el logeo es incorrecto

    Esquema del escenario: : Outline: Logout correcto
    Dado El usuario ingresa a la pagina principal de orangehrm
    Cuando El usuario se loguea correctamente <usuario> <contrasenia>
    Y Se desloguea
    Entonces Se muestra la pantalla de login
    Ejemplos: :
    | usuario | contrasenia |
    | Admin   | admin123    |