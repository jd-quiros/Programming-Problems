# Programming Problems

Archivo personal de programación competitiva: soluciones propias a problemas de distintas plataformas y a competencias.

Lenguajes:
- **C++**: el principal, para competencias y problemas difíciles.
- **Python**: herramientas (generadores de casos, fuerza bruta) y problemas con números grandes.
- **Kotlin**: el lenguaje del momento. Se usa para volver a resolver problemas que ya salieron en C++. Va rotando para probar otros.


## Estructura

```
programming-problems/
├── codeforces/      problemas sueltos y rounds de Codeforces
├── codechef/        problemas y Starters de CodeChef
├── cses/            CSES Problem Set, implementación de clásicos
├── contests/        competencias y simulacros que se ven como un todo
│   └── 2026-icpc-centroamerica/
│       ├── b-nombre-del-problema.cpp
│       └── notas.md
└── tools/           plantillas y scripts (stress testing, generadores)
```

- **Las plataformas** usan una carpeta plana. El lenguaje lo indica la extensión del archivo.
- **Los problemas van por juez original**, aunque se hayan resuelto desde vjudge.
- **`contests/`** es solo para eventos donde importa el set completo: ICPC, simulacros en equipo y contests armados en vjudge con problemas de varios jueces. Los rounds normales de Codeforces y CodeChef van en la carpeta de su plataforma.


## Nombres

Minúsculas, separados por guiones y con el ID del problema al inicio, para que se ordenen solos:

```
codeforces/1915a-odd-one-out.cpp
codechef/start150-b-nombre.cpp
cses/1068-weird-algorithm.cpp
```

El mismo problema en otro lenguaje lleva el mismo nombre con otra extensión (`1915a-odd-one-out.kt`).


## Encabezado

Al inicio de cada archivo, un comentario con el enlace al enunciado y algunos datos:

```cpp
// https://codeforces.com/problemset/problem/1915/A
// Fecha: 2026-11-11
// Temas: implementación, greedy
// Resuelto: solo
```

`Resuelto` puede ser `solo`, `con pista` o `vi la solución`. Los que no fueron `solo` se vuelven a hacer después de unas semanas.


## Contests

Cada carpeta de `contests/` lleva un `notas.md` con:
- Qué problemas salieron y en cuánto tiempo.
- Cuáles no, y por qué (idea, implementación, tiempo, TLE).
- Qué practicar a partir de eso.

Los problemas que no salieron en la competencia se resuelven después (upsolving) y se guardan en la misma carpeta.


## Enunciados

- [Codeforces](https://codeforces.com/problemset)
- [CodeChef](https://www.codechef.com/practice)
- [CSES Problem Set](https://cses.fi/problemset/)
