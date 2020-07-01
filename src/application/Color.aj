package application;

public aspect Color {
	
	pointcut rojo(): execution(* detectarR*(..) );
	after(): rojo(){
		System.out.println("Color Rojo");
	}
    
    pointcut blue() : execution(* detectarB*(..) );
    after() : blue() {
    	System.out.println("Color Azul");
    }
    
    pointcut green() : execution(* detectarG*(..) );
    after() : green() {
    	System.out.println("Color Verde");
    }

}
