# 7A_Automatas
 
Repositorio de ejercicios y actividades de la materia Lenguajes y Autómatas 2.
En este segundo parcial aprendiendo la competencia dos con ejercicios enfocados en el desarrollo de analizadores léxicos (lexers) usando **ANTLR4** con Python como lenguaje de destino(y un poquitin de Java).
 
Cada ejercicio define una gramática (`Expr.g4`), la compila con ANTLR4 para generar el lexer/parser en Python, y corre un script (`test.py`) o (`main.py`) (para los ejercicios de POO)
que lee una expresión (desde archivo y/o desde teclado) y muestra la tabla de tokens reconocidos (lexema, token, tipo, línea y columna).
 
Esta guía la hicimos pensando en alguien que nunca ha usado ANTLR ni ha clonado un repositorio, así que incluye todos los pasos desde cero.
También si no han usando Java, Python, Streamlit que es lo que hemos estado viendo en esta competencia 2.

---
 
## Requisitos previos que consideramos necesarios
 
Antes de clonar el repositorio, instala lo siguiente en tu computadora (Windows, con PowerShell):
 
1. **Git** – para clonar el repositorio.
   Descarga: https://git-scm.com/downloads
2. **Java (JDK 11 o superior)** – ANTLR4 está escrito en Java y lo necesita para generar el lexer/parser.
   Descarga: https://www.oracle.com/java/technologies/downloads/ (o usa `winget install EclipseAdoptium.Temurin.17.JDK`)
   Si tu computadora ya cuenta con JAVA este paso no sera necesario, solo debes verificar que este instalado con el siguiente
   comando:
   
```powershell
   java -version
```
 
3. **Python** (Recomendamos la versión mas reciente).
   Descarga: https://www.python.org/downloads/
   Comando para verificar la instalación o la version que tienes instalada:
```powershell
   py --version
```
 
4. **El archivo `antlr-4.13.x-complete.jar`**
   Descárgalo desde: https://www.antlr.org/download.html
   Guárdalo en una carpeta fija, por ejemplo `C:\antlr\antlr-4.13.2-complete.jar` o si prefieres una dentro de tu proyecto.
   Pero es más recomendable dejarla fija como el ejemplo.
   
5. **El paquete `antlr4-runtime` de Python**, necesario para que los scripts `.py` generados puedan ejecutarse:
```powershell
   pip install antlr4-python3-runtime
```
 
6. *(Opcional pero recomendado)* **Visual Studio Code** con la extensión **ANTLR4 grammar syntax support**,
   para poder abrir y editar los archivos `.g4` con resaltado de sintaxis.
   Descarga: https://code.visualstudio.com/
---
 
## Configurar la variable de entorno de ANTLR
 
Para no escribir la ruta completa del `.jar` cada vez, se recomienda crear una variable de entorno temporal en PowerShell (dura mientras la terminal esté abierta):
 
```powershell
$env:ANTLR_JAR = "C:\antlr\antlr-4.13.2-complete.jar"
```
 
Si cierras la terminal, tendrás que volver a ejecutar esta línea. Si quieres que sea permanente, puedes agregarla a tu perfil de PowerShell (`$PROFILE`) o
crear la variable desde "Variables de entorno" en Windows.
 
---
 
## Clonar el repositorio
 
Abre PowerShell en la carpeta donde quieras guardar el proyecto, verifica que no tengas inicializado otro reporsitorio porque sino podria
generarte problemas más adelante, si esta vacia de repositorios ejecuta:
 
```powershell
git clone https://github.com/Shinon16/7A_Automatas.git 
--Con este comando clonaras el repositorio con https, pero en github tambien puedes clonar con SSH
cd 7A_Automatas
```
 
Esto descargará todo el proyecto, incluida la carpeta `Competencia2` con todos los ejercicios.

---
 
## Estructura del repositorio
 
```
7A_Automatas/
├── Competencia2/
│   ├── Ejercicio1/
│   │   ├── Expr.g4        <- Gramática (reglas léxicas y sintácticas)
│   │   ├── ExprLexer.py    <- Generado automáticamente por ANTLR (no se edita a mano)
│   │   ├── ExprParser.py   <- Generado automáticamente por ANTLR (no se edita a mano)
│   │   ├── test.py         <- Script que ejecuta el lexer y muestra la tabla de tokens en algunos se llama text.py (deuda tecnica de Clau, 'error de dedo')
│   │   └── prueba.txt      <- Archivo de ejemplo con una expresión de entrada
│   ├── Ejercicio2/
│   ├── Ejercicio3/
│   ├── ...
│   └── Ejercicio10/
├── POO/                    <- Ejercicios de Programación Orientada a Objetos (solo Python)
│   └── Ejercicio11/
│   ├── Ejercicio12/
│   ├── Ejercicio13/
│   ├── ...
│   └── Ejercicio15/
├── Streamlit/              <- Ejercicios con interfaz web usando Streamlit
│   └── Ejercicio11/
│   ├── Ejercicio12/
│   ├── Ejercicio13/
│   ├── ...
│   └── Ejercicio15/
└── README.md
```
 
