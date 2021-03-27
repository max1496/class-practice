class PBoard{

}

class CBoard extends PBoard{

}

public class ClassCast {
    public static void main(String[] args) {
        PBoard sbd1 = new CBoard();
        CBoard sbd2 = (CBoard)sbd1;

        System.out.println("------------");

        /*PBoard ebd1 = new PBoard();
        CBoard ebd2 = (CBoard)ebd1;
        부모 클래스 객체를 자식 클래스 객체로로 형변환 불가 - Exception 컴파일 전엔 오류를 모름
        */

    }
}
