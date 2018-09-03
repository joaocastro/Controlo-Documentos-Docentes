package controloDocumentoDocentes;

import dadosFichaRegisto.FichaRegisto;
import dadosFichaRegisto.Professor;
import dadosFichaRegisto.unidadeCurricular;
import secretariado.*;
import database.*;

class CDD {
public static void main(String[] args) {
		Professor prof = new Professor("ana");
		unidadeCurricular uni = new unidadeCurricular("lpoo",prof);
        FichaRegisto ficha = new FichaRegisto(prof, uni,1,1,"aa");
        
        FichaDatabase data = new FichaDatabase();
        data.writing(ficha.getObservacoes());
    }

}