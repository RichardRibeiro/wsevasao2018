/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gilson
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaAluno {

    @XmlElement(name = "aluno")
    private List<Aluno> alunos;

    public ListaAluno(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    ListaAluno() {
    }
}
