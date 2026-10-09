# Manual de clases y retos de Java

Este repositorio acompaña las clases de Java. Aquí se comparten las explicaciones de los temas, los ejercicios y los retos que se trabajan durante el curso. Cada participante tiene una carpeta propia para guardar sus soluciones.

## Dónde encontrar el material

En [`retos/`](retos/) se publican los enunciados de los retos como archivos Markdown (`.md`). Abre el archivo del reto que vas a resolver y sigue sus indicaciones.

En [`docs/`](docs/) se guardan las explicaciones de cada tema. Puedes consultarlas antes de empezar un ejercicio o mientras trabajas en él.

En [`participantes/`](participantes/) están las carpetas personales. Guarda tus ejercicios y soluciones únicamente en la carpeta que lleva tu nombre. Para mantener el trabajo ordenado, crea dentro de ella una subcarpeta con el nombre del reto y coloca ahí los archivos de tu solución.

## Estructura del repositorio

```text
N/
├── README.md
├── retos/              enunciados de los retos (.md)
├── docs/               explicaciones de los temas
└── participantes/      una carpeta por participante
    ├── alan/
    ├── alejandro/
    └── ...
```

Los nombres mostrados son ejemplos de las carpetas que ya existen. Cada estudiante debe usar su propia carpeta dentro de `participantes/`; no debe guardar ejercicios en la carpeta de otra persona. Dentro de su espacio puede separar las soluciones por reto.

## La primera vez

Abre el [repositorio de la clase](https://github.com/Jony-English22/N) en GitHub y selecciona **Fork**. Esto crea una copia del repositorio en tu cuenta. Después, clona **tu fork** en tu equipo y entra en la carpeta descargada:

```bash
git clone https://github.com/TU-USUARIO/N.git
cd N
```

Sustituye `TU-USUARIO` por tu nombre de usuario de GitHub. A partir de ahí, trabaja en tu carpeta personal dentro de `participantes/`.

## Cómo subir un ejercicio

Cuando termines, abre una terminal en la raíz del repositorio. Sustituye `tu-nombre` por el nombre de tu carpeta y ejecuta:

```bash
git add participantes/tu-nombre/
git commit -m "Agrega solucion del reto"
git push
```

`git add` prepara los archivos de tu carpeta, `git commit` guarda los cambios con un mensaje y `git push` los sube a **tu fork** en GitHub. Antes de confirmar, revisa que solo estés incluyendo los archivos de tu ejercicio.

Para que la entrega llegue también al repositorio de la clase, abre un **pull request** en GitHub desde tu fork hacia el repositorio original. Subir los cambios con `git push` solo actualiza tu copia.
