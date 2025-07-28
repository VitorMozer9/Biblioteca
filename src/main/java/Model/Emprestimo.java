package Model;

public class Emprestimo {
    private int idEmprestimo;
    private int idCliente;
    private String nomeLivro;
    private boolean isEmprestado;

    public Emprestimo(int idEmprestimo, int idCliente, String nomeLivro, boolean isEmprestado) {
        this.idEmprestimo = idEmprestimo;
        this.idCliente = idCliente;
        this.nomeLivro = nomeLivro;
        this.isEmprestado = isEmprestado;
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public boolean isIsEmprestado() {
        return isEmprestado;
    }

    public void setIdEmprestimo(int idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public void setIsEmprestado(boolean isEmprestado) {
        this.isEmprestado = isEmprestado;
    }
    
    
    
}
