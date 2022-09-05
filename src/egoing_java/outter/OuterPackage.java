package egoing_java.outter;

import egoing_java.inner.*;

// public class 는 하나의 파일에 하나만 있어야하고 "class 이름"이 "파일 이름"과 일치해야함!
public class OuterPackage {
    PublicClass publicClass = new PublicClass();
    // DefaultClass defaultClass = new DefaultClass();
    // => Default Class 는 같은 package에서만 사용가능하다!
}
