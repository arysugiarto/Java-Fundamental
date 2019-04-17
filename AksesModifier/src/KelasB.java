import tes.KelasA;

public class KelasB extends KelasA {
    @Override
    protected void methodeC(){
        super.methodC();

        System.out.println("Contoh [emanggilan protected dari luar peckage");
    }
}
