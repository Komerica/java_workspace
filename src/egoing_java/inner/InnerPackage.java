package egoing_java.inner;

// public class 는 하나의 파일에 하나만 있어야하고 "class 이름"이 "파일 이름"과 일치해야함!
public class InnerPackage {
    // 같은 package 안에서는 Public, Default class 전부다 접근 가능!
    PublicClass publicClass = new PublicClass();
    DefaultClass defaultClass = new DefaultClass();
}
