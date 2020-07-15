package org.elderlucas.Controller;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.elderlucas.ejb.CategoriaFacadeLocal;
import org.elderlucas.model.Categoria;

@Named
@ViewScoped
public class CategoriaController implements Serializable{
    @EJB
    private CategoriaFacadeLocal categoriaEJB; //Acá hacemos la inyección para no realizar un new CategoriaFacadeLocal
    private Categoria categoria;//Creamos una categoria para poder guardar los opbjetos
    
    @PostConstruct
    public void init(){
        categoria = new Categoria();
    }
    
    public void registrar(){
        try{
            categoriaEJB.create(categoria);
        }catch(Exception e){
            //
        }
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
    
}
