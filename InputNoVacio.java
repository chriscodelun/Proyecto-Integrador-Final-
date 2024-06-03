public class InputNoVacio extends Exception{
    
    public static int entradaVacia (int opc)throws ExcepcionPropia
    {
        if(opc==1||opc==2||opc==3||opc==4||opc==5)
        {
           return opc;
        }
       
        throw new ExcepcionPropia("Por favor eliga una opcion");
        
    }
    public static int entradaVacia2 (int opc1)throws ExcepcionPropia
    {
        if(opc1==1||opc1==2||opc1==3||opc1==4)
        {
           return opc1;
        }
       
        throw new ExcepcionPropia("Por favor eliga una opcion");
    }
    

    
}