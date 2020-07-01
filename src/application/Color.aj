package application;

public aspect Color {
	Operaciones op = new Operaciones();
	pointcut oper(): execution(* detectar*(..));
	before():oper(){
		op.CargarDatos();
	}
	
	pointcut rojo(): execution(* detectarR*(..) );
	after(): rojo(){
		System.out.println("Color Rojo");
		op.suma();
	}
    
    pointcut blue() : execution(* detectarB*(..) );
    after() : blue() {
    	System.out.println("Color Azul");
    	op.multiplicacion();
    }
    
    pointcut green() : execution(* detectarG*(..) );
    after() : green() {
    	System.out.println("Color Verde");
    	op.resta();
    }

}
