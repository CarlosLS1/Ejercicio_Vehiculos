# Ejercicio_Vehiculos
_Necesito un Objeto Coche que extienda de Vehículo y que implemente un interfaz “conducible”. 
El interfaz conducible debería ser reusado en la clase Moto o Camión (no es necesario crearla) Igualmente si se crease una clase Moto o Barco, debería también poder extender de la super clase Vehículo.
El Objeto coche tendrá varias propiedades que se pueden cambiar durante la vida del coche. Por ejemplo, puedo pintar mi coche y por tanto cambiarle el color en cualquier momento.
Otras propiedades, son inmutables durante la vida del coche, por ejemplo, la matrícula no se puede cambiar una vez instanciado el Coche (para los efectos del ejercicio, vamos a considerar que un coche no se puede volver matricular)
Otras propiedades son inherentes a su clase Coche, por ejemplo, todos los coches tienen 4 ruedas, si tienen tres, dos o más de cuatro no serán coches. El número de ruedas no lo puedo por tanto cambiar, ni durante la vida del coche, ni al instanciar un coche.
El interfaz “conducible” me permitirá reusarlo en otras clases que no sean coches. Conducible podría implementar métodos como conducir, avanzar, retroceder, parar: luego cada clase que use implemente el interfaz “Conducible” implementará el método conducir a su manera (no se conduce igual una barca que un coche, aunque ambos sean vehículos y conducibles) …
Normas/Recomendaciones:
•	Usa la abstracción piensa que propiedades pertenece mejor a cada clase.
•	Piensa bien quien debe implementar el interfaz conducible
•	Usa variables y constantes según corresponda (public, private, static, final..)
•	Piensa que propiedades se pueden situar dentro de la jerarquía que diseñes para que sean más eficientes/reutilizables en tu código. Por ejemplo, preguntas como ¿“el color” puede ser aplicable a coche o bien a la super clase vehículo?
•	Usa las buenas prácticas que se han mencionado durante el curso, nombre de variables, clases, comentarios para explicar tu código,… clean code en general.
Opcional
Crea métodos donde consideres que nos permitan acceder a la velocidad, espacio recorrido, tiempo de viaje, etc. del vehículo, según usamos los métodos, arrancar, avanzar, parar. Por ejemplo: si uso 
miCoche.arrancar(); // Tiempo inicial del viaje
miCoche.avanzar(5); // Avanzo 5 metros + Tiempo actual de viaje
miCoche.parar(); // tiempo final de viaje
velocidad = espacio/tiempo
Para nota
Crea una clase camión y establece una propiedad “tacómetro” que almacene una lista de las velocidades de un recorrido.
Mejora 
Corregir cualquier aspecto que queráis o que no os convenza del proyecto, desde alguna
refactorización a cualquier otro aspecto funcional o de diseño que os parezca adecuado. Indicad en el readme que mejoras habéis hecho y si no habéis hecho ninguna porque todo os parece correcto, también indicadlo.

Documentación 
 El proyecto debe estar bien documentado, comentarios donde sea necesario, Javadoc y README_


### Pre-requisitos 📋

_Java 8 o superior_

## Despliegue 📦

_Agrega notas adicionales sobre como hacer deploy_

## Construido con 🛠️



## Contribuyendo 🖇️

Por favor lee el [CONTRIBUTING.md](https://gist.github.com/villanuevand/xxxxxx) para detalles de nuestro código de conducta, y el proceso para enviarnos pull requests.

## Wiki 📖

Puedes encontrar mucho más de cómo utilizar este proyecto en nuestra [Wiki](https://github.com/tu/proyecto/wiki)

## Versionado 📌

Usamos [SemVer](http://semver.org/) para el versionado. Para todas las versiones disponibles, mira los [tags en este repositorio](https://github.com/tu/proyecto/tags).

## Autores ✒️

_Menciona a todos aquellos que ayudaron a levantar el proyecto desde sus inicios_

* **Carlos Luo** - *Trabajo Inicial* - [CarlosLS](https://github.com/CarlosLS1)

## Licencia 📄

Este proyecto está bajo la Licencia (Tu Licencia) - mira el archivo [LICENSE.md](LICENSE.md) para detalles
