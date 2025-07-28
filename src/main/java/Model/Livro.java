
package Model;

import java.util.Date;

public class Livro {
    private int idLivro;
    private String titulo;
    private boolean isDisponivel;
    private Date dataCadastro;
    private Date dataAtualiza;
    
    public Livro(int idLivro,String titulo, boolean isDisponivel, Date dataCadastro, Date dataAtualiza){
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.isDisponivel = isDisponivel;
        this.dataCadastro = dataCadastro;
        this.dataAtualiza = dataAtualiza;
    }
    
    public int getIdLivro(){
        return idLivro;
    }
    
    public void setIdLivro(int idLivro){
        this.idLivro = idLivro;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public boolean getDisponivel(){
        return isDisponivel;
    }
    
    public void setDisponivel(boolean isDisponivel){
        this.isDisponivel = isDisponivel;
    }
    
    public Date getDataCad(){
        return dataCadastro;
    }
    
    public void setDataCad(Date dataCad){
        this.dataCadastro = dataCadastro;
    }
    
    public Date getDataAtualiza(){
        return dataAtualiza;
    }
    
    public void setDataAtualiza(Date dataAtualiza){
        this.dataAtualiza = dataAtualiza;
    }
}
