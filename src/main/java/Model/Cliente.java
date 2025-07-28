package Model;

import java.util.Date;

public class Cliente {
    private int idCliente;
    private String nome;
    private Date nascimento;
    private String email;

    public Cliente(int idCliente, String nome, Date nascimento, String email) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.nascimento = nascimento;
        this.email = email;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public static boolean validaEmail(String email){
        String regex = "^[\\\\w._%+-]+@[\\\\w.-]+\\\\.[a-zA-Z]{2,}$";
        return email != null && email.matches(regex);
    }
    
}
