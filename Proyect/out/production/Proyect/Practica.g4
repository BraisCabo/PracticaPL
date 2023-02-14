grammar Practica;

@members{
}

r : (SALTO)+;
SALTO: . {System.out.println(getText());};