Cada carpeta `Ejercicio#` dentro de `Competencia2` es independiente y sigue el mismo patrón: una gramática, un ejercicio distinto en cada carpeta Las carpetas `POO/` y `Streamlit/` se explican más abajo.
 
---
 
## Cómo ejecutar un ejercicio (paso a paso)
 
Los pasos son los mismos para cualquier ejercicio, solo cambia el número de carpeta. Usaremos el **Ejercicio 1** como ejemplo (expresión de suma, ej. `10 + 5`).
 
### 1. Entrar a la carpeta del ejercicio
 
```powershell
cd Competencia2\Ejercicio1
```
 
### 2. Generar el lexer y el parser a partir de la gramática
 
Este comando lee el archivo `Expr.g4` y genera los archivos Python (`ExprLexer.py`, `ExprParser.py`, etc.) necesarios para analizar el texto:
 
```powershell
java -jar $env:ANTLR_JAR -Dlanguage=Python3 -no-listener .\Expr.g4
```
 
Si ya existen los archivos generados en el repositorio, este paso es opcional (solo es necesario si modificas la gramática `.g4` o si los archivos generados no están presentes).
 
### 3. Ejecutar el script de prueba
 
Hay dos formas de darle una expresión al programa:
 
**a) Leyendo desde un archivo (`prueba.txt`):**
```powershell
py -3.11 .\test.py .\prueba.txt
```
 
**b) Escribiendo la expresión directamente en la terminal:**
```powershell
py -3.11 .\test.py
```
El programa te pedirá que teclees la expresión, por ejemplo:
```
Ingresa expresión: 10 + 5
```
 
### 4. Resultado esperado
 
En ambos casos el programa imprime una tabla con el análisis léxico de la expresión, mostrando el **lexema** (texto reconocido), el **token** (nombre de la regla léxica), el **tipo** (número identificador del token), la **línea** y la **columna** donde aparece:
 
```
LEXEMA          TOKEN           TIPO    LINEA   COLUMNA
------------------------------------------------------
10              NUM             1       1       0
+               MAS             2       1       3
5               NUM             1       1       5
```
 
Cada ejercicio tiene su propia gramática y por lo tanto reconoce tokens distintos. Por ejemplo:
 
- **Ejercicio 2 (resta):** `300 - 30` -> tokens `NUM`, `MENOS`, `NUM`
- **Ejercicio 3 (asignación):** `x = 200` -> tokens `IDT`, `ASG`, `NUM`

La lógica para correr cualquier otro ejercicio es idéntica: entra a su carpeta, genera el lexer (si hace falta) y corre `test.py`.
 
---
 
## Ejemplo completo para ejercutar (Ejercicio 1, de inicio a fin)
 
```powershell
cd 7A_Automatas
$env:ANTLR_JAR = "C:\antlr\antlr-4.13.2-complete.jar"
cd Competencia2\Ejercicio1
java -jar $env:ANTLR_JAR -Dlanguage=Python3 -no-listener .\Expr.g4
py -3.11 .\test.py .\prueba.txt
--En algunos casos es necesario especificar la version de python en
algunos te lo aceptara solo con py .\test.py
```

 
Salida esperada:
```
LEXEMA          TOKEN           TIPO    LINEA   COLUMNA
------------------------------------------------------
10              NUM             1       1       0
+               MAS             2       1       3
5               NUM             1       1       5
```
 
---
 
## Solución de problemas comunes(algunos nos pasaron)
 
