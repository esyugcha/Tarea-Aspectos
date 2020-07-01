#Tarea 01 Aspectos

**Funcionalidad extra**
Se implementó la nueva funcionalidad, donde al dar click en alguno de los botones se solicita por consola 2 números y dependiendo de qué botón se presione se realiza una operación distinta (suma, resta, multiplicación). Para el correcto funcionamiento es obligatorio el ingreso de los números solicitados en consola antes depresionar otro botón.

De esta manera se ejemplifica AOP, ya que el presionar los diferentes botones de la interfaz provoca diferentes comportamientos de manera simultánea, así que utilizando un aspecto se logra manejar este problema sin necesidad de repetir código que detecte qué botones se están utilizando, logrando que el programa tenga una mejor modularidad.