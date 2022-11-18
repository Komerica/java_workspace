package java_chobo;

// 🟩 접근 제어자를 사용하는 이유?
//  1. 외부로부터 데이터를 보호하기 위하여
//  2. 외부에는 불필요한, 내부적으로만 사용되는, 부분을 감추기 위해서

class Time2 {
    private int hour;   // 0 ~ 23 사이의 값을 가져야함!
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        if (isNotValidHour(hour)) return;
        this.hour = hour;
    }

    // ✔ 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
    //   ↓ ↓ Time2 class 내부에서만 쓰는 method 라 굳이 이것을 public 으로 할 필요가 없음!!
    private boolean isNotValidHour(int hour) {
        return hour < 0 || hour > 23;
    }
    // ↑ ↑ 만약 나중에 isNotValidHour 메소드 때문에 프로그램이 깨졌으면 이 method가 private 이니까
    //     에러를 잡고 이 Time2 클래스 내부에서만 테스트하면 된다!!
    //     Why? → method 가 private 이니까 이 클래스를 벗어나서 사용됐을 리가 없음!
    //     So, 처음 생성할때 접근 제어자의 범위는 최소화 시켜놓고 필요할때 확장시키는 게 국룰!!
}


public class EncapsulationDemo {
    public static void main(String[] args) {
        Time2 t = new Time2();
        t.setHour(21);
        System.out.println(t.getHour());    // 21
        t.setHour(100);
        System.out.println(t.getHour());    // 21
    }
}
