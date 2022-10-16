package egoing_java;

import java.util.*;

public class Conversion {
    public static void main(String[] args) {
        ///////////////////////////////////////////////////
        // Implicit Conversion(암시적 형 변환, 자동 형 변환) //
        ///////////////////////////////////////////////////
        //  : 표현범위가 좁은 데이터 타입에서 넓은 데이터 타입으로의 변환만 허용!
        // double > float  ->  So, double에 float를 넣어도 데이터 손실이 발생X
        double a = 3.0F; // Float이지만 double a에 assign하는 순간 double이 됨!

        // float < double  ->  So, 데이터 손실이 발생할 수 있기 때문에 Error!
        // float b = 3.0;  // 3.0뒤에 아무것도 없으면 double형

        //                          단순히 byte로만 보면 long이 크지만, float의 표현 방식때문에 더 많은 수를 표현할 수 있다! (자바의정석 18강 20:00참고)
        // 🟥 형 변환이 가능한 경우                       10^19          10^38
        // byte(1byte) < short(2byte) < int(4byte) < long(8byte) < float(4byte) < double(8byte)
        //                char(2byte) < int(4byte) < long(8byte) < float(4byte) < double(8byte)

        // Ex1)
        int c = 3;
        float d = 1.0F;
        double e = c + d; // c + d = 4.0F -> double e = 4.0
        System.out.println(e);

        // Ex2)
        int x = 3;
        float y = 1.0F;
        float z = x + y; // 4.0
        System.out.println(z);

        ///////////////////////////////////////
        // Explicit Conversion(명시적 형 변환) //
        ///////////////////////////////////////
        // : 자동 형 변환이 적용되지 못한 경우에는 수동으로 형 변환을 해야한다!
        // float a = 100.0; // 100.0는 double이라 자동 형 변환이 이뤄지지 않기 때문에 에러! (Why? Double > float라서 데이터 손실!)
        // int b = 100.0F;  // 자동 형 변환이 이뤄지지 않기 때문에 에러! (Why? float > int라서 데이터 손실!)

        // 🟩 아래와 같이 명시적으로 형 변환을 해주어야함!
        float i = (float) 100.0;    // 100.0는 Double 이지만 float로 명시적으로 형 변환을 변경해주면 에러 X
        int j = (int) 100.0F;       // 100.0F는 float 이지만 int로 명시적으로 형 변환을 변경해주면 에러 X

    }
}
