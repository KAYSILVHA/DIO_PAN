import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------------------------------------");
        System.out.println("--\tOrdem inserção\t--");
        Set<LinguagemFavorita> linguagemFavorita = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java",1991,"Intellij"));
            add(new LinguagemFavorita("Python", 1991, "PyCharm"));
            add(new LinguagemFavorita("JavaScript",1995, "VSCode" ));
        }};
        for (LinguagemFavorita linguagemFavorita1: linguagemFavorita) System.out.println(linguagemFavorita1.getNome() + " - "
                + linguagemFavorita1.getAnodeCriacao() + " - " + linguagemFavorita1.getIde());


        System.out.println("---------------------------------------");
        System.out.println("--\tOrdem Natural(Nome)\t--");

        Set<LinguagemFavorita> linguagemFavorita2 = new TreeSet<>(new ComparatorNome());
        linguagemFavorita2.addAll(linguagemFavorita);
        for (LinguagemFavorita linguagemFavorita1 : linguagemFavorita2) System.out.println(linguagemFavorita1.getNome() + " - "
                + linguagemFavorita1.getAnodeCriacao() + " - " + linguagemFavorita1.getIde());

       System.out.println("---------------------------------------");
       System.out.println("--\tIde\t--");

        Set<LinguagemFavorita> linguagemFavorita3 = new TreeSet<>(new ComparatorIde());
        linguagemFavorita3.addAll(linguagemFavorita);
        for (LinguagemFavorita linguagemFavorita1 : linguagemFavorita3) System.out.println(linguagemFavorita1.getNome() + " - "
                + linguagemFavorita1.getAnodeCriacao() + " - " + linguagemFavorita1.getIde());

        System.out.println("---------------------------------------");
        System.out.println("--\tAnoDeCriacao/Nome\t--");

        Set<LinguagemFavorita> linguagemFavorita4 = new TreeSet<>(new ComparatorAnoDeCriacaoNome());
        linguagemFavorita4.addAll(linguagemFavorita);
        for(LinguagemFavorita linguagemFavorita1 : linguagemFavorita4) System.out.println(linguagemFavorita1.getNome() + " - "
                        + linguagemFavorita1.getAnodeCriacao() + " - " + linguagemFavorita1.getIde());

        System.out.println("---------------------------------------");
        System.out.println("--\tNome/AnoDeCriacao/Ide\t--");

        Set<LinguagemFavorita> linguagemFavorita5 = new TreeSet<>(new ComparatorNomeAnoDeCriacaoIde());
        linguagemFavorita5.addAll(linguagemFavorita);
        for(LinguagemFavorita linguagemFavorita1 : linguagemFavorita5) System.out.println(linguagemFavorita1.getNome() + " - "
                        + linguagemFavorita1.getAnodeCriacao() + " - " + linguagemFavorita1.getIde());



    }
}

class ComparatorNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getNome().compareTo(l2.getNome());
    }
    }
class ComparatorIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getIde().compareTo(l2.getIde());
    }
}

class ComparatorAnoDeCriacaoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int ano = l1.getAnodeCriacao().compareTo(l2.getAnodeCriacao());
        if (ano != 0) return ano;

        return l1.getNome().compareTo(l2.getNome());
    }
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareTo(l2.getNome());
        if (nome != 0) return nome;

        int ano = l1.getAnodeCriacao().compareTo(l2.getAnodeCriacao());
        if(ano != 0) return ano;

        return l1.getIde().compareTo(l2.getIde());
    }
}


