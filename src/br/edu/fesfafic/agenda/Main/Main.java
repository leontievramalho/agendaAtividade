package br.edu.fesfafic.agenda.Main;

import br.edu.fesfafic.agenda.Model.Agenda;
import br.edu.fesfafic.agenda.Model.Compromisso;

public class Main {
    public static void main(String[] args){
        Compromisso pilates = new Compromisso("Pilates", 3, 4, 2023,
                9, 0, 45);
        Compromisso reuniao = new Compromisso("Reuniao", 3, 4, 2023,
                11, 0, 60);
        Compromisso apresentacao = new Compromisso("Apresentação", 3, 4, 2023,
                11, 30, 20);
        Agenda agenda = new Agenda("Leontiev");
        agenda.addCompromisso(pilates);
        agenda.addCompromisso(reuniao);
        agenda.addCompromisso(apresentacao);
        agenda.listarCompromissos();
        agenda.removeCompromisso(pilates);
        agenda.listarCompromissos();
    }
}