| Problema | Posible causa / solución |
|---|---|
| `'java' no se reconoce como un comando` | Java no está instalado o no está en el PATH. Reinstala el JDK y reinicia la terminal. |
| `$env:ANTLR_JAR` no encuentra el archivo | Verifica que la ruta al `.jar` sea correcta y que el archivo exista en esa ubicación. |
| `ModuleNotFoundError: No module named 'antlr4'` | Falta instalar el runtime de Python: `pip install antlr4-python3-runtime`. |
| `py -3.11` no funciona | Usa el comando `python` o `python3` o `py`  según tu instalación, o revisa que Python 3.11 esté instalado y agregado al PATH. |
| Error de reconocimiento de token (`token recognition error`) | Puede deberse a caracteres no contemplados en la gramática (por ejemplo saltos de línea distintos o comillas especiales). Revisa el archivo `Expr.g4` del ejercicio. |
| El texto de la tabla se ve "roto" en la terminal | Ocurre con expresiones muy largas (ver Ejercicio 10); es solo un tema visual, el análisis sigue siendo correcto. |
 
---
 
## Ejercicios de POO (Programación Orientada a Objetos)
 
Además de los ejercicios de ANTLR, el repositorio puede incluir una carpeta `POO/` con ejercicios de Programación Orientada a Objetos en Python.
 
### Requisitos
 
Los mismos que ya instalaste para los ejercicios de ANTLR:
- Python 3.11 (o el que tengas instalado)
### Cómo ejecutarlos
 
1. Entra a la carpeta del ejercicio de POO:
```powershell
   cd POO\NombreDelEjercicio
```
   *(ajusta `NombreDelEjercicio` al nombre real de la carpeta o archivo que tengas)*
 
2. Corre el script directamente con Python:
```powershell
   py -3.11 .\main.py
```
   *(reemplaza `main.py` por el archivo principal del ejercicio, por ejemplo `Nombre_del_archivo.py` o `programa.py`)*
 
3. Si el ejercicio pide datos por teclado (por ejemplo, crear un objeto con ciertos atributos), simplemente escribe la información que te solicite la terminal y presiona `Enter`.
> Consejo: si tienes varios archivos `.py` que se importan entre sí (por ejemplo, una clase en un archivo y el programa principal en otro), asegúrate de ejecutar siempre el archivo "principal" (el que contiene `if __name__ == "__main__":`) y no los archivos de clases por separado.
 
---
 
## Ejercicios de Streamlit
 
La carpeta `Streamlit/` contiene ejercicios que muestran una interfaz web sencilla usando la librería **Streamlit**, en vez de mostrar resultados solo en la terminal.
 
### 1. Instalar Streamlit
 
Con el entorno de Python ya instalado, agrega la librería:
```powershell
pip install streamlit
```
 
*(Opcional pero recomendado)* Usa un entorno virtual para no mezclar dependencias con otros proyectos:
```powershell
python -m venv .venv
.\.venv\Scripts\Activate.ps1
pip install streamlit antlr4-python3-runtime
```
 
Si PowerShell muestra un error de permisos al activar el entorno virtual, ejecuta esto una sola vez y vuelve a intentar:
```powershell
Set-ExecutionPolicy -Scope Process -ExecutionPolicy Bypass
```
 
### 2. Entrar a la carpeta del ejercicio
 
```powershell
cd Streamlit\NombreDelEjercicio
```
*(ajusta el nombre según la carpeta real del repositorio)*
 
### 3. Ejecutar la aplicación
 
Los proyectos de Streamlit no se corren con `python archivo.py`, sino con el comando `streamlit run`:
```powershell
streamlit run app.py
```
*(si el archivo principal se llama distinto, por ejemplo `main.py` o `streamlit_app.py`, usa ese nombre en lugar de `app.py`)*
 
### 4. Ver el resultado
 
Al ejecutar el comando anterior, Streamlit abrirá automáticamente una pestaña en tu navegador (normalmente en `http://localhost:8501`) donde podrás interactuar con la interfaz del ejercicio (botones, formularios, tablas, gráficas, etc.).
 
Para detener la aplicación, regresa a la terminal y presiona `Ctrl + C`.
 
### 5. Desactivar el entorno virtual (si lo usaste)
 
```powershell
deactivate
```
 
---
 
## Flujo de trabajo en Git usado en este proyecto
 
Cada ejercicio se desarrolló en su propia rama (`Competencia2_EjercicioN`), y una vez verificado que funcionaba correctamente, se integró a `main` mediante un **Pull Request**. Si quieres revisar el historial completo de cambios:
 
```powershell
git log
```
 
---
 
## Autores
 
- Claudia Fernanda Pedraza Pizano
- Christian Raúl Páramo Bautista
**Materia:** Lenguajes y Autómatas 2 — Grupo 7A, Verano
**Profe:** López Ruíz Luis Gerardo
