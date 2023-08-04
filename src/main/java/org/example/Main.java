package org.example;

import Pessoas.model.Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner s;

    public static void main(String[] args) {
        int id = 0;
        System.out.println("Crie um ArrayList vazio de Strings e imprima o ArrayList.?");
        s = new Scanner(System.in);
        ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
//
        for (int i = 0; i < 2; i++) {
            Pessoa pessoaAdicionada = new Pessoa();


            System.out.println("Digite seu nome: ");
            pessoaAdicionada.setNome(s.next());
            System.out.println("Digite sua idade: ");
            pessoaAdicionada.setIdade(s.nextInt());
            pessoaAdicionada.setId(id);

            listaPessoas.add(pessoaAdicionada);
            id++;
        }
//        System.out.println(listaPessoas);
//
//        for (int i = 0; i < listaPessoas.size(); i++) {
//            System.out.println(listaPessoas.get(i));
//        }

//        for (Pessoa pessoa : listaPessoas) {
//            System.out.println(pessoa);
//        }
//

//---------------------------------------------------------------------------------------
//        System.out.println("Imprima o número de elementos no ArrayList ?");
//        System.out.println(listaPessoas.size());
//

//---------------------------------------------------------------------------------------
//        System.out.println("Recupere o terceiro elemento do ArrayList. ?");
//        System.out.println("Digite o ID de 0 a 2");
//        int i = s.nextInt();
//
//        for (Pessoa pessoa : listaPessoas) {
//            if (i == pessoa.getId()) {
//                System.out.println(pessoa);
//            }
//        }

//---------------------------------------------------------------------------------------
//        System.out.println("Atualize o segundo elemento do ArrayList para um novo valor. ?");
//        System.out.println("Digite numero do ID que deseje alterar de 0 a 2");
//        int idAlterado = s.nextInt();
//
//
//        for (Pessoa pessoas : listaPessoas) {
//            ArrayList<Pessoa> listaPessoasAtualizadas = new ArrayList<>();
//            if (idAlterado >= pessoas.getId()) {
//                System.out.println("Digite seu nome: ");
//                pessoas.setNome(s.next());
//                System.out.println("Digite sua idade: ");
//                pessoas.setIdade(s.nextInt());
//                pessoas.setId(idAlterado);
//                listaPessoasAtualizadas.add(pessoas);
//            }
//            break;
//        }

//---------------------------------------------------------------------------------------
//        System.out.println("Remova o último elemento do ArrayList ?");
//        System.out.println("Digite numero do ID que deseje excluir de 0 a 2");
//        int idDeletado = s.nextInt();
//        for (Pessoa pessoas : listaPessoas) {
//
//            if (idDeletado >= pessoas.getId()) {
//                listaPessoas.remove(idDeletado);
//            }
//            break;
//        }
//
//        for (Pessoa pessoa : listaPessoas) {
//            System.out.println(pessoa);
//
//        }
//
//---------------------------------------------------------------------------------------
//        System.out.println("Verifique se um elemento específico está presente no ArrayList. ?");
//        System.out.println("Digite numero do ID que deseje encontrar de 0 a 2");
//        int idListado = s.nextInt();
//
//            if (listaPessoas.contains(idListado)) {
//                System.out.println("O ID foi encontrado" + idListado);
//            } else {
//                System.out.println("O ID nao foi encontrado");
//            }

//        for (Pessoa pessoa : listaPessoas) {
//            System.out.println(pessoa);
//
//        }

//---------------------------------------------------------------------------------------
//        System.out.println("Clone o ArrayList criado para um novo ArrayList e imprima-o. ?");
//        ArrayList<Pessoa> listaClonadaPessoas = new ArrayList<>(listaPessoas);
//
//        System.out.println( '\n'+"Lista Clonada de Pessoas"+listaClonadaPessoas);

//---------------------------------------------------------------------------------------
//        System.out.println("Converta o ArrayList em um array regular e imprima esse array. ?");
//
//        //Lembre o arry sempre e fixo porem pode ser alterado com array regular
//        Pessoa[]listaPessoaRegular = listaPessoas.toArray(new Pessoa[3]);
//
//        System.out.println("Array regulares:");
//        for (Pessoa pessoaRegular : listaPessoaRegular) {
//            System.out.println(pessoaRegular);
//        }

//---------------------------------------------------------------------------------------
//        System.out.println("Verifique se o ArrayList está vazio. ?");
//        ArrayList<Pessoa> listaPessoasVazia = new ArrayList<>(listaPessoas);
//
////        Testando para ver se funciona o codigo.
////        listaPessoasVazia.clear();
//
//        if (listaPessoasVazia.isEmpty()) {
//            System.out.println("Não existe Pessoa cadastrada.");
//        } else {
//            System.out.println("Existe Pessoa cadastrada..");
//        }


    }
}
