package br.edu.fesfafic.agenda.Model;

public class Compromisso {
    public String nome;
    public int dia;
    public int mes;
    public int ano;
    public int hora;
    public int minuto;
    public int duracaoMin;

    public Compromisso(String nome, int dia, int mes, int ano, int hora, int minuto, int duracaoMin){
        this.nome = nome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
        this.minuto = minuto;
        this.duracaoMin = duracaoMin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getDuracaoMin() {
        return duracaoMin;
    }

    public void setDuracaoMin(int duracaoMin) {
        this.duracaoMin = duracaoMin;
    }

    @Override
    public String toString() {
        return "Compromisso{" +
                "nome='" + nome + '\'' +
                ", dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +
                ", hora=" + hora +
                ", minuto=" + minuto +
                '}';
    }
}
