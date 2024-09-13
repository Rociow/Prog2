public class EmpresaConsultora {
    Encuesta [] arregloEncuestas;
    Empleados [] empleados;

    final static int valorMaximoEncuestas = 15;


    public void numEncuestasRealizadas () {
        for (int i = 0; i < empleados.length; i++){
            System.out.println("El empleado: " + empleados[i].getNombre() + " realizó " + empleados[i].getCantidad() + " encuestas.");
        }
    }

    public void agregarEncuesta (Encuesta nuevaEncuesta) {

        if (docNuevo(nuevaEncuesta.getDocumento()) == true){
        Encuesta [] encuestasAux = new Encuesta[arregloEncuestas.length+1];

        for ( int i = 0; i<arregloEncuestas.length; i++){
            encuestasAux[i]=arregloEncuestas[i];
        }

        encuestasAux[encuestasAux.length-1]=nuevaEncuesta;
        arregloEncuestas=encuestasAux;
    }

    else {
        System.out.println("La persona encuestada ya respondió la encuesta.");
    }
    }

    private boolean docNuevo(int doc) {
        int i = 0;
            while ( i < arregloEncuestas.length && (arregloEncuestas[i].getDocumento()) != doc){
                i++;
            }

            return (arregloEncuestas[i].getDocumento()) == doc;
        }
    }
