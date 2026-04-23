# Ocultamiento de Datos - Ejemplo con Calendar

## Niveles de acceso

| Variable | Modificador | Acceso |
|----------|-------------|--------|
| time | private | Solo en TodaysDate |
| day | protected | Mismo paquete + subclases |
| month | (default) | Solo mismo paquete |
| year | public | Cualquier clase |

## Respuestas

1. **time** → Solo la clase TodaysDate
2. **day** → TodaysDate, subclases y mismo paquete
3. **Más restrictivo** → time (private)
4. **year** → Desde cualquier clase (public)

## Cómo compilar y ejecutar

```bash
javac src/TodaysDate.java -d .
javac -cp . src/TestFecha.java
java -cp . TestFecha
