# Catalogly 2026 ☕

**Catalogly** es una aplicación de catálogo moderna para Android que demuestra la implementación de una arquitectura robusta, escalable y mantenible. El proyecto sirve como escaparate de las mejores prácticas de desarrollo móvil actuales.

---

## 🚀 Tech Stack & Libraries

Este proyecto utiliza las herramientas más recientes del ecosistema Android (2026):

*   **Kotlin 2.0 / KSP**: Aprovechando las últimas mejoras de rendimiento en la compilación.
*   **Jetpack Compose**: UI declarativa moderna.
*   **Hilt (Dagger)**: Inyección de dependencias para desacoplamiento y testabilidad.
*   **Coil**: Carga de imágenes asíncrona y eficiente.
*   **Version Catalog (TOML)**: Gestión centralizada y limpia de dependencias.
*   **Clean Architecture**: Separación estricta en capas: **Domain**, **Data** y **Presentation**.

---

## 🏗️ Architecture

El proyecto sigue los principios de **Clean Architecture** y **MVVM** (Model-View-ViewModel):

1.  **Domain Layer**: Contiene los modelos de negocio y las interfaces de los repositorios. Es código Kotlin puro, independiente de cualquier plataforma.
2.  **Data Layer**: Implementación de los repositorios y manejo de datos (actualmente mediante Mock Data con simulación de retardo de red).
3.  **Presentation Layer**: UI construida con Compose, manejada por ViewModels que observan estados reactivos.

---

## 🛠️ Setup & Installation

1. Clonar el repositorio.
2. Asegurarse de tener instalado **Android Studio Ladybug** (o superior).
3. Sincronizar el proyecto con los archivos Gradle.
4. Ejecutar en un emulador o dispositivo físico con **API 26+**.

---

## 📈 Roadmap (Next Steps)

- [ ] Implementación de persistencia local con **Room**.
- [ ] Integración de API real mediante **Retrofit**.
- [ ] Cobertura de **Unit Testing** para ViewModels y Repositorios.

---


