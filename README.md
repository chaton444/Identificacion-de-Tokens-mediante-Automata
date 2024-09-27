# Proyecto de Identificación de Tokens mediante Autómata 🤖

Este proyecto tiene como objetivo implementar un autómata que identifique y clasifique tokens en archivos de texto. La aplicación desarrollada permite a los usuarios cargar un archivo de texto que contiene una serie de tokens, los cuales son analizados y reportados por el sistema.

## Características del Proyecto

- **Palabras Reservadas y Tokens**: 
  - El autómata identifica palabras reservadas (como `if`, `else`, `for`, etc.) y diferentes tipos de tokens, incluyendo:
    - Identificadores
    - Operadores relacionales ( `<`, `<=`, `>`, `>=`, `==`, `!=` )
    - Operadores lógicos ( `&&`, `||`, `!` )
    - Operadores aritméticos ( `+`, `-`, `*`, `/`, `%` )
    - Números enteros y decimales (negativos y positivos)
    - Cadenas de caracteres (formato "Cualquier carácter")
    - Comentarios (bloque `/* */` y línea `//`)
  
- **Entrada y Análisis**: 
  - La aplicación recibe un archivo externo (.txt) y analiza su contenido carácter por carácter. 
  - Los tokens están separados por espacios en blanco, tabuladores o saltos de línea. 
  - El sistema es capaz de detectar tokens erróneos, generando un reporte detallado al finalizar el análisis.

- **Interfaz Visual**: 
  - Se proporciona una interfaz de usuario intuitiva que permite cargar el archivo de texto, visualizar y modificar su contenido directamente desde la aplicación.

- **Lenguaje de Programación**: 
  - El proyecto puede ser desarrollado en un lenguaje de elección (Java, Python, C#, etc.), con la condición de que la interfaz sea visual y el análisis de tokens se realice utilizando un autómata, evitando el uso de expresiones regulares.


## Entrega

El proyecto incluye todos los códigos desarrollados y está preparado para ser entregado de acuerdo con las pautas establecidas.

## Autores

- Fernando Leon Medina
- Alejandro Valenzuela
