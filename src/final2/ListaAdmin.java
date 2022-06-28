
package final2;

/**
 *
 * @author WINDOWS 10
 */
public class ListaAdmin {
     Miobjeto primero;// null
     Miobjeto actualNodo ;
    /// 
    
    public void insertar(String pastel,int n){
       
        if(primero==null)//primero
        {
            primero= new Miobjeto();
            primero.nombre=pastel;
            primero.numero=n;
            
            
        }
        else
        {//2ndo insert
             Miobjeto aux_pastel= new Miobjeto();
                aux_pastel.nombre=pastel;
                aux_pastel.numero=n;
                
                if(primero.siguiente==null)// 2ndo insert
                {
                    primero.siguiente=aux_pastel;
                    
                    aux_pastel.anterior=primero;
                }
                
        /*int v[10];
        int i=0;
        while(i<10)
        {
            int iterador= v[i];
        i++;
        }*/
        
                else{
        ///3 en adelante
                        Miobjeto iterador=primero.siguiente;//obtener el valor del 2ndo
                        boolean insertado=false;
                         while(iterador!=null & insertado==false)
                         {
                              if(iterador.siguiente==null)
                              {
                                  iterador.siguiente=aux_pastel;
                                  aux_pastel.anterior=iterador;
                                  
                                  insertado=true;
                              }
                                 else
                                  iterador= iterador.siguiente;
                         }
                         
                }
          
              
        }
        
        
        
    }
    
    
    public boolean buscar(String pastel)
    {
        
        
        if(primero.nombre.equals(pastel))
            return true;
        else{
                        Miobjeto iterador=primero.siguiente;//obtener el valor del 2ndo
                        
                         while(iterador!=null  )
                         {
                              if(iterador.nombre.equals(pastel))
                              {
                                  return true;
                              }
                                 else
                                  iterador= iterador.siguiente;
                         }
        }
        return false;
    }

   public String buscarE(int nodo_actual) {
 if(primero.numero==(nodo_actual))
            return primero.nombre;
        else{
                        Miobjeto iterador=primero.siguiente;//obtener el valor del 2ndo
                        
                         while(iterador!=null  )
                         {
                              if(iterador.numero==(nodo_actual))
                              {
                                  return iterador.nombre;
                              }
                                 else
                                  iterador= iterador.siguiente;
                         }
        }
        return "";
    }
    
    // Funcionalidades añadidas para el manejo de los botones !!
    public void irNodoAnterior(){
        
       if(primero!=null &&primero.anterior!=null){
           primero = primero.anterior;
       }
    }
    
    
    public void irNodoSiguiente(){
       if(primero!=null &&primero.siguiente!=null){
           primero = primero.siguiente;
       }
    }


}
