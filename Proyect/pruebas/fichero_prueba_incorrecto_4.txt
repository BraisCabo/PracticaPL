integer a;
integer b = 10;
float c;
string s = "Hola mundo";
#define PI 3.1416
#define MAX_INT 2147483647

float multiplicar(float e, float f)
{
    return (e * f);
}

integer sumar(integer e, integer f)
{
    return (e + f;
}

void imprimir(string mensaje)
{
    print mensaje);
}

string concatenar(string e, string f)
{
    return (e + f);
}

void Main()
{
    a = b * 2;
    c = a DIV PI;
    string mensaje = "El valor de c es: ";
    mensaje = mensaje + c;
    imprimir(mensaje);
    if (a > MAX_INT)
    {
        imprimir("El valor de a supera el máximo permitido");
    }
    else
    {
        imprimir("El valor de a es válido");
    }
    while (c < 100)
    {
        c = c + 10;
        imprimir("El valor de c es: " + c);
    }
