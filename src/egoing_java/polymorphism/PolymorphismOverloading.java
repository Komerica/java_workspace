package egoing_java.polymorphism;

// π© λ€νμ±(Polymorphism)
//   : νλμ λ©μλλ ν΄λμ€κ° μμ λ μ΄κ²λ€μ΄ λ€μν λ°©λ²μΌλ‘ λμνλ κ²μ μλ―Έν¨!
// π§ λ€νμ±μ κ°μ₯ μ¬μ΄ μμ )
//   : overloading(μ€λ²λ‘λ©), Why?
//      κ°μ λ©μλμ§λ§, λ§€κ°λ³μ(parameter)κ° μ΄λ€ ννκ³  μ΄λ€ λ°μ΄ν° νμμ΄λμ λ°λΌμ λ€λ₯Έ λ©μλκ° νΈμΆλλ λ°©μ!
//      μ¦, κ°μ μ΄λ¦, λ€λ₯Έ λμ λ°©λ²μ΄λΌλ λ§₯λ½μμ λ€νμ±μ νκ°μ§ μλΌκ³  λ³Ό μ μλ€!

class O {
    public void a(int param){
        System.out.println("μ«μμΆλ ₯");
        System.out.println(param);
    }
    public void a(String param){
        System.out.println("λ¬ΈμμΆλ ₯");
        System.out.println(param);
    }
}

public class PolymorphismOverloading {
    public static void main(String[] args) {
        O o = new O();
        o.a(1);
        o.a("one");
    }
}
