package egoing_java.objectDemo;

class Car implements Cloneable{
    String name;
    Car (String name){
        this.name = name;
    }
    // πͺ β λ³λ€λ₯Έ μμ μ νμ§ μκ³  clone() λ©μλλ₯Ό κ·Έλλ‘ overriding ν΄μ κ°μ Έμ€λ μ΄μ ? πͺ
    //    : clone() μ "Ctrl + ν΄λ¦­" ν΄μ λ³΄λ©΄ java.lang ν¨ν€μ§μ μν΄μκ³ , μ κ·Όμ μ΄μλ protected μΈκ²μ λ³Ό μ μλ€.
    //      μ¦, λ€λ₯Έ ν¨ν€μ§(java.lang)μ μν΄ μμΌλ©΄μ μ κ·Όμ μ΄μκ° protected μΈ λ©μλμ μ κ·Όνλ €λ©΄ overriding μ ν΄μ κ°μ ν¨ν€μ§(egoing_java.objectDemo)λ‘ κ°μ ΈμμΌν¨.
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ClonePractice {
    public static void main(String[] args) {
        Car c1 = new Car("Model S");
        try {
            Car c2 = (Car) c1.clone();
            System.out.println(c1);
            System.out.println(c2);
            System.out.println(c1.name);
            System.out.println(c2.name);
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
    }

}
