package bean;

import java.util.Date;

/**
 *
 * @author u07785254141
 */
public abstract class MpvUsuarios {

    private int mpvUsuarios;
    private String mpvNome;
    private String mpvApelido;
    private String mpvCpf;
    private Date mpvDataNascimento;
    private int mpvNivel;
    private String mpvSenha;
    private String mpvAtivo;

    /**
     * @return the mpvUsuarios
     */
    public int getMpvUsuarios() {
        return mpvUsuarios;
    }

    /**
     * @param mpvUsuarios the mpvUsuarios to set
     */
    public void setMpvUsuarios(int mpvUsuarios) {
        this.mpvUsuarios = mpvUsuarios;
    }

    /**
     * @return the mpvNome
     */
    public String getMpvNome() {
        return mpvNome;
    }

    /**
     * @param mpvNome the mpvNome to set
     */
    public void setMpvNome(String mpvNome) {
        this.mpvNome = mpvNome;
    }

    /**
     * @return the mpvApelido
     */
    public String getMpvApelido() {
        return mpvApelido;
    }

    /**
     * @param mpvApelido the mpvApelido to set
     */
    public void setMpvApelido(String mpvApelido) {
        this.mpvApelido = mpvApelido;
    }

    /**
     * @return the mpvCpf
     */
    public String getMpvCpf() {
        return mpvCpf;
    }

    /**
     * @param mpvCpf the mpvCpf to set
     */
    public void setMpvCpf(String mpvCpf) {
        this.mpvCpf = mpvCpf;
    }

    /**
     * @return the mpvDataNascimento
     */
    public Date getMpvDataNascimento() {
        return mpvDataNascimento;
    }

    /**
     * @param mpvDataNascimento the mpvDataNascimento to set
     */
    public void setMpvDataNascimento(Date mpvDataNascimento) {
        this.mpvDataNascimento = mpvDataNascimento;
    }

    /**
     * @return the mpvNivel
     */
    public int getMpvNivel() {
        return mpvNivel;
    }

    /**
     * @param mpvNivel the mpvNivel to set
     */
    public void setMpvNivel(int mpvNivel) {
        this.mpvNivel = mpvNivel;
    }

    /**
     * @return the mpvSenha
     */
    public String getMpvSenha() {
        return mpvSenha;
    }

    /**
     * @param mpvSenha the mpvSenha to set
     */
    public void setMpvSenha(String mpvSenha) {
        this.mpvSenha = mpvSenha;
    }

    /**
     * @return the mpvAtivo
     */
    public String getMpvAtivo() {
        return mpvAtivo;
    }

    /**
     * @param mpvAtivo the mpvAtivo to set
     */
    public void setMpvAtivo(String mpvAtivo) {
        this.mpvAtivo = mpvAtivo;
    }

    /**
     * Método abstrato que deve ser implementado pelas subclasses
     */
    public abstract void metodoAbstrato();

    public int getMpvIdUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}