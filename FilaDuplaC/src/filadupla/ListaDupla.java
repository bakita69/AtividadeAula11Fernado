
package filadupla;

public class ListaDupla {

    public static void main(String[] args) {
        DuplamenteEncadeada<String> lista = new DuplamenteEncadeada<>();
        
        //1
        lista.criar();
        lista.inserir("Homer");
        lista.inserir("Marge");
        
        System.out.println(lista);
        
        //2
        lista.remove("Homer");
        lista.remove("Marge");
        
        System.out.println(lista);
        
        //3
        lista.inserir("Homer");
        lista.inserir("Bart", 0);
        lista.inserir("Moll", 1);
        
        System.out.println(lista);
        
        //4
        lista.remove("Homer");
        lista.remove("Bart");
        lista.remove("Moll");
        
        //5
        lista.inserir("Homer");
        lista.inserir("Bart");
        lista.inserir("Lisa", 0);
        
        System.out.println(lista);
        System.out.println(lista.lenght());
        
        //6
        lista.remove("Homer");
        lista.remove("Bart");
        lista.remove("Moll");
        
        System.out.println(lista);
        
        //7
        lista.inserir("Homer");
        lista.inserir("Maggie");
        lista.inserir("Bart", 0);
        lista.inserir("Marge", 1);
        
        System.out.println(lista);
        lista.exibir("Lisa");
        
        //8
        lista.remove("Homer");
        lista.remove("Bart");
        lista.remove("Maggie");
        lista.remove("Marge");

        //9
        lista.inserir("Homer");
        lista.inserir("Bart");
        lista.inserir("Marge");
        lista.inserir("Maggie", 1);
        lista.inserir("Ned Flanders");
        lista.inserir("Sr.Burns");
        
        System.out.println(lista.lenght());
        
        //10
        lista.exibir("Marge");
        lista.exibir("Homer");
        lista.exibir("Bart");
        lista.exibir("Maggie");
        
        System.out.println(lista.lenght());
        
        //11
        lista.remove("Homer");
        lista.remove("Bart");
        lista.remove("Maggie");
        lista.remove("Marge");
        
        //12
        lista.inserir("Homer");
        lista.inserir("Bart");
        lista.inserir("Maggie", 1);
        lista.inserir("Ned Flanders", 0);
        lista.inserir("Sr.Burns");
        
        System.out.println(lista);
        
        //13
        lista.remove(5);
        System.out.println(lista);
        
        //14
        lista.remove(1);
        System.out.println(lista);
        System.out.println(lista.lenght());
        
        //15
        lista.exibir("Marge");
        lista.exibir("Homer");
        lista.exibir("Bart");
        lista.exibir("Maggie");
        System.out.println(lista.lenght);
        
        //16
        lista.remove(1);
        System.out.println(lista);
        System.out.println(lista.lenght());
        
        //17
        lista.exibir("Marge");
        lista.exibir("Homer");
        lista.exibir("Bart");
        lista.exibir("Maggie");
        System.out.println(lista);
        System.out.println(lista.lenght());
        
        //18
        lista.remove(1);
        lista.remove(2);
        lista.remove(3);
        
        System.out.println(lista);          
    }    
}
