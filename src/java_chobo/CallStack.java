package java_chobo;

public class CallStack {
    public static void main(String[] args) {
        // 🟩 스택(Stack)
        //   : 밑이 막힌 상자, 위에 차곡차곡 쌓인다.
        
        // 🟩 호출스택 (Call Stack)
        //   : 메서드 수행에 필요한 메모리가 제공되는 공간
        //     메소드가 호출되면 호출스택에 메모리 할당, 종료되면 해제

        // 🟩 싱글 스레드(Single Thread)
        //    : 하나의 스택에서는 제일 위에있는 한개의 메서드만 실행되고 나머지는 전부 대기상태!
        //      |        |                           |        |
        //      |        |                           |________|
        //      |        |                           |println |  ← 실행
        //      |________|  main()이 println()을 호출  |________|
        // 실행 →|main    |  ———————————————————————→ |main    |  ← 대기
        //      |________|                           |________|

        //      |        |                           |        |
        //      |________|                           |        |
        // 실행 →|println |                           |        |
        //      |________|      println()아 종료됨     |________|
        // 대기 →|main    |  ———————————————————————→ |main    |  ← 실행
        //      |________|                           |________|
    }
}