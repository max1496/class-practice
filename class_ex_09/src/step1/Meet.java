package step1;

interface Greet {
    void greet();
}
// 아침과 별로 연관관계가 없음 그래서 interface로 구현

interface Bye{
    void bye();
}

class morning implements Greet, Bye{

    @Override
    public void greet() {
        System.out.println("안녕하세요");
    }

    @Override
    public void bye() {
        System.out.println("안녕히 가세요");
    }
}

public class Meet {
    public static void main(String[] args) {

    }
}
