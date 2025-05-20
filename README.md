# 🎮 Juego de Preguntados

**Juego de trivia sencillo** desarrollado en Android (Java) para la materia de Aplicativos Mobile.

---

## 📝 Descripción

Una app que permite al usuario:

* Ingresar su nombre en la pantalla de bienvenida.
* Responder una serie de preguntas de trivia.
* Ver el puntaje final (correctas e incorrectas).
* Navegar entre pantallas (flecha "Atrás" y botón de retorno).

La aplicación consta de tres Activities principales:

1. **MainActivity**: Pantalla de bienvenida e ingreso de nombre.
2. **GameActivity**: Pantalla de preguntas con opciones.
3. **ResultActivity**: Pantalla de resultados y botón para volver al inicio.

---

## ⚙️ Tecnologías y requisitos

* **Android Studio** (≥ Arctic Fox ⭐)
* **Lenguaje**: Java
* **Minimum SDK**: API 21 (Android 5.0)
* **Herramientas**: ConstraintLayout, Intents, AppCompat

---

## 🚀 Instalación y ejecución

1. **Cloná el repositorio**

   ```bash
   git clone https://github.com/tu_usuario/TP1Preguntados.git
   ```
2. **Abrí el proyecto** en Android Studio: `File → Open…` y seleccioná la carpeta del repositorio.
3. **Esperá** a que Gradle se sincronice.
4. **Ejecutá** la app en un emulador o dispositivo físico con API 21 o superior.

---

## 🎯 Uso

1. Al abrir la app, ingresá tu nombre y tocá **“Empezar a jugar”**.
2. Contestá cada pregunta seleccionando una opción y presioná **“Siguiente”**.
3. Al finalizar, verás la pantalla de resultados con el número de correctas e incorrectas.
4. Usá **“Volver al inicio”** para reiniciar el juego.

---

## 📂 Estructura del proyecto

```
TP1Preguntados/
├─ app/
│  ├─ src/main/java/com/example/tp1preguntados/
│  │   ├─ MainActivity.java
│  │   ├─ GameActivity.java
│  │   ├─ ResultActivity.java
│  │   └─ Question.java
│  └─ src/main/res/layout/
│      ├─ activity_main.xml
│      ├─ activity_game.xml
│      └─ activity_result.xml
└─ build.gradle.kts
```

---

## 🤝 Contribuciones

¡Las contribuciones son bienvenidas! Hacé un fork del proyecto y abrí un pull request con tus mejoras.

---

## 📄 Licencia

Este proyecto está licenciado bajo la **MIT License**. ¡Usalo libremente! 🎉
