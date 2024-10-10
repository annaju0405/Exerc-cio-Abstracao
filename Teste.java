public class Teste {
        public static void main(String[] args) {

            ProvaUCB provaUCB = new ProvaUCB(8.5, 6.5);
            ProvaFafifo provaFafifo = new ProvaFafifo(6.0, 6.0);

            System.out.println("Aluno UCB aprovado: " + provaUCB.aprovado());
            System.out.println("Aluno Fafifo aprovado: " + provaFafifo.aprovado());
        }
    }



