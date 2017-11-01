
package com.vendas.model;

import java.util.Date;

public class FuncionarioModel {
    
    private int cpfFuncionario;
    private String nomeFuncionario;
    private String enderecoFuncionario;
    private String emailFuncionario;
    private String telefoneFuncionario;
    private char sexoFuncionario;
    private Date dataAdmissao;
    private Date dataSaida;
    private double salarioFuncionario;

    public FuncionarioModel() {
    }

    public FuncionarioModel(int cpfFuncionario, String nomeFuncionario, String enderecoFuncionario, String emailFuncionario, String telefoneFuncionario, char sexoFuncionario, Date dataAdmissao, Date dataSaida, double salarioFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.enderecoFuncionario = enderecoFuncionario;
        this.emailFuncionario = emailFuncionario;
        this.telefoneFuncionario = telefoneFuncionario;
        this.sexoFuncionario = sexoFuncionario;
        this.dataAdmissao = dataAdmissao;
        this.dataSaida = dataSaida;
        this.salarioFuncionario = salarioFuncionario;
    }

    public int getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(int cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getEnderecoFuncionario() {
        return enderecoFuncionario;
    }

    public void setEnderecoFuncionario(String enderecoFuncionario) {
        this.enderecoFuncionario = enderecoFuncionario;
    }

    public String getEmailFuncionario() {
        return emailFuncionario;
    }

    public void setEmailFuncionario(String emailFuncionario) {
        this.emailFuncionario = emailFuncionario;
    }

    public String getTelefoneFuncionario() {
        return telefoneFuncionario;
    }

    public void setTelefoneFuncionario(String telefoneFuncionario) {
        this.telefoneFuncionario = telefoneFuncionario;
    }

    public char getSexoFuncionario() {
        return sexoFuncionario;
    }

    public void setSexoFuncionario(char sexoFuncionario) {
        this.sexoFuncionario = sexoFuncionario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }

    public void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    @Override
    public String toString() {
        return "FuncionarioModel{" + "cpfFuncionario=" + cpfFuncionario + ", nomeFuncionario=" + nomeFuncionario + ", enderecoFuncionario=" + enderecoFuncionario + ", emailFuncionario=" + emailFuncionario + ", telefoneFuncionario=" + telefoneFuncionario + ", sexoFuncionario=" + sexoFuncionario + ", dataAdmissao=" + dataAdmissao + ", dataSaida=" + dataSaida + ", salarioFuncionario=" + salarioFuncionario + '}';
    }
    
    
}
