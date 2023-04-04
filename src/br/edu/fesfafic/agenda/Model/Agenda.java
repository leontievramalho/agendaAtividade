package br.edu.fesfafic.agenda.Model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    public String donoAgenda;
    public List<Compromisso> compromissos;

    public Agenda(String donoAgenda){
        this.donoAgenda = donoAgenda;
        this.compromissos = new ArrayList<>();
    }

    public void addCompromisso(Compromisso compromisso){
        boolean ocupado = false;
       for(Compromisso marcado : compromissos){
           if(marcado.getAno()==compromisso.getAno()
                   && marcado.getMes()==compromisso.getMes()
                   && marcado.getDia()==compromisso.getDia()
                   && (marcado.getHora()*60 + marcado.getMinuto() < compromisso.getHora()*60 + compromisso.getMinuto()
                   && marcado.getHora()*60 + marcado.getMinuto() + marcado.getDuracaoMin()
                   > compromisso.getHora()*60 + compromisso.getMinuto())
                   || (marcado.getHora()*60 + marcado.getMinuto() > compromisso.getHora()*60 + compromisso.getMinuto()
                   && compromisso.getHora()*60 + compromisso.getMinuto() + compromisso.getDuracaoMin()
                   > marcado.getHora()*60 + marcado.getMinuto())){
               ocupado = true;
               break;
           }
       }
       if(ocupado)
            System.out.println("A agenda nesse horário se encontra ocupada.");
       else {
           this.compromissos.add(compromisso);
           System.out.println("Novo compromisso adicionado.");
       }
    }

    public void removeCompromisso(Compromisso compromisso){
        this.compromissos.remove(compromisso);
        System.out.println("Compromisso removido.");
    }

    public void listarCompromissos(){
        for(Compromisso compromisso: this.compromissos) {
            System.out.println("Compromisso: " + compromisso.getNome() +
                    "\nData: " + compromisso.getDia() + '/' + compromisso.getMes() + '/' + compromisso.getAno() +
                    "\nHorário: " + compromisso.getHora() + 'h' + compromisso.getMinuto() +
                    "\n--------------------------------------------------------------------------");

        }
    }

    public List<Compromisso> getCompromissos(){
        return compromissos;
    }

    public void setDonoAgenda(String donoAgenda){
        this.donoAgenda = donoAgenda;
    }

    public String getDonoAgenda(){
        return donoAgenda;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "donoAgenda='" + donoAgenda + '\'' +
                ", compromissos=" + compromissos +
                '}';
    }
}
