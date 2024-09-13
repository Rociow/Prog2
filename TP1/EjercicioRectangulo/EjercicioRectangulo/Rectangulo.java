package EjercicioRectangulo;

public class Rectangulo {
    PuntoGeometrico v1;
    PuntoGeometrico v2;
    PuntoGeometrico v3;
    PuntoGeometrico v4;

    final static PuntoGeometrico DEF_PUNTO1= new PuntoGeometrico(1,3);
    final static PuntoGeometrico DEF_PUNTO2= new PuntoGeometrico(4,3);
    final static PuntoGeometrico DEF_PUNTO3= new PuntoGeometrico(1,1);
    final static PuntoGeometrico DEF_PUNTO4= new PuntoGeometrico(1,4);

    //los lados A=C y B=D
    //perimetro (suma de los 4 lados) = 2a+2b
    //diagonales = BD2 = AB2+AD2
    //area= A = a*b;

public Rectangulo(){
    setPunto1(DEF_PUNTO1);
    setPunto2(DEF_PUNTO2);
    setPunto3(DEF_PUNTO3);
    setPunto4(DEF_PUNTO4);
}

public Rectangulo(PuntoGeometrico punto1, PuntoGeometrico punto2, PuntoGeometrico punto3, PuntoGeometrico punto4){
    setPunto1(punto1);
    setPunto2(punto2);
    setPunto3(punto3);
    setPunto4(punto4);
}

public void setPunto1(PuntoGeometrico punto1){
    this.v1=punto1;
}

public void setPunto2(PuntoGeometrico punto2){
    this.v2=punto2;
}
public void setPunto3(PuntoGeometrico punto3){
    this.v3=punto3;
}
public void setPunto4(PuntoGeometrico punto4){
    this.v4=punto4;
}

public void mostrarRectangulo(){
    this.v1.printInfo();
    this.v2.printInfo();
    this.v3.printInfo();
    this.v4.printInfo();
}

public void desplazarRectangulo(int des_x, int des_y){
    this.v1.moverPunto(des_x, des_y);
    this.v2.moverPunto(des_x, des_y);
    this.v3.moverPunto(des_x, des_y);
    this.v4.moverPunto(des_x, des_y);
}

public double calcularLargo(){
    return this.v1.distanciaEuclidea(v2.x, v2.y);
}

public boolean esCuadrado(){
    double lado1 = this.v1.distanciaEuclidea(v2.x, v2.y);
    double lado2 = this.v1.distanciaEuclidea(v3.x, v3.y);

    return lado1==lado2;
}

public boolean estaAcostado(){
    double lado1 = this.v1.distanciaEuclidea(v2.x, v2.y);
    double lado2 = this.v1.distanciaEuclidea(v3.x, v3.y);

    return lado1>lado2;
}

public double calcularArea(){
    double lado1 = this.v1.distanciaEuclidea(v2.x, v2.y);
    double lado2 = this.v1.distanciaEuclidea(v3.x, v3.y);

    return lado1*lado2;
}
}
