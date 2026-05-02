#  Patrón Adapter: AdaptadorDrone

[![Java](https://img.shields.io/badge/Java-17%2B-blue)](https://www.java.com/)
[![License](https://img.shields.io/badge/License-MIT-green)](LICENSE)
[![Conventional Commits](https://img.shields.io/badge/Conventional%20Commits-1.0.0-yellow)](https://conventionalcommits.org)

# Descripción

Implementación del **patrón de diseño Adapter** que permite que un `Drone` (con métodos `beep()`, `girarRotor()`, `despegar()`) pueda utilizarse como si fuera un `Pato` (con métodos `cuaquear()`, `volar()`).

# Propósito

Demostrar cómo el patrón Adapter resuelve problemas de **incompatibilidad de interfaces** sin modificar el código existente.

# Diagrama de Clases

![Diagrama UML](docs/diagrama-uml.png)

# Traducción de Métodos

| Método Pato (target) | Método(s) Drone (adaptee) |
|---------------------|---------------------------|
| cuaquear()        | beep()                  |
| volar()`           | despegar() + girarRotor() |

