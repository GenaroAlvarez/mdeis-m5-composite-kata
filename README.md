# Katas del Patrón Compuesto

## Integrantes
- Ing. Alvarez Orias Genaro Mauricio

## Kata 8: Sistema de Equipos Deportivos

### Problema
Crea un sistema para representar equipos y jugadores. Cada jugador tiene un nombre y un puntaje. Los equipos pueden contener jugadores y otros equipos.

### Instrucciones
1. Crea una interfaz `TeamComponent` con métodos `getScore()` y `showDetails()`.
2. Implementa una clase `Player` para jugadores individuales.
3. Implementa una clase `Team` para equipos.
4. En el cliente, crea una estructura de equipos y calcula el puntaje total.

### Salida Esperada

```
Jugador: Carlos, Puntaje: 10
Jugador: Ana, Puntaje: 15
Equipo: Equipo A, Puntaje Total: 25
```

---

## Kata 10: Sistema de Documentos

### Problema
Crea un sistema para representar documentos y carpetas de documentos. Cada documento tiene un nombre y un tamaño. Las carpetas pueden contener documentos y otras carpetas.

### Instrucciones
1. Crea una interfaz `DocumentComponent` con métodos `getSize()` y `showDetails()`.
2. Implementa una clase `Document` para documentos individuales.
3. Implementa una clase `DocumentFolder` para carpetas de documentos.
4. En el cliente, crea una estructura de documentos y carpetas y calcula el tamaño total.

### Salida Esperada

```
Documento: Informe.docx, Tamaño: 5MB
Documento: Presentación.pptx, Tamaño: 10MB
Carpeta: Proyectos, Tamaño Total: 15MB
```
